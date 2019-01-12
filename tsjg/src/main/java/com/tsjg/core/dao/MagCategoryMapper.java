package com.tsjg.core.dao;

import com.tsjg.core.bean.MagCategory;
import com.tsjg.core.bean.MagCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MagCategoryMapper {
    long countByExample(MagCategoryExample example);

    int deleteByExample(MagCategoryExample example);

    int deleteByPrimaryKey(Integer magCategoryId);

    int insert(MagCategory record);

    int insertSelective(MagCategory record);

    List<MagCategory> selectByExample(MagCategoryExample example);

    MagCategory selectByPrimaryKey(Integer magCategoryId);

    int updateByExampleSelective(@Param("record") MagCategory record, @Param("example") MagCategoryExample example);

    int updateByExample(@Param("record") MagCategory record, @Param("example") MagCategoryExample example);

    int updateByPrimaryKeySelective(MagCategory record);

    int updateByPrimaryKey(MagCategory record);
}