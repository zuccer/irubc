package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class IAnnouncement implements Serializable {
    private Long announcementId;

    private String announcementImage;

    private String announcementUrl;

    private String announcementDescription;

    private Date announcementCreatetime;

    private Long announcementAdminId;

    private static final long serialVersionUID = 1L;

    public Long getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Long announcementId) {
        this.announcementId = announcementId;
    }

    public String getAnnouncementImage() {
        return announcementImage;
    }

    public void setAnnouncementImage(String announcementImage) {
        this.announcementImage = announcementImage == null ? null : announcementImage.trim();
    }

    public String getAnnouncementUrl() {
        return announcementUrl;
    }

    public void setAnnouncementUrl(String announcementUrl) {
        this.announcementUrl = announcementUrl == null ? null : announcementUrl.trim();
    }

    public String getAnnouncementDescription() {
        return announcementDescription;
    }

    public void setAnnouncementDescription(String announcementDescription) {
        this.announcementDescription = announcementDescription == null ? null : announcementDescription.trim();
    }

    public Date getAnnouncementCreatetime() {
        return announcementCreatetime;
    }

    public void setAnnouncementCreatetime(Date announcementCreatetime) {
        this.announcementCreatetime = announcementCreatetime;
    }

    public Long getAnnouncementAdminId() {
        return announcementAdminId;
    }

    public void setAnnouncementAdminId(Long announcementAdminId) {
        this.announcementAdminId = announcementAdminId;
    }
}