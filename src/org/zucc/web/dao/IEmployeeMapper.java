package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IEmployee;
import org.zucc.web.entity.IEmployeeExample;

public interface IEmployeeMapper {
    int countByExample(IEmployeeExample example);

    int deleteByExample(IEmployeeExample example);

    int deleteByPrimaryKey(Long eid);

    int insert(IEmployee record);

    int insertSelective(IEmployee record);

    List<IEmployee> selectByExample(IEmployeeExample example);

    IEmployee selectByPrimaryKey(Long eid);

    int updateByExampleSelective(@Param("record") IEmployee record, @Param("example") IEmployeeExample example);

    int updateByExample(@Param("record") IEmployee record, @Param("example") IEmployeeExample example);

    int updateByPrimaryKeySelective(IEmployee record);

    int updateByPrimaryKey(IEmployee record);
}