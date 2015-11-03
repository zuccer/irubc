package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class IIntegral implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_integral.iid
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long iid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_integral.i_userId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long iUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_integral.i_value
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Integer iValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_integral.i_getTime
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Date iGettime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_integral.i_courseId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long iCourseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table i_integral
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_integral.iid
     *
     * @return the value of i_integral.iid
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getIid() {
        return iid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_integral.iid
     *
     * @param iid the value for i_integral.iid
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setIid(Long iid) {
        this.iid = iid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_integral.i_userId
     *
     * @return the value of i_integral.i_userId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getiUserid() {
        return iUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_integral.i_userId
     *
     * @param iUserid the value for i_integral.i_userId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setiUserid(Long iUserid) {
        this.iUserid = iUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_integral.i_value
     *
     * @return the value of i_integral.i_value
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Integer getiValue() {
        return iValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_integral.i_value
     *
     * @param iValue the value for i_integral.i_value
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setiValue(Integer iValue) {
        this.iValue = iValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_integral.i_getTime
     *
     * @return the value of i_integral.i_getTime
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Date getiGettime() {
        return iGettime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_integral.i_getTime
     *
     * @param iGettime the value for i_integral.i_getTime
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setiGettime(Date iGettime) {
        this.iGettime = iGettime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_integral.i_courseId
     *
     * @return the value of i_integral.i_courseId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getiCourseid() {
        return iCourseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_integral.i_courseId
     *
     * @param iCourseid the value for i_integral.i_courseId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setiCourseid(Long iCourseid) {
        this.iCourseid = iCourseid;
    }
}