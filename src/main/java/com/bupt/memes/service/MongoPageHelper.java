package com.bupt.memes.service;


import com.bupt.memes.model.common.PageResult;
import io.micrometer.common.util.StringUtils;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * MongoDB分页查询工具类.
 *
 * @author wanz
 **/
@Component
public class MongoPageHelper {

    public static final String ID = "_id";
    private final MongoTemplate mongoTemplate;

    @Autowired
    public MongoPageHelper(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }


    /**
     * 分页查询，直接返回集合类型的结果.
     */
    public <T> PageResult<T> pageQuery(Query query, Class<T> entityClass, Integer pageSize, String lastId) {
        return pageQuery(query, entityClass, Function.identity(), pageSize, lastId);
    }


    /**
     * 分页查询.
     *
     * @param query       Mongo Query对象，构造你自己的查询条件.
     * @param entityClass Mongo collection定义的entity class，用来确定查询哪个集合.
     * @param mapper      映射器，你从db查出来的list的元素类型是entityClass, 如果你想要转换成另一个对象，比如去掉敏感字段等，可以使用mapper来决定如何转换.
     * @param pageSize    分页的大小.
     * @param lastId      条件分页参数, 区别于skip-limit，采用find(_id<lastId).limit分页.
     *                    如果不跳页，像朋友圈，微博这样下拉刷新的分页需求，需要传递上一页的最后一条记录的ObjectId。 如果是null，则返回pageNum那一页.
     * @param <T>         collection定义的class类型.
     * @param <R>         最终返回时，展现给页面时的一条记录的类型。
     * @return PageResult, 一个封装page信息的对象.
     */
    public <T, R> PageResult<R> pageQuery(Query query, Class<T> entityClass, Function<T, R> mapper, Integer pageSize, String lastId) {
        Criteria criteria = new Criteria();

        // if it has lastId, means skip page
        if (StringUtils.isNotBlank(lastId)) {
            criteria.and(ID).lt(new ObjectId(lastId));
        }
        Criteria.where("deleted").ne(true);

        Query q = query.addCriteria(criteria)
                .with(Sort.by(Sort.Direction.DESC, ID))
                .limit(pageSize);

        List<T> entityList = mongoTemplate.find(q, entityClass);

        PageResult<R> pageResult = new PageResult<>();
        pageResult.setPageSize(pageSize);
        pageResult.setList(entityList.stream().map(mapper).collect(Collectors.toList()));
        return pageResult;

    }

}
