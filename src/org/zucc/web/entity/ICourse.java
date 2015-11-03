package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class ICourse implements Serializable {
    private Long cCid;

    private String cCname;

    private Double cPrice;

    private String cAddress;

    private Integer cCollection;

    private Long cTeacherid;

    private String cDescription;

    private String cSimpleDescription;

    private Integer cCourseminnum;

    private Integer cCoursemaxnum;

    private Integer cCoursenum;

    private Date cStarttime;

    private Date cEndtime;

    private String cThumbnail;

    private String cImageone;

    private String cImagetwo;

    private String cImagethree;

    private Long cUserid;

    private Long cClassroomId;

    private Long cCoursetypeId;

    private Date cClassstartdate;

    private Date cClassenddate;

    private Date cClassstarttime;

    private Date cClassendtime;

    private Boolean cRecommend;

    private Boolean cSchedule;

    private static final long serialVersionUID = 1L;

    public Long getcCid() {
        return cCid;
    }

    public void setcCid(Long cCid) {
        this.cCid = cCid;
    }

    public String getcCname() {
        return cCname;
    }

    public void setcCname(String cCname) {
        this.cCname = cCname == null ? null : cCname.trim();
    }

    public Double getcPrice() {
        return cPrice;
    }

    public void setcPrice(Double cPrice) {
        this.cPrice = cPrice;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress == null ? null : cAddress.trim();
    }

    public Integer getcCollection() {
        return cCollection;
    }

    public void setcCollection(Integer cCollection) {
        this.cCollection = cCollection;
    }

    public Long getcTeacherid() {
        return cTeacherid;
    }

    public void setcTeacherid(Long cTeacherid) {
        this.cTeacherid = cTeacherid;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription == null ? null : cDescription.trim();
    }

    public String getcSimpleDescription() {
        return cSimpleDescription;
    }

    public void setcSimpleDescription(String cSimpleDescription) {
        this.cSimpleDescription = cSimpleDescription == null ? null : cSimpleDescription.trim();
    }

    public Integer getcCourseminnum() {
        return cCourseminnum;
    }

    public void setcCourseminnum(Integer cCourseminnum) {
        this.cCourseminnum = cCourseminnum;
    }

    public Integer getcCoursemaxnum() {
        return cCoursemaxnum;
    }

    public void setcCoursemaxnum(Integer cCoursemaxnum) {
        this.cCoursemaxnum = cCoursemaxnum;
    }

    public Integer getcCoursenum() {
        return cCoursenum;
    }

    public void setcCoursenum(Integer cCoursenum) {
        this.cCoursenum = cCoursenum;
    }

    public Date getcStarttime() {
        return cStarttime;
    }

    public void setcStarttime(Date cStarttime) {
        this.cStarttime = cStarttime;
    }

    public Date getcEndtime() {
        return cEndtime;
    }

    public void setcEndtime(Date cEndtime) {
        this.cEndtime = cEndtime;
    }

    public String getcThumbnail() {
        return cThumbnail;
    }

    public void setcThumbnail(String cThumbnail) {
        this.cThumbnail = cThumbnail == null ? null : cThumbnail.trim();
    }

    public String getcImageone() {
        return cImageone;
    }

    public void setcImageone(String cImageone) {
        this.cImageone = cImageone == null ? null : cImageone.trim();
    }

    public String getcImagetwo() {
        return cImagetwo;
    }

    public void setcImagetwo(String cImagetwo) {
        this.cImagetwo = cImagetwo == null ? null : cImagetwo.trim();
    }

    public String getcImagethree() {
        return cImagethree;
    }

    public void setcImagethree(String cImagethree) {
        this.cImagethree = cImagethree == null ? null : cImagethree.trim();
    }

    public Long getcUserid() {
        return cUserid;
    }

    public void setcUserid(Long cUserid) {
        this.cUserid = cUserid;
    }

    public Long getcClassroomId() {
        return cClassroomId;
    }

    public void setcClassroomId(Long cClassroomId) {
        this.cClassroomId = cClassroomId;
    }

    public Long getcCoursetypeId() {
        return cCoursetypeId;
    }

    public void setcCoursetypeId(Long cCoursetypeId) {
        this.cCoursetypeId = cCoursetypeId;
    }

    public Date getcClassstartdate() {
        return cClassstartdate;
    }

    public void setcClassstartdate(Date cClassstartdate) {
        this.cClassstartdate = cClassstartdate;
    }

    public Date getcClassenddate() {
        return cClassenddate;
    }

    public void setcClassenddate(Date cClassenddate) {
        this.cClassenddate = cClassenddate;
    }

    public Date getcClassstarttime() {
        return cClassstarttime;
    }

    public void setcClassstarttime(Date cClassstarttime) {
        this.cClassstarttime = cClassstarttime;
    }

    public Date getcClassendtime() {
        return cClassendtime;
    }

    public void setcClassendtime(Date cClassendtime) {
        this.cClassendtime = cClassendtime;
    }

    public Boolean getcRecommend() {
        return cRecommend;
    }

    public void setcRecommend(Boolean cRecommend) {
        this.cRecommend = cRecommend;
    }

    public Boolean getcSchedule() {
        return cSchedule;
    }

    public void setcSchedule(Boolean cSchedule) {
        this.cSchedule = cSchedule;
    }
}