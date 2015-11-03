package org.zucc.web.entity;

import java.io.Serializable;

public class ITeacherTag implements Serializable {
    private Long tagid;

    private String tagname;

    private static final long serialVersionUID = 1L;

    public Long getTagid() {
        return tagid;
    }

    public void setTagid(Long tagid) {
        this.tagid = tagid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }
}