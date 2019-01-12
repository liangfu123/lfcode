package com.tsjg.core.dao;

import com.tsjg.core.bean.BookUserdefined;
import com.tsjg.core.bean.BookUserdefinedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookUserdefinedMapper {
    long countByExample(BookUserdefinedExample example);

    int deleteByExample(BookUserdefinedExample example);

    int deleteByPrimaryKey(Integer bookUserdefinedId);

    int insert(BookUserdefined record);

    int insertSelective(BookUserdefined record);
    
    /***********************************/
    int findUserBookJgCount(Integer userId);
    
    List<BookUserdefined> findUserBookJg(BookUserdefined bookUserdefined);
    /***********************************/

    List<BookUserdefined> selectByExample(BookUserdefinedExample example);

    BookUserdefined selectByPrimaryKey(Integer bookUserdefinedId);

    int updateByExampleSelective(@Param("record") BookUserdefined record, @Param("example") BookUserdefinedExample example);

    int updateByExample(@Param("record") BookUserdefined record, @Param("example") BookUserdefinedExample example);

    int updateByPrimaryKeySelective(BookUserdefined record);

    int updateByPrimaryKey(BookUserdefined record);
}