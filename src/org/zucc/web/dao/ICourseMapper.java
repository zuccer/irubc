package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ICourse;
import org.zucc.web.entity.ICourseExample;

public interface ICourseMapper {
    int countByExample(ICourseExample example);

    int deleteByExample(ICourseExample example);

    int deleteByPrimaryKey(Long cCid);

    int insert(ICourse record);

    int insertSelective(ICourse record);

    List<ICourse> selectByExample(ICourseExample example);

    ICourse selectByPrimaryKey(Long cCid);

    int updateByExampleSelective(@Param("record") ICourse record, @Param("example") ICourseExample example);

    int updateByExample(@Param("record") ICourse record, @Param("example") ICourseExample example);

    int updateByPrimaryKeySelective(ICourse record);

    int updateByPrimaryKey(ICourse record);
}