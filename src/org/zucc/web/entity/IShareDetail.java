package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class IShareDetail implements Serializable {
    private Long shareDetailId;

    private Long shareUseid;

    private Long shareCourseid;

    private Long shareEnrollId;

    private Date shareCreatetime;

    private Boolean shareMoneyState;

    private static final long serialVersionUID = 1L;

    public Long getShareDetailId() {
        return shareDetailId;
    }

    public void setShareDetailId(Long shareDetailId) {
        this.shareDetailId = shareDetailId;
    }

    public Long getShareUseid() {
        return shareUseid;
    }

    public void setShareUseid(Long shareUseid) {
        this.shareUseid = shareUseid;
    }

    public Long getShareCourseid() {
        return shareCourseid;
    }

    public void setShareCourseid(Long shareCourseid) {
        this.shareCourseid = shareCourseid;
    }

    public Long getShareEnrollId() {
        return shareEnrollId;
    }

    public void setShareEnrollId(Long shareEnrollId) {
        this.shareEnrollId = shareEnrollId;
    }

    public Date getShareCreatetime() {
        return shareCreatetime;
    }

    public void setShareCreatetime(Date shareCreatetime) {
        this.shareCreatetime = shareCreatetime;
    }

    public Boolean getShareMoneyState() {
        return shareMoneyState;
    }

    public void setShareMoneyState(Boolean shareMoneyState) {
        this.shareMoneyState = shareMoneyState;
    }
}