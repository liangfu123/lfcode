package com.tsjg.common.encode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.tsjg.core.bean.Book;
import com.tsjg.core.bean.BookUserdefined;
import com.tsjg.core.bean.Mag;
import com.tsjg.core.bean.MagPurchase;
import com.tsjg.core.bean.MagUserdefined;
import com.tsjg.core.bean.MyBookPurchase;

public class ExcelUtilImpl implements ExcelUtil {
	
	//总行数
    private int totalRows = 0;  
    //总条数
    private int totalCells = 0;
	//导入图书
	public List<Book> readExcelBook(MultipartFile file) throws Exception {
		Workbook workbook = null;//相当于一个excel
		Sheet sheet1 = null;
        CommonsMultipartFile cf= (CommonsMultipartFile)file; 
        
        File mfile = new  File("E:\\fileupload");
        //创建一个目录 （它的路径名由当前 File 对象指定，包括任一必须的父路径。）
        if (!mfile.exists()) mfile.mkdirs();
        //新建一个文件
        File file1 = new File("E:\\fileupload\\fileupload" + new Date().getTime() + ".xlsx"); 
        //将上传的文件写入新建的文件中
        try {
            cf.getFileItem().write(file1); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        workbook = WorkbookFactory.create(new FileInputStream(file1));
		sheet1 = workbook.getSheetAt(0);//excel中的sheet
		
		//得到Excel的行数
        this.totalRows = sheet1.getPhysicalNumberOfRows();
       
	    //得到Excel的列数(前提是有行数)
	    if(totalRows>=1 && sheet1.getRow(0) != null){
	         this.totalCells=sheet1.getRow(0).getPhysicalNumberOfCells();
	    }
		
		List<Book> bookList = new ArrayList<Book>();
		
		Book book = null;            
	      //循环Excel行数,从第二行开始。标题不入库
	       for(int r=1;r<totalRows;r++){
	           Row row = sheet1.getRow(r);
	           if (row == null) continue;
	           book = new Book();
	           
	           //循环Excel的列
	           for(int c = 0; c <this.totalCells; c++){    
	               Cell cell = row.getCell(c);
	               cell.setCellType(Cell.CELL_TYPE_STRING);
	               if (null != cell){
	                   if(c==0){
	                	   book.setBookName(cell.getStringCellValue());//图书名称
	                   }else if(c==1){
	                	   book.setBookAuthor(cell.getStringCellValue());;//作者
	                   }else if(c==2){
	                	   book.setIsbn(cell.getStringCellValue());//ISBN
	                   }else if(c==3){
	                	   book.setBookPublish(cell.getStringCellValue());//出版社
	                   }else if(c==4){
	                	   book.setBookSummary(cell.getStringCellValue());//摘要
	                   }else if(c==5){
	                	   book.setBookNumberpage(cell.getStringCellValue());//页数
	                   }else if(c==6){
	                	   book.setBookPubtime(cell.getStringCellValue());//出版时间
	                   }else if(c==7){
	                	   book.setBookPrice(cell.getStringCellValue());//图书定价
	                   }else if(c==8){
	                	   book.setBookCnclassLetter(cell.getStringCellValue());//图书定价
	                   }
	               }
	           }
	           //添加图书
	           bookList.add(book);
	       } 
       
       return bookList;
	}
	//导入期刊
	public List<Mag> readExcelMag(MultipartFile file) throws Exception {
		Workbook workbook = null;//相当于一个excel
		Sheet sheet1 = null;
        CommonsMultipartFile cf= (CommonsMultipartFile)file; 
        
        File mfile = new  File("E:\\fileupload");
        //创建一个目录 （它的路径名由当前 File 对象指定，包括任一必须的父路径。）
        if (!mfile.exists()) mfile.mkdirs();
        //新建一个文件
        File file1 = new File("E:\\fileupload\\fileupload" + new Date().getTime() + ".xlsx"); 
        //将上传的文件写入新建的文件中
        try {
            cf.getFileItem().write(file1); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        workbook = WorkbookFactory.create(new FileInputStream(file1));
		sheet1 = workbook.getSheetAt(0);//excel中的sheet
		
		//得到Excel的行数
        this.totalRows = sheet1.getPhysicalNumberOfRows();
       
	    //得到Excel的列数(前提是有行数)
	    if(totalRows>=1 && sheet1.getRow(0) != null){
	         this.totalCells=sheet1.getRow(0).getPhysicalNumberOfCells();
	    }
		
		List<Mag> magList = new ArrayList<Mag>();
		
		Mag mag = null;            
	      //循环Excel行数,从第二行开始。标题不入库
	       for(int r=1;r<totalRows;r++){
	           Row row = sheet1.getRow(r);
	           if (row == null) continue;
	           mag = new Mag();
	           
	           //循环Excel的列
	           for(int c = 0; c <this.totalCells; c++){    
	               Cell cell = row.getCell(c);
	               cell.setCellType(Cell.CELL_TYPE_STRING);
	               if (null != cell){
	                   if(c==0){
	                	   mag.setMagTitle(cell.getStringCellValue());//期刊标题
	                   }else if(c==1){
	                	   mag.setMagCompetent(cell.getStringCellValue());//主管单位
	                   }else if(c==2){
	                	   mag.setMagHostunit(cell.getStringCellValue());//主办单位
	                   }else if(c==3){
	                	   mag.setMagMailnum(cell.getStringCellValue());//邮发代号
	                   }else if(c==4){
	                	   mag.setMagIssn(cell.getStringCellValue());//ISSN
	                   }else if(c==5){
	                	   mag.setMagCn(cell.getStringCellValue());//国内刊号
	                   }else if(c==6){
	                	   mag.setMagPubcycle(cell.getStringCellValue());//出版周期
	                   }else if(c==7){
	                	   mag.setMagIntro(cell.getStringCellValue());//期刊简介
	                   }else if(c==8){
	                	   mag.setMagPrice(cell.getStringCellValue());//期刊价格
	                   }
	               }
	           }
	           //添加期刊
	           magList.add(mag);
	       } 
       
       return magList;
	}
	//导出图书
	public String writeExcelBook(List<MyBookPurchase> list) throws IOException {
		
		HSSFWorkbook workbook = new HSSFWorkbook();//新建excle
		HSSFSheet sheet = workbook.createSheet();//新疆一个Sheet
		HSSFRow row = sheet.createRow(0);//第一行
		row.createCell(0).setCellValue("题名");//第一行第一列的值
		row.createCell(1).setCellValue("作者");
		row.createCell(2).setCellValue("ISBN");
		row.createCell(3).setCellValue("出版社");
		row.createCell(4).setCellValue("出版时间");
		row.createCell(5).setCellValue("定价");
		row.createCell(6).setCellValue("荐购次数");
		
		for(MyBookPurchase mybookPurchase : list){
			//依次建立一行
			HSSFRow r = sheet.createRow(sheet.getLastRowNum()+1);
			r.createCell(0).setCellValue(mybookPurchase.getBook().getBookName());
			r.createCell(1).setCellValue(mybookPurchase.getBook().getBookAuthor());
			r.createCell(2).setCellValue(mybookPurchase.getBook().getIsbn());
			r.createCell(3).setCellValue(mybookPurchase.getBook().getBookPublish());
			r.createCell(4).setCellValue(mybookPurchase.getBook().getBookPubtime());
			r.createCell(5).setCellValue(mybookPurchase.getBook().getBookPrice());
			r.createCell(6).setCellValue(mybookPurchase.getBook().getBookNum());
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String url = "e:\\"+"book"+format.format(new Date()) + ".xlsx";
		//得到输出流
		OutputStream out = new FileOutputStream(url);
		//写出数据
		workbook.write(out);
		
		out.close();
		
		return url;
	}
	//导出期刊
	public String writeExcelMag(List<MagPurchase> list) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();//新建excel
		HSSFSheet sheet = workbook.createSheet();//新建一个Sheet
		HSSFRow row = sheet.createRow(0);//第一行
		row.createCell(0).setCellValue("期刊标题");//第一行第一列的值
		row.createCell(1).setCellValue("主管单位");
		row.createCell(2).setCellValue("主办单位");
		row.createCell(3).setCellValue("邮发代号");
		row.createCell(4).setCellValue("ISSN");
		row.createCell(5).setCellValue("国内刊号");
		row.createCell(6).setCellValue("出版周期");
		row.createCell(7).setCellValue("年价");
		row.createCell(8).setCellValue("荐购次数");
		
		for(MagPurchase magPurchase : list){
			//依次建立一行
			HSSFRow r = sheet.createRow(sheet.getLastRowNum()+1);
			r.createCell(0).setCellValue(magPurchase.getMag().getMagTitle());
			r.createCell(1).setCellValue(magPurchase.getMag().getMagCompetent());
			r.createCell(2).setCellValue(magPurchase.getMag().getMagHostunit());
			r.createCell(3).setCellValue(magPurchase.getMag().getMagMailnum());
			r.createCell(4).setCellValue(magPurchase.getMag().getMagIssn());
			r.createCell(5).setCellValue(magPurchase.getMag().getMagCn());
			r.createCell(6).setCellValue(magPurchase.getMag().getMagPubcycle());
			r.createCell(7).setCellValue(magPurchase.getMag().getMagPrice());
			r.createCell(8).setCellValue(magPurchase.getMag().getMagNum());
		}
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String url = "e:\\"+"mag"+format.format(new Date()) + ".xlsx";
		
		//得到输出流
		OutputStream out = new FileOutputStream(url);
		//写出数据
		workbook.write(out);
		
		out.close();
		return url;
	}
	//导出自荐图书
	public String writeExcelBookZj(List<BookUserdefined> list) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();//新建excle
		HSSFSheet sheet = workbook.createSheet();//新建一个Sheet
		HSSFRow row = sheet.createRow(0);//第一行
		row.createCell(0).setCellValue("题名");//第一行第一列的值
		row.createCell(1).setCellValue("作者");
		row.createCell(2).setCellValue("ISBN");
		row.createCell(3).setCellValue("出版社");
		row.createCell(4).setCellValue("出版时间");
		
		for(BookUserdefined bookUserdefined : list){
			//依次建立一行
			HSSFRow r = sheet.createRow(sheet.getLastRowNum()+1);
			r.createCell(0).setCellValue(bookUserdefined.getBookUdName());
			r.createCell(1).setCellValue(bookUserdefined.getBookUdAuthor());
			r.createCell(2).setCellValue(bookUserdefined.getIsbn());
			r.createCell(3).setCellValue(bookUserdefined.getBookUdPublish());
			r.createCell(4).setCellValue(bookUserdefined.getBookUdPubtime());
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String url = "e:\\"+"bookZj"+format.format(new Date()) + ".xlsx";
		//得到输出流
		OutputStream out = new FileOutputStream(url);
		//写出数据
		workbook.write(out);
		
		out.close();
		
		return url;
	}
	//导出自荐期刊
	public String writeExcelMagZj(List<MagUserdefined> list) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();//新建excel
		HSSFSheet sheet = workbook.createSheet();//新建一个Sheet
		HSSFRow row = sheet.createRow(0);//第一行
		row.createCell(0).setCellValue("期刊标题");//第一行第一列的值
		row.createCell(1).setCellValue("主管单位");
		row.createCell(2).setCellValue("主办单位");
		row.createCell(3).setCellValue("邮发代号");
		row.createCell(4).setCellValue("ISSN");
		row.createCell(5).setCellValue("国内刊号");
		
		for(MagUserdefined magUserdefined : list){
			//依次建立一行
			HSSFRow r = sheet.createRow(sheet.getLastRowNum()+1);
			r.createCell(0).setCellValue(magUserdefined.getMagUdTitle());
			r.createCell(1).setCellValue(magUserdefined.getMagUdCompetent());
			r.createCell(2).setCellValue(magUserdefined.getMagUdHostunit());
			r.createCell(3).setCellValue(magUserdefined.getMagUdMailnum());
			r.createCell(4).setCellValue(magUserdefined.getMagIssn());
			r.createCell(5).setCellValue(magUserdefined.getMagUdCn());
		}
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String url = "e:\\"+"magZj"+format.format(new Date()) + ".xlsx";
		
		//得到输出流
		OutputStream out = new FileOutputStream(url);
		//写出数据
		workbook.write(out);
		
		out.close();
		return url;
	}
}
