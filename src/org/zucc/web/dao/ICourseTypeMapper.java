package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ICourseType;
import org.zucc.web.entity.ICourseTypeExample;

public interface ICourseTypeMapper {
    int countByExample(ICourseTypeExample example);

    int deleteByExample(ICourseTypeExample example);

    int deleteByPrimaryKey(Long courseTypeId);

    int insert(ICourseType record);

    int insertSelective(ICourseType record);

    List<ICourseType> selectByExample(ICourseTypeExample example);

    ICourseType selectByPrimaryKey(Long courseTypeId);

    int updateByExampleSelective(@Param("record") ICourseType record, @Param("example") ICourseTypeExample example);

    int updateByExample(@Param("record") ICourseType record, @Param("example") ICourseTypeExample example);

    int updateByPrimaryKeySelective(ICourseType record);

    int updateByPrimaryKey(ICourseType record);
}