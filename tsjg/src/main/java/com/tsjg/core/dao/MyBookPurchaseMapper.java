package com.tsjg.core.dao;

import com.tsjg.core.bean.BookPurchase;
import com.tsjg.core.bean.MyBookPurchase;

import java.util.List;

public interface MyBookPurchaseMapper {
    
    List<MyBookPurchase> selectPurchaseBookAll();
    
    void deleteBooks(String[] isbn);
    
    int selectPurchaseBookCount();
    
    List<BookPurchase> selectPurchaseBookList(MyBookPurchase mybookPurchase);
    
}