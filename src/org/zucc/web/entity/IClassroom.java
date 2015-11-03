package org.zucc.web.entity;

import java.io.Serializable;

public class IClassroom implements Serializable {
    private Long classroomId;

    private String classroomAddress;

    private Integer classroomCapacity;

    private static final long serialVersionUID = 1L;

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public String getClassroomAddress() {
        return classroomAddress;
    }

    public void setClassroomAddress(String classroomAddress) {
        this.classroomAddress = classroomAddress == null ? null : classroomAddress.trim();
    }

    public Integer getClassroomCapacity() {
        return classroomCapacity;
    }

    public void setClassroomCapacity(Integer classroomCapacity) {
        this.classroomCapacity = classroomCapacity;
    }
}