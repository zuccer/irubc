package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ICourseAuthentication;
import org.zucc.web.entity.ICourseAuthenticationExample;

public interface ICourseAuthenticationMapper {
    int countByExample(ICourseAuthenticationExample example);

    int deleteByExample(ICourseAuthenticationExample example);

    int deleteByPrimaryKey(Long courseAuthenticationId);

    int insert(ICourseAuthentication record);

    int insertSelective(ICourseAuthentication record);

    List<ICourseAuthentication> selectByExample(ICourseAuthenticationExample example);

    ICourseAuthentication selectByPrimaryKey(Long courseAuthenticationId);

    int updateByExampleSelective(@Param("record") ICourseAuthentication record, @Param("example") ICourseAuthenticationExample example);

    int updateByExample(@Param("record") ICourseAuthentication record, @Param("example") ICourseAuthenticationExample example);

    int updateByPrimaryKeySelective(ICourseAuthentication record);

    int updateByPrimaryKey(ICourseAuthentication record);
}