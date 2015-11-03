package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ICard;
import org.zucc.web.entity.ICardExample;

public interface ICardMapper {
    int countByExample(ICardExample example);

    int deleteByExample(ICardExample example);

    int deleteByPrimaryKey(Long cardid);

    int insert(ICard record);

    int insertSelective(ICard record);

    List<ICard> selectByExample(ICardExample example);

    ICard selectByPrimaryKey(Long cardid);

    int updateByExampleSelective(@Param("record") ICard record, @Param("example") ICardExample example);

    int updateByExample(@Param("record") ICard record, @Param("example") ICardExample example);

    int updateByPrimaryKeySelective(ICard record);

    int updateByPrimaryKey(ICard record);
}