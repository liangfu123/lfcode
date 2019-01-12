package com.tsjg.core.dao;

import com.tsjg.core.bean.MagComment;
import com.tsjg.core.bean.MagCommentExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MagCommentMapper {
    long countByExample(MagCommentExample example);

    int deleteByExample(MagCommentExample example);

    int deleteByPrimaryKey(Integer mcId);

    int insert(MagComment record);

    int insertSelective(MagComment record);

    /*******/
    List<MagComment> findMagComment(Integer magId);
    /*******/
    
    List<MagComment> selectByExample(MagCommentExample example);

    MagComment selectByPrimaryKey(Integer mcId);

    int updateByExampleSelective(@Param("record") MagComment record, @Param("example") MagCommentExample example);

    int updateByExample(@Param("record") MagComment record, @Param("example") MagCommentExample example);

    int updateByPrimaryKeySelective(MagComment record);

    int updateByPrimaryKey(MagComment record);
}