package org.zucc.web.entity;

import java.io.Serializable;

public class ITeacher implements Serializable {
    private Long tid;

    private Long tUserid;

    private String tImage;

    private Long tTypeid;

    private String tCardImage;

    private String tSimpleDescription;

    private String tDescription;

    private String tTags;

    private String tCertificateimage;

    private Integer tTage;

    private String tRealName;

    private String tContact;

    private Boolean tState;

    private static final long serialVersionUID = 1L;

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long gettUserid() {
        return tUserid;
    }

    public void settUserid(Long tUserid) {
        this.tUserid = tUserid;
    }

    public String gettImage() {
        return tImage;
    }

    public void settImage(String tImage) {
        this.tImage = tImage == null ? null : tImage.trim();
    }

    public Long gettTypeid() {
        return tTypeid;
    }

    public void settTypeid(Long tTypeid) {
        this.tTypeid = tTypeid;
    }

    public String gettCardImage() {
        return tCardImage;
    }

    public void settCardImage(String tCardImage) {
        this.tCardImage = tCardImage == null ? null : tCardImage.trim();
    }

    public String gettSimpleDescription() {
        return tSimpleDescription;
    }

    public void settSimpleDescription(String tSimpleDescription) {
        this.tSimpleDescription = tSimpleDescription == null ? null : tSimpleDescription.trim();
    }

    public String gettDescription() {
        return tDescription;
    }

    public void settDescription(String tDescription) {
        this.tDescription = tDescription == null ? null : tDescription.trim();
    }

    public String gettTags() {
        return tTags;
    }

    public void settTags(String tTags) {
        this.tTags = tTags == null ? null : tTags.trim();
    }

    public String gettCertificateimage() {
        return tCertificateimage;
    }

    public void settCertificateimage(String tCertificateimage) {
        this.tCertificateimage = tCertificateimage == null ? null : tCertificateimage.trim();
    }

    public Integer gettTage() {
        return tTage;
    }

    public void settTage(Integer tTage) {
        this.tTage = tTage;
    }

    public String gettRealName() {
        return tRealName;
    }

    public void settRealName(String tRealName) {
        this.tRealName = tRealName == null ? null : tRealName.trim();
    }

    public String gettContact() {
        return tContact;
    }

    public void settContact(String tContact) {
        this.tContact = tContact == null ? null : tContact.trim();
    }

    public Boolean gettState() {
        return tState;
    }

    public void settState(Boolean tState) {
        this.tState = tState;
    }
}