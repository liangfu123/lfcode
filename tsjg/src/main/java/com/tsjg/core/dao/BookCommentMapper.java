package com.tsjg.core.dao;

import com.tsjg.core.bean.BookComment;
import com.tsjg.core.bean.BookCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookCommentMapper {
    long countByExample(BookCommentExample example);

    int deleteByExample(BookCommentExample example);

    int deleteByPrimaryKey(Integer bcId);

    int insert(BookComment record);

    int insertSelective(BookComment record);

    /*******/
    List<BookComment> findBookComment(Integer bookId);
    /*******/
    
    List<BookComment> selectByExample(BookCommentExample example);

    BookComment selectByPrimaryKey(Integer bcId);

    int updateByExampleSelective(@Param("record") BookComment record, @Param("example") BookCommentExample example);

    int updateByExample(@Param("record") BookComment record, @Param("example") BookCommentExample example);

    int updateByPrimaryKeySelective(BookComment record);

    int updateByPrimaryKey(BookComment record);
}