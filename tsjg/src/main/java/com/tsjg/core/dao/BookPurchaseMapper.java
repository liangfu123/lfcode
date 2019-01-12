package com.tsjg.core.dao;

import com.tsjg.core.bean.BookPurchase;
import com.tsjg.core.bean.BookPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookPurchaseMapper {
    long countByExample(BookPurchaseExample example);

    int deleteByExample(BookPurchaseExample example);

    int deleteByPrimaryKey(Integer bookPurchaseId);

    int insert(BookPurchase record);

    int insertSelective(BookPurchase record);

    List<BookPurchase> selectByExample(BookPurchaseExample example);

    BookPurchase selectByPrimaryKey(Integer bookPurchaseId);

    int updateByExampleSelective(@Param("record") BookPurchase record, @Param("example") BookPurchaseExample example);

    int updateByExample(@Param("record") BookPurchase record, @Param("example") BookPurchaseExample example);

    int updateByPrimaryKeySelective(BookPurchase record);

    int updateByPrimaryKey(BookPurchase record);
}