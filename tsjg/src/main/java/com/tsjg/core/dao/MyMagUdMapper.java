package com.tsjg.core.dao;

import java.util.List;

import com.tsjg.core.bean.MagUserdefined;

public interface MyMagUdMapper {
	int findUserMagCount();
	
	List<MagUserdefined> findUserMag(MagUserdefined magUserdefined);
	
	void deleteMagsZj(String[] magIssn);
	
	List<MagUserdefined> findMagsZjAll();
}
