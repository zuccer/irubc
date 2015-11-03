package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class Admin implements Serializable {
    private Long adminid;

    private String adminname;

    private String adminpwd;

    private Date admincreatetime;

    private static final long serialVersionUID = 1L;

    public Long getAdminid() {
        return adminid;
    }

    public void setAdminid(Long adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd == null ? null : adminpwd.trim();
    }

    public Date getAdmincreatetime() {
        return admincreatetime;
    }

    public void setAdmincreatetime(Date admincreatetime) {
        this.admincreatetime = admincreatetime;
    }
}