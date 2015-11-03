package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IUser;
import org.zucc.web.entity.IUserExample;

public interface IUserMapper {
    int countByExample(IUserExample example);

    int deleteByExample(IUserExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(IUser record);

    int insertSelective(IUser record);

    List<IUser> selectByExample(IUserExample example);

    IUser selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") IUser record, @Param("example") IUserExample example);

    int updateByExample(@Param("record") IUser record, @Param("example") IUserExample example);

    int updateByPrimaryKeySelective(IUser record);

    int updateByPrimaryKey(IUser record);
}