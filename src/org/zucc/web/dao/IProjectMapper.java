package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IProject;
import org.zucc.web.entity.IProjectExample;

public interface IProjectMapper {
    int countByExample(IProjectExample example);

    int deleteByExample(IProjectExample example);

    int deleteByPrimaryKey(Long pid);

    int insert(IProject record);

    int insertSelective(IProject record);

    List<IProject> selectByExample(IProjectExample example);

    IProject selectByPrimaryKey(Long pid);

    int updateByExampleSelective(@Param("record") IProject record, @Param("example") IProjectExample example);

    int updateByExample(@Param("record") IProject record, @Param("example") IProjectExample example);

    int updateByPrimaryKeySelective(IProject record);

    int updateByPrimaryKey(IProject record);
}