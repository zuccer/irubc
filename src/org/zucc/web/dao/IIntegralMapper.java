package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IIntegral;
import org.zucc.web.entity.IIntegralExample;

public interface IIntegralMapper {
    int countByExample(IIntegralExample example);

    int deleteByExample(IIntegralExample example);

    int deleteByPrimaryKey(Long iid);

    int insert(IIntegral record);

    int insertSelective(IIntegral record);

    List<IIntegral> selectByExample(IIntegralExample example);

    IIntegral selectByPrimaryKey(Long iid);

    int updateByExampleSelective(@Param("record") IIntegral record, @Param("example") IIntegralExample example);

    int updateByExample(@Param("record") IIntegral record, @Param("example") IIntegralExample example);

    int updateByPrimaryKeySelective(IIntegral record);

    int updateByPrimaryKey(IIntegral record);
}