package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IExperience;
import org.zucc.web.entity.IExperienceExample;

public interface IExperienceMapper {
    int countByExample(IExperienceExample example);

    int deleteByExample(IExperienceExample example);

    int deleteByPrimaryKey(Long expid);

    int insert(IExperience record);

    int insertSelective(IExperience record);

    List<IExperience> selectByExample(IExperienceExample example);

    IExperience selectByPrimaryKey(Long expid);

    int updateByExampleSelective(@Param("record") IExperience record, @Param("example") IExperienceExample example);

    int updateByExample(@Param("record") IExperience record, @Param("example") IExperienceExample example);

    int updateByPrimaryKeySelective(IExperience record);

    int updateByPrimaryKey(IExperience record);
}