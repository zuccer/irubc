package org.zucc.web.entity;

import java.io.Serializable;

public class IHr implements Serializable {
    private Long hrid;

    private Long hUserid;

    private Long hCompanyid;

    private String hPosition;

    private static final long serialVersionUID = 1L;

    public Long getHrid() {
        return hrid;
    }

    public void setHrid(Long hrid) {
        this.hrid = hrid;
    }

    public Long gethUserid() {
        return hUserid;
    }

    public void sethUserid(Long hUserid) {
        this.hUserid = hUserid;
    }

    public Long gethCompanyid() {
        return hCompanyid;
    }

    public void sethCompanyid(Long hCompanyid) {
        this.hCompanyid = hCompanyid;
    }

    public String gethPosition() {
        return hPosition;
    }

    public void sethPosition(String hPosition) {
        this.hPosition = hPosition == null ? null : hPosition.trim();
    }
}