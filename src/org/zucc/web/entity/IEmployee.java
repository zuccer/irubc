package org.zucc.web.entity;

import java.io.Serializable;

public class IEmployee implements Serializable {
    private Long eid;

    private Long eUserid;

    private Long eCompanyid;

    private String ePosition;

    private static final long serialVersionUID = 1L;

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public Long geteUserid() {
        return eUserid;
    }

    public void seteUserid(Long eUserid) {
        this.eUserid = eUserid;
    }

    public Long geteCompanyid() {
        return eCompanyid;
    }

    public void seteCompanyid(Long eCompanyid) {
        this.eCompanyid = eCompanyid;
    }

    public String getePosition() {
        return ePosition;
    }

    public void setePosition(String ePosition) {
        this.ePosition = ePosition == null ? null : ePosition.trim();
    }
}