package com.tsjg.core.dao;

import com.tsjg.core.bean.MagJg;
import com.tsjg.core.bean.MagJgExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MagJgMapper {
	/********************************/
	void updateMagIsget(String[] magIssn);
	/********************************/
	
    long countByExample(MagJgExample example);

    int deleteByExample(MagJgExample example);

    int deleteByPrimaryKey(Integer magjgId);

    int insert(MagJg record);

    int insertSelective(MagJg record);

    List<MagJg> selectByExample(MagJgExample example);

    MagJg selectByPrimaryKey(Integer magjgId);

    int updateByExampleSelective(@Param("record") MagJg record, @Param("example") MagJgExample example);

    int updateByExample(@Param("record") MagJg record, @Param("example") MagJgExample example);

    int updateByPrimaryKeySelective(MagJg record);

    int updateByPrimaryKey(MagJg record);

}