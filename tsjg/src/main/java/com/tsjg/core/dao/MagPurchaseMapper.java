package com.tsjg.core.dao;

import com.tsjg.core.bean.MagPurchase;
import com.tsjg.core.bean.MagPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MagPurchaseMapper {
    long countByExample(MagPurchaseExample example);

    int deleteByExample(MagPurchaseExample example);

    int deleteByPrimaryKey(Integer magPurchaseId);

    int insert(MagPurchase record);

    int insertSelective(MagPurchase record);

    List<MagPurchase> selectByExample(MagPurchaseExample example);

    MagPurchase selectByPrimaryKey(Integer magPurchaseId);

    int updateByExampleSelective(@Param("record") MagPurchase record, @Param("example") MagPurchaseExample example);

    int updateByExample(@Param("record") MagPurchase record, @Param("example") MagPurchaseExample example);

    int updateByPrimaryKeySelective(MagPurchase record);

    int updateByPrimaryKey(MagPurchase record);
}