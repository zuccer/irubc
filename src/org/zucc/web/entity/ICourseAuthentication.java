package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class ICourseAuthentication implements Serializable {
    private Long courseAuthenticationId;

    private Long courseAuthenticationCourseid;

    private Boolean courseAuthenticationState;

    private Date courseAuthenticationUpdatetime;

    private Long courseAuthenticationAdminid;

    private static final long serialVersionUID = 1L;

    public Long getCourseAuthenticationId() {
        return courseAuthenticationId;
    }

    public void setCourseAuthenticationId(Long courseAuthenticationId) {
        this.courseAuthenticationId = courseAuthenticationId;
    }

    public Long getCourseAuthenticationCourseid() {
        return courseAuthenticationCourseid;
    }

    public void setCourseAuthenticationCourseid(Long courseAuthenticationCourseid) {
        this.courseAuthenticationCourseid = courseAuthenticationCourseid;
    }

    public Boolean getCourseAuthenticationState() {
        return courseAuthenticationState;
    }

    public void setCourseAuthenticationState(Boolean courseAuthenticationState) {
        this.courseAuthenticationState = courseAuthenticationState;
    }

    public Date getCourseAuthenticationUpdatetime() {
        return courseAuthenticationUpdatetime;
    }

    public void setCourseAuthenticationUpdatetime(Date courseAuthenticationUpdatetime) {
        this.courseAuthenticationUpdatetime = courseAuthenticationUpdatetime;
    }

    public Long getCourseAuthenticationAdminid() {
        return courseAuthenticationAdminid;
    }

    public void setCourseAuthenticationAdminid(Long courseAuthenticationAdminid) {
        this.courseAuthenticationAdminid = courseAuthenticationAdminid;
    }
}