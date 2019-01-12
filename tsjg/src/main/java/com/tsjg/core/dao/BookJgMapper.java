package com.tsjg.core.dao;

import com.tsjg.core.bean.BookJg;
import com.tsjg.core.bean.BookJgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookJgMapper {
	/**********************************/
	void updateBookIsget(String[] isbn);
	/**********************************/
	
    long countByExample(BookJgExample example);

    int deleteByExample(BookJgExample example);

    int deleteByPrimaryKey(Integer bookjgId);

    int insert(BookJg record);

    int insertSelective(BookJg record);

    List<BookJg> selectByExample(BookJgExample example);

    BookJg selectByPrimaryKey(Integer bookjgId);

    int updateByExampleSelective(@Param("record") BookJg record, @Param("example") BookJgExample example);

    int updateByExample(@Param("record") BookJg record, @Param("example") BookJgExample example);

    int updateByPrimaryKeySelective(BookJg record);

    int updateByPrimaryKey(BookJg record);
}