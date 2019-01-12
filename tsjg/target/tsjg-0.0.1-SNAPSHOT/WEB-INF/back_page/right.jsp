<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>新书发布</title>
<script type="text/javascript">
	function check(){
		var excel_file = $("#excel_file").val();
		if(excel_file == "" || excel_file.length == 0){
			alert("请选择文件路径！");
			return false;
		}else{
			return true;
		}
	}
	
	function btnSub(code){
		var url = "${pageContext.request.contextPath}/backpage/editBook.do";
		var params = {"code":code};
		$.post(url,params,function (data){
			var bookinfo = data.bookinfo;
			$("#bName").val(bookinfo[0].bookName);
			$("#bAuthor").val(bookinfo[0].bookAuthor);
			$("#bis").val(bookinfo[0].isbn);
			$("#bPublish").val(bookinfo[0].bookPublish);
			$("#bSummery").val(bookinfo[0].bookSummary);
		},"json");
	}
	
	function subject(code){
		var ipt = document.getElementById("bis");
		var bis = ipt.value;
		if(code == 2){
			alert("请选择");
		}
		if(bis.length == 13 || bis.length == 10 && code == 0){
			/* alert(code); */
			var url = "${pageContext.request.contextPath}/backpage/bookSort.do";
			$.post(url,function (data){
				var bSubject = data.bSubject;
				var html = "";
				for(var i = 0; i < bSubject.length ; i++){
					html += '<option value = " '+ bSubject[i].bookSubjectId +' ">' + bSubject[i].bookSubjectName + '</option>';
				}
				$("#bsubject").html(html);
								
				var bCategory = data.bCategory;
				var html = "";
				for(var i = 0; i < bCategory.length ; i++){
					html += '<option value = " '+ bCategory[i].bookCategoryId +' ">' + bCategory[i].bookCategoryName + '</option>';
				}
				$("#bcategoty").html(html);
			},"json");
		}
		if(code == 1){
			/* alert(code); */
			var url = "${pageContext.request.contextPath}/backpage/magSort.do";
			$.post(url,function (data){
				var mSubject = data.mSubject;
				var html = "";
				for(var i = 0; i < mSubject.length ; i++){
					html += '<option value = " '+ mSubject[i].magSubjectId +' ">' + mSubject[i].magSubjectName + '</option>';
				}
				$("#bsubject").html(html);
								
				var mContent = data.mContent;
				var html = "";
				for(var i = 0; i < mContent.length ; i++){
					html += '<option value = " '+ mContent[i].magContentId +' ">' + mContent[i].magContentName + '</option>';
				}
				$("#bcategoty").html(html);
			},"json");
		}
		
	}

