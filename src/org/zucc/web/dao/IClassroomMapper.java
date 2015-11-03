package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IClassroom;
import org.zucc.web.entity.IClassroomExample;

public interface IClassroomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_classroom
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int countByExample(IClassroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_classroom
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByExample(IClassroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_classroom
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByPrimaryKey(Long classroomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_classroom
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insert(IClassroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_classroom
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insertSelective(IClassroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_classroom
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    List<IClassroom> selectByExample(IClassroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_classroom
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    IClassroom selectByPrimaryKey(Long classroomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_classroom
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExampleSelective(@Param("record") IClassroom record, @Param("example") IClassroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_classroom
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExample(@Param("record") IClassroom record, @Param("example") IClassroomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_classroom
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKeySelective(IClassroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_classroom
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKey(IClassroom record);
}