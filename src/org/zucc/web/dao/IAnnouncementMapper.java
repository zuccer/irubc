package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IAnnouncement;
import org.zucc.web.entity.IAnnouncementExample;

public interface IAnnouncementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_announcement
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int countByExample(IAnnouncementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_announcement
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByExample(IAnnouncementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_announcement
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int deleteByPrimaryKey(Long announcementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_announcement
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insert(IAnnouncement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_announcement
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int insertSelective(IAnnouncement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_announcement
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    List<IAnnouncement> selectByExample(IAnnouncementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_announcement
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    IAnnouncement selectByPrimaryKey(Long announcementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_announcement
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExampleSelective(@Param("record") IAnnouncement record, @Param("example") IAnnouncementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_announcement
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByExample(@Param("record") IAnnouncement record, @Param("example") IAnnouncementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_announcement
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKeySelective(IAnnouncement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_announcement
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    int updateByPrimaryKey(IAnnouncement record);
}