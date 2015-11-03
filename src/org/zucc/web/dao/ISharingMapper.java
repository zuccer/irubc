package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ISharing;
import org.zucc.web.entity.ISharingExample;

public interface ISharingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_sharing
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int countByExample(ISharingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_sharing
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByExample(ISharingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_sharing
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByPrimaryKey(Long sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_sharing
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insert(ISharing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_sharing
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insertSelective(ISharing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_sharing
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    List<ISharing> selectByExample(ISharingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_sharing
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    ISharing selectByPrimaryKey(Long sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_sharing
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExampleSelective(@Param("record") ISharing record, @Param("example") ISharingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_sharing
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExample(@Param("record") ISharing record, @Param("example") ISharingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_sharing
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKeySelective(ISharing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_sharing
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKey(ISharing record);
}