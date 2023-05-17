package com.bupt.dailyhaha.controller.submission;

import com.bupt.dailyhaha.pojo.common.PageResult;
import com.bupt.dailyhaha.pojo.common.ResultData;
import com.bupt.dailyhaha.pojo.common.ReturnCode;
import com.bupt.dailyhaha.service.Interface.History;
import com.bupt.dailyhaha.service.Interface.Submission;
import com.bupt.dailyhaha.service.SysConfigService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/submission")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class SubUser {

    final Submission service;

    final History history;

    final SysConfigService sysConfig;


    /**
     * upload file
     *
     * @param file     file,非必须
     * @param uri      uri,可能是一个url,将来会被嵌入到iframe中
     * @param mime     mime,type
     * @param personal personal or not
     * @return ResultData
     * @throws IOException IOException
     */
    @PostMapping("")
    public ResultData<com.bupt.dailyhaha.pojo.media.Submission> upload(MultipartFile file, String uri, String mime, boolean personal) throws IOException {
        if (mime == null || mime.isEmpty()) {
            return ResultData.fail(ReturnCode.RC400);
        }
        // file is null and uri is null,bad request
        if (file == null && uri == null) {
            return ResultData.fail(ReturnCode.RC400);
        }
        if (mime.startsWith("text")) {
            return ResultData.success(service.storeTextFormatSubmission(uri, mime));
        }
        if (file == null) {
            return ResultData.fail(ReturnCode.RC400);
        }
        InputStream inputStream = file.getInputStream();
        com.bupt.dailyhaha.pojo.media.Submission store = service.storeStreamSubmission(inputStream, mime, personal);
        return store == null ? ResultData.fail(ReturnCode.RC500) : ResultData.success(store);
    }

    /**
     * 获取置顶
     */
    @GetMapping("/top")
    public ResultData<Set<com.bupt.dailyhaha.pojo.media.Submission>> getTop() {
        return ResultData.success(sysConfig.getTop());
    }

    /**
     * 点赞或者踩
     *
     * @param hash hash
     * @param up   up or down
     * @return ResultData
     */

    @PostMapping("/vote/{hash}/{up}")
    public ResultData<Boolean> vote(@PathVariable("hash") int hash, @PathVariable("up") boolean up) {
        return ResultData.success(service.vote(hash, up));
    }

    @GetMapping("/page")
    public ResultData<PageResult<com.bupt.dailyhaha.pojo.media.Submission>> getSubmissionByPage(int pageNum, int pageSize, String lastID) {
        return ResultData.success(service.getSubmissionByPage(pageNum, pageSize, lastID));
    }

    /**
     * 获取所有的历史日期
     *
     * @return ResultData
     */
    @GetMapping("/history")
    public ResultData<List<String>> getHistory() {
        return ResultData.success(history.getHistoryDates(sysConfig.getMaxHistory()));
    }

    /**
     * 获取某一天的提交
     *
     * @param date 日期 YYYY-MM-DD
     * @return ResultData
     */
    @GetMapping("/{date}")
    public ResultData<List<com.bupt.dailyhaha.pojo.media.Submission>> getSubmission(@PathVariable("date") String date) {
        return ResultData.success(history.getHistory(date));
    }

}
