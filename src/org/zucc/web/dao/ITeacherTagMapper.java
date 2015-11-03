package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ITeacherTag;
import org.zucc.web.entity.ITeacherTagExample;

public interface ITeacherTagMapper {
    int countByExample(ITeacherTagExample example);

    int deleteByExample(ITeacherTagExample example);

    int deleteByPrimaryKey(Long tagid);

    int insert(ITeacherTag record);

    int insertSelective(ITeacherTag record);

    List<ITeacherTag> selectByExample(ITeacherTagExample example);

    ITeacherTag selectByPrimaryKey(Long tagid);

    int updateByExampleSelective(@Param("record") ITeacherTag record, @Param("example") ITeacherTagExample example);

    int updateByExample(@Param("record") ITeacherTag record, @Param("example") ITeacherTagExample example);

    int updateByPrimaryKeySelective(ITeacherTag record);

    int updateByPrimaryKey(ITeacherTag record);
}