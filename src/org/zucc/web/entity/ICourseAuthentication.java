package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class ICourseAuthentication implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_course_authentication.course_authentication_id
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long courseAuthenticationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_course_authentication.course_authentication_courseId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long courseAuthenticationCourseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_course_authentication.course_authentication_state
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Boolean courseAuthenticationState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_course_authentication.course_authentication_updateTime
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Date courseAuthenticationUpdatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_course_authentication.course_authentication_adminId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long courseAuthenticationAdminid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table i_course_authentication
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_course_authentication.course_authentication_id
     *
     * @return the value of i_course_authentication.course_authentication_id
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getCourseAuthenticationId() {
        return courseAuthenticationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_course_authentication.course_authentication_id
     *
     * @param courseAuthenticationId the value for i_course_authentication.course_authentication_id
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setCourseAuthenticationId(Long courseAuthenticationId) {
        this.courseAuthenticationId = courseAuthenticationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_course_authentication.course_authentication_courseId
     *
     * @return the value of i_course_authentication.course_authentication_courseId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getCourseAuthenticationCourseid() {
        return courseAuthenticationCourseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_course_authentication.course_authentication_courseId
     *
     * @param courseAuthenticationCourseid the value for i_course_authentication.course_authentication_courseId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setCourseAuthenticationCourseid(Long courseAuthenticationCourseid) {
        this.courseAuthenticationCourseid = courseAuthenticationCourseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_course_authentication.course_authentication_state
     *
     * @return the value of i_course_authentication.course_authentication_state
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Boolean getCourseAuthenticationState() {
        return courseAuthenticationState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_course_authentication.course_authentication_state
     *
     * @param courseAuthenticationState the value for i_course_authentication.course_authentication_state
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setCourseAuthenticationState(Boolean courseAuthenticationState) {
        this.courseAuthenticationState = courseAuthenticationState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_course_authentication.course_authentication_updateTime
     *
     * @return the value of i_course_authentication.course_authentication_updateTime
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Date getCourseAuthenticationUpdatetime() {
        return courseAuthenticationUpdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_course_authentication.course_authentication_updateTime
     *
     * @param courseAuthenticationUpdatetime the value for i_course_authentication.course_authentication_updateTime
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setCourseAuthenticationUpdatetime(Date courseAuthenticationUpdatetime) {
        this.courseAuthenticationUpdatetime = courseAuthenticationUpdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_course_authentication.course_authentication_adminId
     *
     * @return the value of i_course_authentication.course_authentication_adminId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getCourseAuthenticationAdminid() {
        return courseAuthenticationAdminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_course_authentication.course_authentication_adminId
     *
     * @param courseAuthenticationAdminid the value for i_course_authentication.course_authentication_adminId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setCourseAuthenticationAdminid(Long courseAuthenticationAdminid) {
        this.courseAuthenticationAdminid = courseAuthenticationAdminid;
    }
}