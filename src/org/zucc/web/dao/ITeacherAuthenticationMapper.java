package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ITeacherAuthentication;
import org.zucc.web.entity.ITeacherAuthenticationExample;

public interface ITeacherAuthenticationMapper {
    int countByExample(ITeacherAuthenticationExample example);

    int deleteByExample(ITeacherAuthenticationExample example);

    int deleteByPrimaryKey(Long tAuthenticationId);

    int insert(ITeacherAuthentication record);

    int insertSelective(ITeacherAuthentication record);

    List<ITeacherAuthentication> selectByExample(ITeacherAuthenticationExample example);

    ITeacherAuthentication selectByPrimaryKey(Long tAuthenticationId);

    int updateByExampleSelective(@Param("record") ITeacherAuthentication record, @Param("example") ITeacherAuthenticationExample example);

    int updateByExample(@Param("record") ITeacherAuthentication record, @Param("example") ITeacherAuthenticationExample example);

    int updateByPrimaryKeySelective(ITeacherAuthentication record);

    int updateByPrimaryKey(ITeacherAuthentication record);
}