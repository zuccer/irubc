package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IReward;
import org.zucc.web.entity.IRewardExample;

public interface IRewardMapper {
    int countByExample(IRewardExample example);

    int deleteByExample(IRewardExample example);

    int deleteByPrimaryKey(Long rid);

    int insert(IReward record);

    int insertSelective(IReward record);

    List<IReward> selectByExample(IRewardExample example);

    IReward selectByPrimaryKey(Long rid);

    int updateByExampleSelective(@Param("record") IReward record, @Param("example") IRewardExample example);

    int updateByExample(@Param("record") IReward record, @Param("example") IRewardExample example);

    int updateByPrimaryKeySelective(IReward record);

    int updateByPrimaryKey(IReward record);
}