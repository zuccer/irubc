package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ICourse;
import org.zucc.web.entity.ICourseExample;

public interface ICourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int countByExample(ICourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByExample(ICourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByPrimaryKey(Long cCid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insert(ICourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insertSelective(ICourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    List<ICourse> selectByExample(ICourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    ICourse selectByPrimaryKey(Long cCid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExampleSelective(@Param("record") ICourse record, @Param("example") ICourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExample(@Param("record") ICourse record, @Param("example") ICourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKeySelective(ICourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKey(ICourse record);
}