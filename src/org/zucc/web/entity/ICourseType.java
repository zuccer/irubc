package org.zucc.web.entity;

import java.io.Serializable;

public class ICourseType implements Serializable {
    private Long courseTypeId;

    private String courseTypeName;

    private static final long serialVersionUID = 1L;

    public Long getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(Long courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName == null ? null : courseTypeName.trim();
    }
}