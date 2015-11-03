package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class IAccountDetail implements Serializable {
    private Long accountDetailId;

    private Long accountId;

    private Double accountMoney;

    private Date accountCreatetime;

    private Boolean accountState;

    private Boolean accountType;

    private static final long serialVersionUID = 1L;

    public Long getAccountDetailId() {
        return accountDetailId;
    }

    public void setAccountDetailId(Long accountDetailId) {
        this.accountDetailId = accountDetailId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(Double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public Date getAccountCreatetime() {
        return accountCreatetime;
    }

    public void setAccountCreatetime(Date accountCreatetime) {
        this.accountCreatetime = accountCreatetime;
    }

    public Boolean getAccountState() {
        return accountState;
    }

    public void setAccountState(Boolean accountState) {
        this.accountState = accountState;
    }

    public Boolean getAccountType() {
        return accountType;
    }

    public void setAccountType(Boolean accountType) {
        this.accountType = accountType;
    }
}