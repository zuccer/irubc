package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IAccountDetail;
import org.zucc.web.entity.IAccountDetailExample;

public interface IAccountDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_detail
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int countByExample(IAccountDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_detail
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByExample(IAccountDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_detail
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByPrimaryKey(Long accountDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_detail
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insert(IAccountDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_detail
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insertSelective(IAccountDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_detail
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    List<IAccountDetail> selectByExample(IAccountDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_detail
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    IAccountDetail selectByPrimaryKey(Long accountDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_detail
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExampleSelective(@Param("record") IAccountDetail record, @Param("example") IAccountDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_detail
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExample(@Param("record") IAccountDetail record, @Param("example") IAccountDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_detail
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKeySelective(IAccountDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_account_detail
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKey(IAccountDetail record);
}