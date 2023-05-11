package com.bupt.dailyhaha.service;

import com.bupt.dailyhaha.pojo.BBSRecord;

import java.util.List;

public interface BBSTask {
    boolean create(BBSRecord.Post post);

    List<BBSRecord> getTasks(BBSRecord.Status status);

    boolean setStatus(String id, BBSRecord.Status status);
}
