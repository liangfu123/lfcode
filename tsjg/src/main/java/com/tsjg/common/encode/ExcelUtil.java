package com.tsjg.common.encode;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.tsjg.core.bean.Book;
import com.tsjg.core.bean.BookUserdefined;
import com.tsjg.core.bean.Mag;
import com.tsjg.core.bean.MagPurchase;
import com.tsjg.core.bean.MagUserdefined;
import com.tsjg.core.bean.MyBookPurchase;

public interface ExcelUtil {
	List<Book> readExcelBook(MultipartFile file) throws Exception;
	List<Mag> readExcelMag(MultipartFile file) throws Exception;
	String writeExcelBook(List<MyBookPurchase> list) throws Exception;
	String writeExcelMag(List<MagPurchase> list) throws Exception;
	String writeExcelBookZj(List<BookUserdefined> list) throws Exception;
	String writeExcelMagZj(List<MagUserdefined> list) throws Exception;
}
