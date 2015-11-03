package org.zucc.web.entity;

import java.io.Serializable;

public class IProject implements Serializable {
    private Long pid;

    private String pname;

    private String pdescription;

    private Long pTeacherid;

    private static final long serialVersionUID = 1L;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription == null ? null : pdescription.trim();
    }

    public Long getpTeacherid() {
        return pTeacherid;
    }

    public void setpTeacherid(Long pTeacherid) {
        this.pTeacherid = pTeacherid;
    }
}