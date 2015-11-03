package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IIntegral;
import org.zucc.web.entity.IIntegralExample;

public interface IIntegralMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_integral
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int countByExample(IIntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_integral
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByExample(IIntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_integral
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByPrimaryKey(Long iid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_integral
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insert(IIntegral record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_integral
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insertSelective(IIntegral record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_integral
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    List<IIntegral> selectByExample(IIntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_integral
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    IIntegral selectByPrimaryKey(Long iid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_integral
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExampleSelective(@Param("record") IIntegral record, @Param("example") IIntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_integral
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExample(@Param("record") IIntegral record, @Param("example") IIntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_integral
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKeySelective(IIntegral record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_integral
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKey(IIntegral record);
}