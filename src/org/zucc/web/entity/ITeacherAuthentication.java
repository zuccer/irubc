package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class ITeacherAuthentication implements Serializable {
    private Long tAuthenticationId;

    private Long tAuthenticationTid;

    private Boolean tAuthenticationState;

    private Date tAuthenticationUpdatetime;

    private Long tAuthenticationAdminid;

    private static final long serialVersionUID = 1L;

    public Long gettAuthenticationId() {
        return tAuthenticationId;
    }

    public void settAuthenticationId(Long tAuthenticationId) {
        this.tAuthenticationId = tAuthenticationId;
    }

    public Long gettAuthenticationTid() {
        return tAuthenticationTid;
    }

    public void settAuthenticationTid(Long tAuthenticationTid) {
        this.tAuthenticationTid = tAuthenticationTid;
    }

    public Boolean gettAuthenticationState() {
        return tAuthenticationState;
    }

    public void settAuthenticationState(Boolean tAuthenticationState) {
        this.tAuthenticationState = tAuthenticationState;
    }

    public Date gettAuthenticationUpdatetime() {
        return tAuthenticationUpdatetime;
    }

    public void settAuthenticationUpdatetime(Date tAuthenticationUpdatetime) {
        this.tAuthenticationUpdatetime = tAuthenticationUpdatetime;
    }

    public Long gettAuthenticationAdminid() {
        return tAuthenticationAdminid;
    }

    public void settAuthenticationAdminid(Long tAuthenticationAdminid) {
        this.tAuthenticationAdminid = tAuthenticationAdminid;
    }
}