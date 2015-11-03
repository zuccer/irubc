package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ICompany;
import org.zucc.web.entity.ICompanyExample;

public interface ICompanyMapper {
    int countByExample(ICompanyExample example);

    int deleteByExample(ICompanyExample example);

    int deleteByPrimaryKey(Long companyid);

    int insert(ICompany record);

    int insertSelective(ICompany record);

    List<ICompany> selectByExample(ICompanyExample example);

    ICompany selectByPrimaryKey(Long companyid);

    int updateByExampleSelective(@Param("record") ICompany record, @Param("example") ICompanyExample example);

    int updateByExample(@Param("record") ICompany record, @Param("example") ICompanyExample example);

    int updateByPrimaryKeySelective(ICompany record);

    int updateByPrimaryKey(ICompany record);
}