package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IAnnouncement;
import org.zucc.web.entity.IAnnouncementExample;

public interface IAnnouncementMapper {
    int countByExample(IAnnouncementExample example);

    int deleteByExample(IAnnouncementExample example);

    int deleteByPrimaryKey(Long announcementId);

    int insert(IAnnouncement record);

    int insertSelective(IAnnouncement record);

    List<IAnnouncement> selectByExample(IAnnouncementExample example);

    IAnnouncement selectByPrimaryKey(Long announcementId);

    int updateByExampleSelective(@Param("record") IAnnouncement record, @Param("example") IAnnouncementExample example);

    int updateByExample(@Param("record") IAnnouncement record, @Param("example") IAnnouncementExample example);

    int updateByPrimaryKeySelective(IAnnouncement record);

    int updateByPrimaryKey(IAnnouncement record);
}