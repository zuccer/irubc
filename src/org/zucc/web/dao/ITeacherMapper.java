package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ITeacher;
import org.zucc.web.entity.ITeacherExample;

public interface ITeacherMapper {
    int countByExample(ITeacherExample example);

    int deleteByExample(ITeacherExample example);

    int deleteByPrimaryKey(Long tid);

    int insert(ITeacher record);

    int insertSelective(ITeacher record);

    List<ITeacher> selectByExample(ITeacherExample example);

    ITeacher selectByPrimaryKey(Long tid);

    int updateByExampleSelective(@Param("record") ITeacher record, @Param("example") ITeacherExample example);

    int updateByExample(@Param("record") ITeacher record, @Param("example") ITeacherExample example);

    int updateByPrimaryKeySelective(ITeacher record);

    int updateByPrimaryKey(ITeacher record);
}