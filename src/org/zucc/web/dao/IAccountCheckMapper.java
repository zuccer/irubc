package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IAccountCheck;
import org.zucc.web.entity.IAccountCheckExample;

public interface IAccountCheckMapper {
    int countByExample(IAccountCheckExample example);

    int deleteByExample(IAccountCheckExample example);

    int deleteByPrimaryKey(Long accountCheckId);

    int insert(IAccountCheck record);

    int insertSelective(IAccountCheck record);

    List<IAccountCheck> selectByExample(IAccountCheckExample example);

    IAccountCheck selectByPrimaryKey(Long accountCheckId);

    int updateByExampleSelective(@Param("record") IAccountCheck record, @Param("example") IAccountCheckExample example);

    int updateByExample(@Param("record") IAccountCheck record, @Param("example") IAccountCheckExample example);

    int updateByPrimaryKeySelective(IAccountCheck record);

    int updateByPrimaryKey(IAccountCheck record);
}