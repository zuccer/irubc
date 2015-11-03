package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.Admin;
import org.zucc.web.entity.AdminExample;

public interface AdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int countByExample(AdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByExample(AdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByPrimaryKey(Long adminid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insert(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insertSelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    List<Admin> selectByExample(AdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    Admin selectByPrimaryKey(Long adminid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKey(Admin record);
}