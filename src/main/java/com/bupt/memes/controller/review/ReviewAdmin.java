package com.bupt.memes.controller.review;

import com.bupt.memes.anno.AuthRequired;
import com.bupt.memes.model.common.ResultData;
import com.bupt.memes.model.media.Submission;
import com.bupt.memes.service.Interface.Review;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/review")
@CrossOrigin(origins = "*")
public class ReviewAdmin {
    final Review service;

    public ReviewAdmin(Review service) {
        this.service = service;
    }

    /**
     * 获取所有待审核的提交
     *
     * @return ResultData
     */
    @GetMapping("")
    @AuthRequired
    public ResultData<List<Submission>> all() {
        return ResultData.success(service.listSubmissions());
    }

    /**
     * 接受某个投稿
     *
     * @param hashcode 投稿的hashcode
     * @return ResultData
     */
    @PostMapping("/accept/{hashcode}")
    @AuthRequired
    public ResultData<Boolean> accept(@PathVariable("hashcode") int hashcode) {
        return ResultData.success(service.acceptSubmission(hashcode));
    }

    /**
     * 拒绝某个投稿
     *
     * @param hashcode 投稿的hashcode
     * @return ResultData
     */
    @PostMapping("/reject/{hashcode}")
    @AuthRequired
    public ResultData<Boolean> reject(@PathVariable("hashcode") int hashcode) {
        return ResultData.success(service.rejectSubmission(hashcode));
    }

    /**
     * 批量接受投稿
     *
     * @param hashcode 投稿的hashcode
     * @return ResultData
     */
    @PostMapping("/accept/batch")
    @AuthRequired
    public ResultData<Integer> batchAccept(@RequestBody List<Integer> hashcode) {
        return ResultData.success(service.batchAcceptSubmission(hashcode));
    }


    /**
     * 今日投稿的统计信息
     */
    @GetMapping("/statistic")
    @AuthRequired
    public ResultData<Map<String, Integer>> today() {
        return ResultData.success(service.getTodayInfo());
    }
}
