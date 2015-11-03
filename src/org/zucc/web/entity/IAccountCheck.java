package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class IAccountCheck implements Serializable {
    private Long accountCheckId;

    private Long accountCheckAccountid;

    private Double accountCheckMoney;

    private Boolean accountCheckState;

    private Date accountCheckTime;

    private static final long serialVersionUID = 1L;

    public Long getAccountCheckId() {
        return accountCheckId;
    }

    public void setAccountCheckId(Long accountCheckId) {
        this.accountCheckId = accountCheckId;
    }

    public Long getAccountCheckAccountid() {
        return accountCheckAccountid;
    }

    public void setAccountCheckAccountid(Long accountCheckAccountid) {
        this.accountCheckAccountid = accountCheckAccountid;
    }

    public Double getAccountCheckMoney() {
        return accountCheckMoney;
    }

    public void setAccountCheckMoney(Double accountCheckMoney) {
        this.accountCheckMoney = accountCheckMoney;
    }

    public Boolean getAccountCheckState() {
        return accountCheckState;
    }

    public void setAccountCheckState(Boolean accountCheckState) {
        this.accountCheckState = accountCheckState;
    }

    public Date getAccountCheckTime() {
        return accountCheckTime;
    }

    public void setAccountCheckTime(Date accountCheckTime) {
        this.accountCheckTime = accountCheckTime;
    }
}