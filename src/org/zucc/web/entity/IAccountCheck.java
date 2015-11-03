package org.zucc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class IAccountCheck implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_account_check.account_check_id
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long accountCheckId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_account_check.account_check_accountId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long accountCheckAccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_account_check.account_check_money
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Double accountCheckMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_account_check.account_check_state
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Boolean accountCheckState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_account_check.account_check_time
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Date accountCheckTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table i_account_check
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_account_check.account_check_id
     *
     * @return the value of i_account_check.account_check_id
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getAccountCheckId() {
        return accountCheckId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_account_check.account_check_id
     *
     * @param accountCheckId the value for i_account_check.account_check_id
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setAccountCheckId(Long accountCheckId) {
        this.accountCheckId = accountCheckId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_account_check.account_check_accountId
     *
     * @return the value of i_account_check.account_check_accountId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getAccountCheckAccountid() {
        return accountCheckAccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_account_check.account_check_accountId
     *
     * @param accountCheckAccountid the value for i_account_check.account_check_accountId
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setAccountCheckAccountid(Long accountCheckAccountid) {
        this.accountCheckAccountid = accountCheckAccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_account_check.account_check_money
     *
     * @return the value of i_account_check.account_check_money
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Double getAccountCheckMoney() {
        return accountCheckMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_account_check.account_check_money
     *
     * @param accountCheckMoney the value for i_account_check.account_check_money
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setAccountCheckMoney(Double accountCheckMoney) {
        this.accountCheckMoney = accountCheckMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_account_check.account_check_state
     *
     * @return the value of i_account_check.account_check_state
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Boolean getAccountCheckState() {
        return accountCheckState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_account_check.account_check_state
     *
     * @param accountCheckState the value for i_account_check.account_check_state
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setAccountCheckState(Boolean accountCheckState) {
        this.accountCheckState = accountCheckState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_account_check.account_check_time
     *
     * @return the value of i_account_check.account_check_time
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Date getAccountCheckTime() {
        return accountCheckTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_account_check.account_check_time
     *
     * @param accountCheckTime the value for i_account_check.account_check_time
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setAccountCheckTime(Date accountCheckTime) {
        this.accountCheckTime = accountCheckTime;
    }
}