package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IColletion;
import org.zucc.web.entity.IColletionExample;

public interface IColletionMapper {
    int countByExample(IColletionExample example);

    int deleteByExample(IColletionExample example);

    int deleteByPrimaryKey(Long collectionid);

    int insert(IColletion record);

    int insertSelective(IColletion record);

    List<IColletion> selectByExample(IColletionExample example);

    IColletion selectByPrimaryKey(Long collectionid);

    int updateByExampleSelective(@Param("record") IColletion record, @Param("example") IColletionExample example);

    int updateByExample(@Param("record") IColletion record, @Param("example") IColletionExample example);

    int updateByPrimaryKeySelective(IColletion record);

    int updateByPrimaryKey(IColletion record);
}