</script>
</head>
<body style="background-color: rgba(10%,10%,10%,6%);">
	<div class="back_right">
		<div class="back_right_box">
			<form action="${pageContext.request.contextPath }/backpage/addBooks.do" method="post" enctype="multipart/form-data" onsubmit="return check()">
				<table class="back_right_form">
					<tr>
						<td width="120px">
							<select style="width: 90px;margin: 0 auto;" name="choiceType" class="form-control">
							  <option value="0">图书</option>
							  <option value="1">期刊</option>
							</select>
						</td>
						<td>
							<input type="file" id="excel_file" name="file">
						</td>
						<td width="70px">
							<input class="btn btn-default" type="submit" value="导入">
						</td>
						<td>
							<a class="btn btn-default" href="javascript:void(0);" role="button">删除</a>
						</td>
						<td>
							<p style="color: red;margin-top: 10px;margin-left: 10px;">${msg }</p>
						</td>
					</tr>
				</table>
			</form>
			
			<table border="1" class="back_right_list">
				<tr style="height: 30px;color: red;font-size: 14px;">
					<td width="15px">
						<div class="checkbox">
						  <label>
						    &nbsp;&nbsp;<input type="checkbox" id="blankCheckbox" value="option1" aria-label="...">
						  </label>
						</div>
					</td>
					<td>
						题名
					</td>
					<td>
						作者
					</td>
					<td>
						ISBN/ISSN
					</td>
					<td>
						封面
					</td>
					<td>
						出版社
					</td>
					<td>
						摘要
					</td>
					<td>
						操作
					</td>
				</tr>
				
				<c:forEach items="${books.list }" var="entry">
				
					<tr style="height: 40px;">
						<td width="15px">
							<div class="checkbox">
							  <label>
							    &nbsp;&nbsp;<input type="checkbox" id="blankCheckbox" value="option1" aria-label="...">
							  </label>
							</div>
						</td>
						<td>
							<a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toDetails.shtml')">${entry.bookName } </a>
						</td>
						<td>
							${entry.bookAuthor }
						</td>
						<td width="120px">
							${entry.isbn }
						</td>
						<td width="70px">
							<img height="40px" width="40px" src="${pageContext.request.contextPath }/img/book_hlm.jpg ">
						</td>
						<td>
							${entry.bookPublish }
						</td>
						<td width="80px">
							<button style="font-size: 12px;height: 35px;" type="button" class="btn btn-lg btn-danger" data-toggle="popover" title="简介" data-content="${entry.bookSummary }">点我</button>
						</td>
						<td width="140px">
							<a class="btn btn-default" href="javascript:void(0);" role="button">删除</a>&nbsp;&nbsp;
							<!-- Button trigger modal -->
							<button style="font-size: 12px;height: 35px;" type="button" onclick="btnSub('${entry.isbn }')" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
							  编辑
							</button>
						</td>
					</tr>
				
				</c:forEach>
								
			</table>
			
			<div style="width: 920px;height: 30px;margin-left: 20px;">
				
				<nav aria-label="Page navigation">
				  <ul style="margin-left: 280px;" class="pagination">
				    
				    <c:forEach items="${books.pageView }" var="page">
				    	${page }
				    </c:forEach>
				  
				  </ul>
				</nav>
				
			</div>
			
		</div>
		
		<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div style="width: 800px;" class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">编辑</h4>
		      </div>
		      <form action="${pageContext.request.contextPath }/" method="post">
			      <div style="width: 800px;" class="modal-body">
			        <table style="width: 770px;">
			        	<tr height="40">
				        	<td style="text-align: right;">题名：</td>
				        	<td>
				        		<input style="width: 220px;" id="bName" type="text" class="form-control" name="">
				        	</td>
				        	
				        	<td style="text-align: right;">作者：</td>
				        	<td>
					        	<input style="width: 220px;" id="bAuthor" type="text" class="form-control" name="">
				        	</td>
			        	</tr>
			        
			        	<tr height="40">
			        		<td style="text-align: right;">ISBN/ISSN：</td>
				        	<td>
				        		<input style="width: 220px;" id="bis" type="text" class="form-control" name="">
				        	</td>
				        	
				        	<td style="text-align: right;">出版社：</td>
				        	<td>
				        		<input style="width: 220px;" id="bPublish" type="text" class="form-control" name="">
				        	</td>
			        	</tr>
			        				        	
			        </table>
			        
			        <table style="margin-left: 50px;">
			        
			        	<tr height="40">
			        		<td>
			        			<select style="width: 95px;" onchange="subject(this.value)" class="form-control">
									  <option value="2">请选择</option>
									  <option value="0">图书</option>
									  <option value="1">期刊</option>
								</select>
			        		</td>
				        	<td style="text-align: right;width: 100px;">
				        		学科分类：
				        	</td>
				        	<td>
				        		<select style="width: 140px;" id="bsubject" name="college" class="form-control">
								  
								</select>
				        	</td>
				        	
				        	<td style="text-align: right;width: 100px;">普通分类：</td>
				        	<td>
				        		<select style="width: 220px;" id="bcategoty" name="college" class="form-control">
								  
								</select>
				        	</td>
			        	</tr>
			        
			        </table>
			        	
			        <table style="width: 700px;height: 220px;margin-left: 50px;">
			        	<tr>
			        		<td style="text-align: right;">封面：</td>
				        	<td width="200px">
				        		<div style="width: 200px;" class="form-group"><br>
								    <input type="file" id="file" onchange="filechange(event)">
								    <div id="picBox">
								    	<img src="" id="img" width="130px" height="140px" style="margin-top: 6px;margin-left: 10px;">
								    </div>
								</div>
				        	</td>
			       
				        	<td style="text-align: right;">摘要：</td>
				        	<td width="350px;">
				        		<textarea style="height: 200px;resize:none;" id="bSummery" class="form-control" rows="3" ></textarea>
							</td>
			        	</tr>
			        </table>
			        	
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			        <button type="submit" class="btn btn-primary">保存</button>
			      </div>
		      </form>
		    </div>
		  </div>
		</div>
		
	</div>
</body>
<script type="text/javascript">
	var filechange = function(event){
		var files = event.target.files, file;
		if(files && files.length > 0){
			file = files[0];
			var URL = window.URL || window.webkitURL;
			var imgURL = URL.createObjectURL(file);
			$("#img").attr("src",imgURL);
		}
	};
	
	$(function(){
		$("[data-toggle='tooltip']").tooltip();
	});
	$(function(){
		$("[data-toggle='popover']").popover();
	});
</script>
</html>
