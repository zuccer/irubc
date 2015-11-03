package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class ICoupon implements Serializable {
    private Long couponid;

    private Double couponmoney;

    private Date couponenddate;

    private Long couponUserid;

    private static final long serialVersionUID = 1L;

    public Long getCouponid() {
        return couponid;
    }

    public void setCouponid(Long couponid) {
        this.couponid = couponid;
    }

    public Double getCouponmoney() {
        return couponmoney;
    }

    public void setCouponmoney(Double couponmoney) {
        this.couponmoney = couponmoney;
    }

    public Date getCouponenddate() {
        return couponenddate;
    }

    public void setCouponenddate(Date couponenddate) {
        this.couponenddate = couponenddate;
    }

    public Long getCouponUserid() {
        return couponUserid;
    }

    public void setCouponUserid(Long couponUserid) {
        this.couponUserid = couponUserid;
    }
}