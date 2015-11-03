package org.zucc.web.entity;

import java.io.Serializable;

public class IReward implements Serializable {
    private Long rid;

    private Long rTeacherid;

    private Long rCourseid;

    private Boolean rState;

    private Double rMoney;

    private static final long serialVersionUID = 1L;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getrTeacherid() {
        return rTeacherid;
    }

    public void setrTeacherid(Long rTeacherid) {
        this.rTeacherid = rTeacherid;
    }

    public Long getrCourseid() {
        return rCourseid;
    }

    public void setrCourseid(Long rCourseid) {
        this.rCourseid = rCourseid;
    }

    public Boolean getrState() {
        return rState;
    }

    public void setrState(Boolean rState) {
        this.rState = rState;
    }

    public Double getrMoney() {
        return rMoney;
    }

    public void setrMoney(Double rMoney) {
        this.rMoney = rMoney;
    }
}