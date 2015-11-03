package org.zucc.web.entity;

import java.io.Serializable;

public class ICard implements Serializable {
    private Long cardid;

    private Integer cardnum;

    private Long accountAid;

    private static final long serialVersionUID = 1L;

    public Long getCardid() {
        return cardid;
    }

    public void setCardid(Long cardid) {
        this.cardid = cardid;
    }

    public Integer getCardnum() {
        return cardnum;
    }

    public void setCardnum(Integer cardnum) {
        this.cardnum = cardnum;
    }

    public Long getAccountAid() {
        return accountAid;
    }

    public void setAccountAid(Long accountAid) {
        this.accountAid = accountAid;
    }
}