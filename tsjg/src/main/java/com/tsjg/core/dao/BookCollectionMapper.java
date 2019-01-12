package com.tsjg.core.dao;

import com.tsjg.core.bean.BookCollection;
import com.tsjg.core.bean.BookCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookCollectionMapper {
    long countByExample(BookCollectionExample example);

    int deleteByExample(BookCollectionExample example);

    int deleteByPrimaryKey(Integer bookCollectionId);

    int insert(BookCollection record);

    int insertSelective(BookCollection record);

    List<BookCollection> selectByExample(BookCollectionExample example);

    BookCollection selectByPrimaryKey(Integer bookCollectionId);

    int updateByExampleSelective(@Param("record") BookCollection record, @Param("example") BookCollectionExample example);

    int updateByExample(@Param("record") BookCollection record, @Param("example") BookCollectionExample example);

    int updateByPrimaryKeySelective(BookCollection record);

    int updateByPrimaryKey(BookCollection record);
}