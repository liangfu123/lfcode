package com.tsjg.core.dao;

import com.tsjg.core.bean.MagPurchase;

import java.util.List;

public interface MyMagPurchaseMapper {
    
    List<MagPurchase> selectPurchaseMagAll();
    
    void deleteMags(String[] issn);
    
    int selectPurchaseMagCount();
    
    List<MagPurchase> selectPurchaseMagList(MagPurchase magPurchase);

}