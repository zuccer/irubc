package org.zucc.web.entity;

import java.io.Serializable;

public class IReward implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_reward.rid
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long rid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_reward.r_teacherId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long rTeacherid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_reward.r_courseId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long rCourseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_reward.r_state
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Boolean rState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_reward.r_money
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Double rMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table i_reward
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_reward.rid
     *
     * @return the value of i_reward.rid
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getRid() {
        return rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_reward.rid
     *
     * @param rid the value for i_reward.rid
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setRid(Long rid) {
        this.rid = rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_reward.r_teacherId
     *
     * @return the value of i_reward.r_teacherId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getrTeacherid() {
        return rTeacherid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_reward.r_teacherId
     *
     * @param rTeacherid the value for i_reward.r_teacherId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setrTeacherid(Long rTeacherid) {
        this.rTeacherid = rTeacherid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_reward.r_courseId
     *
     * @return the value of i_reward.r_courseId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getrCourseid() {
        return rCourseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_reward.r_courseId
     *
     * @param rCourseid the value for i_reward.r_courseId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setrCourseid(Long rCourseid) {
        this.rCourseid = rCourseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_reward.r_state
     *
     * @return the value of i_reward.r_state
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Boolean getrState() {
        return rState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_reward.r_state
     *
     * @param rState the value for i_reward.r_state
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setrState(Boolean rState) {
        this.rState = rState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_reward.r_money
     *
     * @return the value of i_reward.r_money
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Double getrMoney() {
        return rMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_reward.r_money
     *
     * @param rMoney the value for i_reward.r_money
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setrMoney(Double rMoney) {
        this.rMoney = rMoney;
    }
}