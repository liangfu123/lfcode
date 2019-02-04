package com.tsjg.core.dao;

import java.util.List;

import com.tsjg.core.bean.BookUserdefined;

public interface MyBookUdMapper {
	int findUserBookCount();
	
	List<BookUserdefined> findUserBook(BookUserdefined bookUserdefined);
	
	void deleteBooksZj(String[] isbn);
}
