package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ICard;
import org.zucc.web.entity.ICardExample;

public interface ICardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_card
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int countByExample(ICardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_card
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByExample(ICardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_card
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByPrimaryKey(Long cardid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_card
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insert(ICard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_card
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insertSelective(ICard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_card
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    List<ICard> selectByExample(ICardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_card
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    ICard selectByPrimaryKey(Long cardid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_card
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExampleSelective(@Param("record") ICard record, @Param("example") ICardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_card
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExample(@Param("record") ICard record, @Param("example") ICardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_card
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKeySelective(ICard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_card
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKey(ICard record);
}