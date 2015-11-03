package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class IIntegral implements Serializable {
    private Long iid;

    private Long iUserid;

    private Integer iValue;

    private Date iGettime;

    private Long iCourseid;

    private static final long serialVersionUID = 1L;

    public Long getIid() {
        return iid;
    }

    public void setIid(Long iid) {
        this.iid = iid;
    }

    public Long getiUserid() {
        return iUserid;
    }

    public void setiUserid(Long iUserid) {
        this.iUserid = iUserid;
    }

    public Integer getiValue() {
        return iValue;
    }

    public void setiValue(Integer iValue) {
        this.iValue = iValue;
    }

    public Date getiGettime() {
        return iGettime;
    }

    public void setiGettime(Date iGettime) {
        this.iGettime = iGettime;
    }

    public Long getiCourseid() {
        return iCourseid;
    }

    public void setiCourseid(Long iCourseid) {
        this.iCourseid = iCourseid;
    }
}