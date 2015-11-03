package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IUserType;
import org.zucc.web.entity.IUserTypeExample;

public interface IUserTypeMapper {
    int countByExample(IUserTypeExample example);

    int deleteByExample(IUserTypeExample example);

    int deleteByPrimaryKey(Long utId);

    int insert(IUserType record);

    int insertSelective(IUserType record);

    List<IUserType> selectByExample(IUserTypeExample example);

    IUserType selectByPrimaryKey(Long utId);

    int updateByExampleSelective(@Param("record") IUserType record, @Param("example") IUserTypeExample example);

    int updateByExample(@Param("record") IUserType record, @Param("example") IUserTypeExample example);

    int updateByPrimaryKeySelective(IUserType record);

    int updateByPrimaryKey(IUserType record);
}