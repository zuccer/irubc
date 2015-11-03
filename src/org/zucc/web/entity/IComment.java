package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class IComment implements Serializable {
    private Long commentid;

    private Long commentCourseid;

    private Long commentUserid;

    private String commentDescription;

    private Date commentCreatetime;

    private Integer commentCourseScore;

    private static final long serialVersionUID = 1L;

    public Long getCommentid() {
        return commentid;
    }

    public void setCommentid(Long commentid) {
        this.commentid = commentid;
    }

    public Long getCommentCourseid() {
        return commentCourseid;
    }

    public void setCommentCourseid(Long commentCourseid) {
        this.commentCourseid = commentCourseid;
    }

    public Long getCommentUserid() {
        return commentUserid;
    }

    public void setCommentUserid(Long commentUserid) {
        this.commentUserid = commentUserid;
    }

    public String getCommentDescription() {
        return commentDescription;
    }

    public void setCommentDescription(String commentDescription) {
        this.commentDescription = commentDescription == null ? null : commentDescription.trim();
    }

    public Date getCommentCreatetime() {
        return commentCreatetime;
    }

    public void setCommentCreatetime(Date commentCreatetime) {
        this.commentCreatetime = commentCreatetime;
    }

    public Integer getCommentCourseScore() {
        return commentCourseScore;
    }

    public void setCommentCourseScore(Integer commentCourseScore) {
        this.commentCourseScore = commentCourseScore;
    }
}