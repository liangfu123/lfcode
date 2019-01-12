package com.tsjg.core.dao;

import com.tsjg.core.bean.Book;
import java.util.List;

public interface MyBookMapper {
	int findNewBooksCount();
	
	List<Book> findNewBooks(Book book);
	
	void updateBookIsget(String[] isbn);

    int findReaderBookCount(Integer userId);
    
    List<Book> findReaderBook(Book book);
    
    void updateBookNum(String isbn);
    
    int findMultiBookSearchCount(Book book);
    
    List<Book> findMultiBookSearch(Book book);
    
    int findBookSearchCount(Book book);
    
    List<Book> findBookSearch(Book book);
    
    int findBookRankCount();
    
    List<Book> findBookRank(Book book);
    
    Book findBookInfo(String isbn);
    
    int findBookCnclassCount(String bookCnclassLetter);
    
    List<Book> findBookCnclass(Book book);
    
    int findBookCategoryCount(Integer bookSubjectId);
    
    List<Book> findBookCategory(Book book);
    
    int findBookSubjectCount(Integer bookSubjectId);
    
    List<Book> findBookSubject(Book book);
    
    void deleteBatch(String[] isbns);
    
    int findCountBook();
    
    List<Book> findAllBook(Book book);

}