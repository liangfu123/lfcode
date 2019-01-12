package com.tsjg.core.dao;

import com.tsjg.core.bean.Mag;
import com.tsjg.core.bean.MagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MagMapper {
    long countByExample(MagExample example);

    int deleteByExample(MagExample example);

    int deleteByPrimaryKey(Integer magId);

    int insert(Mag record);

    int insertSelective(Mag record);

    List<Mag> selectByExample(MagExample example);

    Mag selectByPrimaryKey(Integer magId);

    int updateByExampleSelective(@Param("record") Mag record, @Param("example") MagExample example);

    int updateByExample(@Param("record") Mag record, @Param("example") MagExample example);

    int updateByPrimaryKeySelective(Mag record);

    int updateByPrimaryKey(Mag record);
}