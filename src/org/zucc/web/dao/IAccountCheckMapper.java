package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IAccountCheck;
import org.zucc.web.entity.IAccountCheckExample;

public interface IAccountCheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_check
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int countByExample(IAccountCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_check
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByExample(IAccountCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_check
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByPrimaryKey(Long accountCheckId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_check
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insert(IAccountCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_check
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insertSelective(IAccountCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_check
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    List<IAccountCheck> selectByExample(IAccountCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_check
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    IAccountCheck selectByPrimaryKey(Long accountCheckId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_check
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExampleSelective(@Param("record") IAccountCheck record, @Param("example") IAccountCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_check
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExample(@Param("record") IAccountCheck record, @Param("example") IAccountCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_check
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKeySelective(IAccountCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_check
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKey(IAccountCheck record);
}