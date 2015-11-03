package org.zucc.web.entity;

import java.io.Serializable;

public class IUserType implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_user_type.ut_id
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private Long utId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column i_user_type.ut_name
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private String utName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table i_user_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_user_type.ut_id
     *
     * @return the value of i_user_type.ut_id
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Long getUtId() {
        return utId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_user_type.ut_id
     *
     * @param utId the value for i_user_type.ut_id
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setUtId(Long utId) {
        this.utId = utId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column i_user_type.ut_name
     *
     * @return the value of i_user_type.ut_name
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public String getUtName() {
        return utName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column i_user_type.ut_name
     *
     * @param utName the value for i_user_type.ut_name
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setUtName(String utName) {
        this.utName = utName == null ? null : utName.trim();
    }
}