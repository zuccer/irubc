package org.zucc.web.entity;

import java.io.Serializable;

public class IFeedback implements Serializable {
    private Long feedbackId;

    private Long feedbackUserId;

    private String feedbackDetail;

    private static final long serialVersionUID = 1L;

    public Long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Long getFeedbackUserId() {
        return feedbackUserId;
    }

    public void setFeedbackUserId(Long feedbackUserId) {
        this.feedbackUserId = feedbackUserId;
    }

    public String getFeedbackDetail() {
        return feedbackDetail;
    }

    public void setFeedbackDetail(String feedbackDetail) {
        this.feedbackDetail = feedbackDetail == null ? null : feedbackDetail.trim();
    }
}