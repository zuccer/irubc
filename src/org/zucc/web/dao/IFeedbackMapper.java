package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IFeedback;
import org.zucc.web.entity.IFeedbackExample;

public interface IFeedbackMapper {
    int countByExample(IFeedbackExample example);

    int deleteByExample(IFeedbackExample example);

    int deleteByPrimaryKey(Long feedbackId);

    int insert(IFeedback record);

    int insertSelective(IFeedback record);

    List<IFeedback> selectByExample(IFeedbackExample example);

    IFeedback selectByPrimaryKey(Long feedbackId);

    int updateByExampleSelective(@Param("record") IFeedback record, @Param("example") IFeedbackExample example);

    int updateByExample(@Param("record") IFeedback record, @Param("example") IFeedbackExample example);

    int updateByPrimaryKeySelective(IFeedback record);

    int updateByPrimaryKey(IFeedback record);
}