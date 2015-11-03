package org.zucc.web.entity;

import java.io.Serializable;

public class IAccount implements Serializable {
    private Long aid;

    private Long aUserid;

    private Double aMoney;

    private Double aRewardMoney;

    private static final long serialVersionUID = 1L;

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public Long getaUserid() {
        return aUserid;
    }

    public void setaUserid(Long aUserid) {
        this.aUserid = aUserid;
    }

    public Double getaMoney() {
        return aMoney;
    }

    public void setaMoney(Double aMoney) {
        this.aMoney = aMoney;
    }

    public Double getaRewardMoney() {
        return aRewardMoney;
    }

    public void setaRewardMoney(Double aRewardMoney) {
        this.aRewardMoney = aRewardMoney;
    }
}