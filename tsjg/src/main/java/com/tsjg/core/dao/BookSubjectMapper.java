package com.tsjg.core.dao;

import com.tsjg.core.bean.BookSubject;
import com.tsjg.core.bean.BookSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookSubjectMapper {
    long countByExample(BookSubjectExample example);

    int deleteByExample(BookSubjectExample example);

    int deleteByPrimaryKey(Integer bookSubjectId);

    int insert(BookSubject record);

    int insertSelective(BookSubject record);

    List<BookSubject> selectByExample(BookSubjectExample example);

    BookSubject selectByPrimaryKey(Integer bookSubjectId);

    int updateByExampleSelective(@Param("record") BookSubject record, @Param("example") BookSubjectExample example);

    int updateByExample(@Param("record") BookSubject record, @Param("example") BookSubjectExample example);

    int updateByPrimaryKeySelective(BookSubject record);

    int updateByPrimaryKey(BookSubject record);
}