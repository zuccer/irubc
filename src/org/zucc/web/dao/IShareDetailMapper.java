package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IShareDetail;
import org.zucc.web.entity.IShareDetailExample;

public interface IShareDetailMapper {
    int countByExample(IShareDetailExample example);

    int deleteByExample(IShareDetailExample example);

    int deleteByPrimaryKey(Long shareDetailId);

    int insert(IShareDetail record);

    int insertSelective(IShareDetail record);

    List<IShareDetail> selectByExample(IShareDetailExample example);

    IShareDetail selectByPrimaryKey(Long shareDetailId);

    int updateByExampleSelective(@Param("record") IShareDetail record, @Param("example") IShareDetailExample example);

    int updateByExample(@Param("record") IShareDetail record, @Param("example") IShareDetailExample example);

    int updateByPrimaryKeySelective(IShareDetail record);

    int updateByPrimaryKey(IShareDetail record);
}