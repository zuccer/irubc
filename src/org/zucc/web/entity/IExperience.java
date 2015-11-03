package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class IExperience implements Serializable {
    private Long expid;

    private Long expUserid;

    private Date expStartdate;

    private Date expEnddate;

    private String expDescription;

    private static final long serialVersionUID = 1L;

    public Long getExpid() {
        return expid;
    }

    public void setExpid(Long expid) {
        this.expid = expid;
    }

    public Long getExpUserid() {
        return expUserid;
    }

    public void setExpUserid(Long expUserid) {
        this.expUserid = expUserid;
    }

    public Date getExpStartdate() {
        return expStartdate;
    }

    public void setExpStartdate(Date expStartdate) {
        this.expStartdate = expStartdate;
    }

    public Date getExpEnddate() {
        return expEnddate;
    }

    public void setExpEnddate(Date expEnddate) {
        this.expEnddate = expEnddate;
    }

    public String getExpDescription() {
        return expDescription;
    }

    public void setExpDescription(String expDescription) {
        this.expDescription = expDescription == null ? null : expDescription.trim();
    }
}