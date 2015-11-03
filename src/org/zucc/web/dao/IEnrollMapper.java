package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IEnroll;
import org.zucc.web.entity.IEnrollExample;

public interface IEnrollMapper {
    int countByExample(IEnrollExample example);

    int deleteByExample(IEnrollExample example);

    int deleteByPrimaryKey(Long enrollId);

    int insert(IEnroll record);

    int insertSelective(IEnroll record);

    List<IEnroll> selectByExample(IEnrollExample example);

    IEnroll selectByPrimaryKey(Long enrollId);

    int updateByExampleSelective(@Param("record") IEnroll record, @Param("example") IEnrollExample example);

    int updateByExample(@Param("record") IEnroll record, @Param("example") IEnrollExample example);

    int updateByPrimaryKeySelective(IEnroll record);

    int updateByPrimaryKey(IEnroll record);
}