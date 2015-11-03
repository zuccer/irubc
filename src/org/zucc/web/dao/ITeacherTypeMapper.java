package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ITeacherType;
import org.zucc.web.entity.ITeacherTypeExample;

public interface ITeacherTypeMapper {
    int countByExample(ITeacherTypeExample example);

    int deleteByExample(ITeacherTypeExample example);

    int deleteByPrimaryKey(Long typeid);

    int insert(ITeacherType record);

    int insertSelective(ITeacherType record);

    List<ITeacherType> selectByExample(ITeacherTypeExample example);

    ITeacherType selectByPrimaryKey(Long typeid);

    int updateByExampleSelective(@Param("record") ITeacherType record, @Param("example") ITeacherTypeExample example);

    int updateByExample(@Param("record") ITeacherType record, @Param("example") ITeacherTypeExample example);

    int updateByPrimaryKeySelective(ITeacherType record);

    int updateByPrimaryKey(ITeacherType record);
}