package org.zucc.web.entity;

import java.io.Serializable;

public class IColletion implements Serializable {
    private Long collectionid;

    private Long colletionUserid;

    private Long colletionCourseId;

    private static final long serialVersionUID = 1L;

    public Long getCollectionid() {
        return collectionid;
    }

    public void setCollectionid(Long collectionid) {
        this.collectionid = collectionid;
    }

    public Long getColletionUserid() {
        return colletionUserid;
    }

    public void setColletionUserid(Long colletionUserid) {
        this.colletionUserid = colletionUserid;
    }

    public Long getColletionCourseId() {
        return colletionCourseId;
    }

    public void setColletionCourseId(Long colletionCourseId) {
        this.colletionCourseId = colletionCourseId;
    }
}