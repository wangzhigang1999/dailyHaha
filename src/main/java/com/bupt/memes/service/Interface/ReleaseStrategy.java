package com.bupt.memes.service.Interface;

import com.bupt.memes.model.media.Submission;

import java.util.List;

public interface ReleaseStrategy {
    List<Submission> release(List<Submission> currentSubmissions, List<Submission> newSubmissions);
}
