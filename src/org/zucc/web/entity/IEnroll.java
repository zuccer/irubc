package org.zucc.web.entity;

import java.io.Serializable;

public class IEnroll implements Serializable {
    private Long enrollId;

    private Long enrollCourseid;

    private Long enrollUserid;

    private String enrollQuestion;

    private String enrollPhone;

    private String enrollName;

    private String enrollCompany;

    private String enrollPosition;

    private String enrollEmail;

    private Double enrollMoney;

    private Boolean enrollPayState;

    private static final long serialVersionUID = 1L;

    public Long getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(Long enrollId) {
        this.enrollId = enrollId;
    }

    public Long getEnrollCourseid() {
        return enrollCourseid;
    }

    public void setEnrollCourseid(Long enrollCourseid) {
        this.enrollCourseid = enrollCourseid;
    }

    public Long getEnrollUserid() {
        return enrollUserid;
    }

    public void setEnrollUserid(Long enrollUserid) {
        this.enrollUserid = enrollUserid;
    }

    public String getEnrollQuestion() {
        return enrollQuestion;
    }

    public void setEnrollQuestion(String enrollQuestion) {
        this.enrollQuestion = enrollQuestion == null ? null : enrollQuestion.trim();
    }

    public String getEnrollPhone() {
        return enrollPhone;
    }

    public void setEnrollPhone(String enrollPhone) {
        this.enrollPhone = enrollPhone == null ? null : enrollPhone.trim();
    }

    public String getEnrollName() {
        return enrollName;
    }

    public void setEnrollName(String enrollName) {
        this.enrollName = enrollName == null ? null : enrollName.trim();
    }

    public String getEnrollCompany() {
        return enrollCompany;
    }

    public void setEnrollCompany(String enrollCompany) {
        this.enrollCompany = enrollCompany == null ? null : enrollCompany.trim();
    }

    public String getEnrollPosition() {
        return enrollPosition;
    }

    public void setEnrollPosition(String enrollPosition) {
        this.enrollPosition = enrollPosition == null ? null : enrollPosition.trim();
    }

    public String getEnrollEmail() {
        return enrollEmail;
    }

    public void setEnrollEmail(String enrollEmail) {
        this.enrollEmail = enrollEmail == null ? null : enrollEmail.trim();
    }

    public Double getEnrollMoney() {
        return enrollMoney;
    }

    public void setEnrollMoney(Double enrollMoney) {
        this.enrollMoney = enrollMoney;
    }

    public Boolean getEnrollPayState() {
        return enrollPayState;
    }

    public void setEnrollPayState(Boolean enrollPayState) {
        this.enrollPayState = enrollPayState;
    }
}