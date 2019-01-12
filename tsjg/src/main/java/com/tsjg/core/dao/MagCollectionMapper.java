package com.tsjg.core.dao;

import com.tsjg.core.bean.MagCollection;
import com.tsjg.core.bean.MagCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MagCollectionMapper {
    long countByExample(MagCollectionExample example);

    int deleteByExample(MagCollectionExample example);

    int deleteByPrimaryKey(Integer magCollectionId);

    int insert(MagCollection record);

    int insertSelective(MagCollection record);

    List<MagCollection> selectByExample(MagCollectionExample example);

    MagCollection selectByPrimaryKey(Integer magCollectionId);

    int updateByExampleSelective(@Param("record") MagCollection record, @Param("example") MagCollectionExample example);

    int updateByExample(@Param("record") MagCollection record, @Param("example") MagCollectionExample example);

    int updateByPrimaryKeySelective(MagCollection record);

    int updateByPrimaryKey(MagCollection record);
}