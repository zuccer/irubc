package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.IComment;
import org.zucc.web.entity.ICommentExample;

public interface ICommentMapper {
    int countByExample(ICommentExample example);

    int deleteByExample(ICommentExample example);

    int deleteByPrimaryKey(Long commentid);

    int insert(IComment record);

    int insertSelective(IComment record);

    List<IComment> selectByExample(ICommentExample example);

    IComment selectByPrimaryKey(Long commentid);

    int updateByExampleSelective(@Param("record") IComment record, @Param("example") ICommentExample example);

    int updateByExample(@Param("record") IComment record, @Param("example") ICommentExample example);

    int updateByPrimaryKeySelective(IComment record);

    int updateByPrimaryKey(IComment record);
}