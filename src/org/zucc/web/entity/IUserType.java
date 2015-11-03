package org.zucc.web.entity;

import java.io.Serializable;

public class IUserType implements Serializable {
    private Long utId;

    private String utName;

    private static final long serialVersionUID = 1L;

    public Long getUtId() {
        return utId;
    }

    public void setUtId(Long utId) {
        this.utId = utId;
    }

    public String getUtName() {
        return utName;
    }

    public void setUtName(String utName) {
        this.utName = utName == null ? null : utName.trim();
    }
}