package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IAccountDetail;
import org.zucc.web.entity.IAccountDetailExample;

public interface IAccountDetailMapper {
    int countByExample(IAccountDetailExample example);

    int deleteByExample(IAccountDetailExample example);

    int deleteByPrimaryKey(Long accountDetailId);

    int insert(IAccountDetail record);

    int insertSelective(IAccountDetail record);

    List<IAccountDetail> selectByExample(IAccountDetailExample example);

    IAccountDetail selectByPrimaryKey(Long accountDetailId);

    int updateByExampleSelective(@Param("record") IAccountDetail record, @Param("example") IAccountDetailExample example);

    int updateByExample(@Param("record") IAccountDetail record, @Param("example") IAccountDetailExample example);

    int updateByPrimaryKeySelective(IAccountDetail record);

    int updateByPrimaryKey(IAccountDetail record);
}