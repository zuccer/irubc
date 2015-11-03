package org.zucc.web.entity;

import java.io.Serializable;

public class IAccount implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_account.aid
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long aid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_account.a_userId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long aUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_account.a_money
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Double aMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_account.a_reward_money
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Double aRewardMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table i_account
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_account.aid
     *
     * @return the value of i_account.aid
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getAid() {
        return aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_account.aid
     *
     * @param aid the value for i_account.aid
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setAid(Long aid) {
        this.aid = aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_account.a_userId
     *
     * @return the value of i_account.a_userId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getaUserid() {
        return aUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_account.a_userId
     *
     * @param aUserid the value for i_account.a_userId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setaUserid(Long aUserid) {
        this.aUserid = aUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_account.a_money
     *
     * @return the value of i_account.a_money
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Double getaMoney() {
        return aMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_account.a_money
     *
     * @param aMoney the value for i_account.a_money
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setaMoney(Double aMoney) {
        this.aMoney = aMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_account.a_reward_money
     *
     * @return the value of i_account.a_reward_money
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Double getaRewardMoney() {
        return aRewardMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_account.a_reward_money
     *
     * @param aRewardMoney the value for i_account.a_reward_money
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setaRewardMoney(Double aRewardMoney) {
        this.aRewardMoney = aRewardMoney;
    }
}