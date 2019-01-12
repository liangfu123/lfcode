package com.tsjg.core.dao;

import com.tsjg.core.bean.Mag;
import java.util.List;

public interface MyMagMapper {
	int findNewMagsCount();
	
	List<Mag> findNewMags(Mag mag);
	
	void updateMagIsget(String[] magIssn);
	
    int findReaderMagCount(Integer userId);
    
    List<Mag> findReaderMag(Mag mag);
    
    void updateMagNum(String magIssn);
    
    int findMagSearchCount(Mag mag);
    
    List<Mag> findMagSearch(Mag mag);
    
    int findMagRankCount();
    
    List<Mag> findMagRank(Mag mag);
    
    Mag findMagInfo(String magIssn);
    
    int findMagCategoryCount(Integer categoryId);
    
    List<Mag> findMagCategory(Mag mag);
    
    void deleteBatch(String[] magIssn);
    
    int findCountMag();
    
    List<Mag> findAllMag(Mag mag);
}