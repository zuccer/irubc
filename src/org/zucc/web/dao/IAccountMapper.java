package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IAccount;
import org.zucc.web.entity.IAccountExample;

public interface IAccountMapper {
    int countByExample(IAccountExample example);

    int deleteByExample(IAccountExample example);

    int deleteByPrimaryKey(Long aid);

    int insert(IAccount record);

    int insertSelective(IAccount record);

    List<IAccount> selectByExample(IAccountExample example);

    IAccount selectByPrimaryKey(Long aid);

    int updateByExampleSelective(@Param("record") IAccount record, @Param("example") IAccountExample example);

    int updateByExample(@Param("record") IAccount record, @Param("example") IAccountExample example);

    int updateByPrimaryKeySelective(IAccount record);

    int updateByPrimaryKey(IAccount record);
}