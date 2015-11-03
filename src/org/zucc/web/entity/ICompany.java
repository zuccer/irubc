package org.zucc.web.entity;

import java.io.Serializable;

public class ICompany implements Serializable {
    private Long companyid;

    private String companyname;

    private String companyimage;

    private static final long serialVersionUID = 1L;

    public Long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Long companyid) {
        this.companyid = companyid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanyimage() {
        return companyimage;
    }

    public void setCompanyimage(String companyimage) {
        this.companyimage = companyimage == null ? null : companyimage.trim();
    }
}