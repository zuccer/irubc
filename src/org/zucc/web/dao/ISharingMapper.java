package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ISharing;
import org.zucc.web.entity.ISharingExample;

public interface ISharingMapper {
    int countByExample(ISharingExample example);

    int deleteByExample(ISharingExample example);

    int deleteByPrimaryKey(Long sid);

    int insert(ISharing record);

    int insertSelective(ISharing record);

    List<ISharing> selectByExample(ISharingExample example);

    ISharing selectByPrimaryKey(Long sid);

    int updateByExampleSelective(@Param("record") ISharing record, @Param("example") ISharingExample example);

    int updateByExample(@Param("record") ISharing record, @Param("example") ISharingExample example);

    int updateByPrimaryKeySelective(ISharing record);

    int updateByPrimaryKey(ISharing record);
}