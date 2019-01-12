package com.tsjg.core.dao;

import com.tsjg.core.bean.MagUserdefined;
import com.tsjg.core.bean.MagUserdefinedExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MagUserdefinedMapper {
    long countByExample(MagUserdefinedExample example);

    int deleteByExample(MagUserdefinedExample example);

    int deleteByPrimaryKey(Integer magUserdefinedId);

    int insert(MagUserdefined record);

    int insertSelective(MagUserdefined record);
    
    /********************************/
    int findUserMagJgCount(Integer userId);

    List<MagUserdefined> findUserMagJg(MagUserdefined magUserdefined);
    /********************************/
    
    List<MagUserdefined> selectByExample(MagUserdefinedExample example);

    MagUserdefined selectByPrimaryKey(Integer magUserdefinedId);

    int updateByExampleSelective(@Param("record") MagUserdefined record, @Param("example") MagUserdefinedExample example);

    int updateByExample(@Param("record") MagUserdefined record, @Param("example") MagUserdefinedExample example);

    int updateByPrimaryKeySelective(MagUserdefined record);

    int updateByPrimaryKey(MagUserdefined record);

}