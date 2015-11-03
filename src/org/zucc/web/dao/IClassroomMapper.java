package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IClassroom;
import org.zucc.web.entity.IClassroomExample;

public interface IClassroomMapper {
    int countByExample(IClassroomExample example);

    int deleteByExample(IClassroomExample example);

    int deleteByPrimaryKey(Long classroomId);

    int insert(IClassroom record);

    int insertSelective(IClassroom record);

    List<IClassroom> selectByExample(IClassroomExample example);

    IClassroom selectByPrimaryKey(Long classroomId);

    int updateByExampleSelective(@Param("record") IClassroom record, @Param("example") IClassroomExample example);

    int updateByExample(@Param("record") IClassroom record, @Param("example") IClassroomExample example);

    int updateByPrimaryKeySelective(IClassroom record);

    int updateByPrimaryKey(IClassroom record);
}