package org.zucc.web.entity;

import java.io.Serializable;

public class ITeacherType implements Serializable {
    private Long typeid;

    private String typename;

    private static final long serialVersionUID = 1L;

    public Long getTypeid() {
        return typeid;
    }

    public void setTypeid(Long typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}