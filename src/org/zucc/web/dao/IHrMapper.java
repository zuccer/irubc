package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IHr;
import org.zucc.web.entity.IHrExample;

public interface IHrMapper {
    int countByExample(IHrExample example);

    int deleteByExample(IHrExample example);

    int deleteByPrimaryKey(Long hrid);

    int insert(IHr record);

    int insertSelective(IHr record);

    List<IHr> selectByExample(IHrExample example);

    IHr selectByPrimaryKey(Long hrid);

    int updateByExampleSelective(@Param("record") IHr record, @Param("example") IHrExample example);

    int updateByExample(@Param("record") IHr record, @Param("example") IHrExample example);

    int updateByPrimaryKeySelective(IHr record);

    int updateByPrimaryKey(IHr record);
}