package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class ISharing implements Serializable {
    private Long sid;

    private Long sUserid;

    private Long sCourseid;

    private Date sCreatetime;

    private String sUrl;

    private static final long serialVersionUID = 1L;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getsUserid() {
        return sUserid;
    }

    public void setsUserid(Long sUserid) {
        this.sUserid = sUserid;
    }

    public Long getsCourseid() {
        return sCourseid;
    }

    public void setsCourseid(Long sCourseid) {
        this.sCourseid = sCourseid;
    }

    public Date getsCreatetime() {
        return sCreatetime;
    }

    public void setsCreatetime(Date sCreatetime) {
        this.sCreatetime = sCreatetime;
    }

    public String getsUrl() {
        return sUrl;
    }

    public void setsUrl(String sUrl) {
        this.sUrl = sUrl == null ? null : sUrl.trim();
    }
}