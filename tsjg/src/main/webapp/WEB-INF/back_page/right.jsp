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
<title>图书管理</title>
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
			$("#img").attr("src", "http://localhost:8024/image-web/" + bookinfo[0].bookImgurl);
			
			var bSubject = data.bSubject;
			var html = "<option>==请选择==</option>";
			for(var i = 0; i < bSubject.length ; i++){
				html += '<option value = " '+ bSubject[i].bookSubjectId +' ">' + bSubject[i].bookSubjectName + '</option>';
			}
			$("#bsubject").html(html);
			
			var bCategory = data.bCategory;
			var html = "<option>==请选择==</option>";
			for(var i = 0; i < bCategory.length ; i++){
				html += '<option value = " '+ bCategory[i].bookCategoryId +' ">' + bCategory[i].bookCategoryName + '</option>';
			}
			$("#bcategoty").html(html);
			
		},"json");
	}
	
	function delOne(isbn){
		var url = "${pageContext.request.contextPath}/backpage/deleteOneBook.do";
		var params = {"isbn":isbn};
		$.post(url,params,function (data){
			if(data.result == 1){
				alert("删除成功");
			}else{
				alert("删除失败");
			}
		},"json");
	}
	
	//全选
	function checkBox(name,checked){
		$("input[name='"+ name +"']").attr("checked",checked);
	}
	
	function delBatch(){
		var s = $("input[name='checkisbn']:checked").length;
		if(s <= 0){
			alert("请至少选一个!");
			return false;
		}
		
		if(!confirm("你确定删除吗？")){
			return false;
		}
		
		$("#jvFormDel").attr("action","${pageContext.request.contextPath }/backpage/deleteBatchBook.do");
		$("#jvFormDel").attr("method","post").submit();
	}
	
	function newBookBtn(){
		var s = $("input[name='checkisbn']:checked").length;
		if(s <= 0){
			alert("请至少选一个!");
			return false;
		}
		
		if(!confirm("你确定发布吗？")){
			return false;
		}

		var options = {
	            url:"${pageContext.request.contextPath }/backpage/newBookPub.do",
	            type:"post",
	            dataType:"json",
	            success:function(data){
	                alert(data.msg);
	            }
        };
        //jquery.form使用方式
        $("#jvFormDel").ajaxSubmit(options);
		
	}
	
</script>
</head>
<body style="background-color: rgba(10%,10%,10%,6%);">
	<div class="back_right">
		<div class="back_right_box">
			<form action="${pageContext.request.contextPath }/backpage/addBooks.do" method="post" enctype="multipart/form-data" onsubmit="return check()">
				<table class="back_right_form">
					<tr>
						<td width="100px">
							<label>图书管理</label>
						</td>
						<td>
							<input type="file" id="excel_file" name="file">
						</td>
						<td width="70px">
							<input class="btn btn-default" type="submit" value="导入">
						</td>
						<td width="70px">
							<a class="btn btn-default" href="javascript:void(0);" onclick="delBatch()" role="button">删除</a>
						</td>
						<td width="70px">
							<a class="btn btn-default" href="${pageContext.request.contextPath}/backpage/toRight.do" target="rightFrameBack" role="button">刷新</a>
						</td>
						<td width="100px">
							<a class="btn btn-default" href="javascript:void(0);" onclick="newBookBtn()" role="button">新书发布</a>
						</td>
						<td>
							<!-- Button trigger modal -->
							<button style="height:35px;font-size: 12px;" type="button" onclick="btnInform()" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal2">
							 	采购通知
							</button>
						</td>
						<td>
							<p style="color: red;margin-top: 10px;margin-left: 10px;">${msg }</p>
						</td>
					</tr>
				</table>
			</form>
			
			<form id="jvFormDel" method="post">
				
				<table border="1" class="back_right_list">
					<tr style="height: 30px;color: red;font-size: 14px;">
						<td width="15px">
							<div class="checkbox">
							  <label>
							    &nbsp;&nbsp;<input type="checkbox" onclick="checkBox('checkisbn',this.checked)" id="blankCheckbox" value="option1" aria-label="...">
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
							ISBN
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
								    &nbsp;&nbsp;<input type="checkbox" id="chisbn" name="checkisbn" value="${entry.isbn }" aria-label="...">
								  </label>
								</div>
							</td>
							<td>
								<a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toBookDetails.shtml?isbn=${entry.isbn }')">${entry.bookName } </a>
							</td>
							<td>
								${entry.bookAuthor }
							</td>
							<td width="120px">
								${entry.isbn }
							</td>
							<td width="70px">
								<img height="40px" width="40px" src="http://localhost:8024/image-web/${entry.bookImgurl } ">
							</td>
							<td>
								${entry.bookPublish }
							</td>
							<td width="80px">
								<button style="font-size: 12px;height: 35px;" type="button" class="btn btn-lg btn-danger" data-toggle="popover" title="简介" data-content="${entry.bookSummary }">点我</button>
							</td>
							<td width="140px">
								<a class="btn btn-default" href="javascript:void(0);" onclick="delOne('${entry.isbn }')" role="button">删除</a>&nbsp;&nbsp;
								<!-- Button trigger modal -->
								<button style="font-size: 12px;height: 35px;" type="button" onclick="btnSub('${entry.isbn }')" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
								  编辑
								</button>
							</td>
						</tr>
					
					</c:forEach>
									
				</table>
			</form>
			
			<div style="width: 920px;height: 30px;margin-left: 20px;">
				
				<nav aria-label="Page navigation">
				  <ul style="margin-left: 280px;margin-top: -3px;" class="pagination">
				    
				    <c:forEach items="${books.pageView }" var="page">
				    	${page }
				    </c:forEach>
				  
				  </ul>
				</nav>
				
			</div>
			
		</div>
		
		<!-- Modal 1 编辑 -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div style="width: 800px;" class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">编辑</h4>
		      </div>
		      <form id="jvForm" action="" method="post" enctype="multipart/form-data">
			      <div style="width: 800px;" class="modal-body">
			        <table style="width: 770px;">
			        	<tr height="40">
				        	<td style="text-align: right;">题名：</td>
				        	<td>
				        		<input style="width: 220px;" id="bName" type="text" class="form-control" name="bookName">
				        	</td>
				        	
				        	<td style="text-align: right;">作者：</td>
				        	<td>
					        	<input style="width: 220px;" id="bAuthor" type="text" class="form-control" name="bookAuthor">
				        	</td>
			        	</tr>
			        
			        	<tr height="40">
			        		<td style="text-align: right;">ISBN：</td>
				        	<td>
				        		<input style="width: 220px;" id="bis" type="text" class="form-control" name="isbn" >
				        	</td>
				        	
				        	<td style="text-align: right;">出版社：</td>
				        	<td>
				        		<input style="width: 220px;" id="bPublish" type="text" class="form-control" name="bookPublish">
				        	</td>
			        	</tr>
			        	
			        	<tr height="40">
				        	<td style="text-align: right;">
				        		学科分类：
				        	</td>
				        	<td>
				        		<select style="width: 220px;" id="bsubject" name="bookSubjectId" class="form-control">
									
								</select>
				        	</td>
				        	
				        	<td style="text-align: right;">
				        		普通分类：
				        	</td>
				        	<td>
				        		<select style="width: 220px;" id="bcategoty" name="bookCategoryId" class="form-control">
									
								</select>
				        	</td>
			        	</tr>
			        				        	
			        </table>
				        <table style="width: 700px;height: 220px;margin-left: 50px;">
				        	<tr>
				        		<td style="text-align: right;">封面：</td>
					        	<td width="200px">
					        		<div style="width: 200px;" class="form-group"><br>
									    <input id="picfile" type="file" onchange="uploadPic()" name="file">
									    <div id="picBox">
									    	<img src="" id="img" width="130px" height="140px" style="margin-top: 6px;margin-left: 10px;">
									    	<input type="hidden" name="bookImgurl" id="path"/>
									    </div>
									</div>
					        	</td>
				       
					        	<td style="text-align: right;">摘要：</td>
					        	<td width="350px;">
					        		<textarea style="height: 200px;resize:none;" id="bSummery" class="form-control" rows="3" name="bookSummary" ></textarea>
								</td>
				        	</tr>
				        </table>   
			        	
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			        <button type="button" onclick="submitData()" class="btn btn-primary">保存</button>
			      </div>
		      </form>
		    </div>
		  </div>
		</div>
		
		<!-- Modal 2 采购通知 -->
		<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div style="width: 800px;" class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">采购通知</h4>
		      </div>
		      <form id="jvForm2" action="" method="post" enctype="multipart/form-data">
			      <div style="width: 800px;" class="modal-body">
			       
			        <table style="width: 700px;height: 220px;margin-left: 50px;">
			        	<tr>
			        		<td style="text-align: right;">目标对象：</td>
			        		<td>所有用户</td>
			        	</tr>
			        	<tr>
				        	<td style="text-align: right;">发布内容：</td>
				        	<td width="600px;">
				        		<textarea style="height: 150px;resize:none;" id="msgContent" class="form-control" rows="3" name="msgContent" ></textarea>
							</td>
			        	</tr>
			        </table>   
			        	
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			        <button type="button" onclick="submitMsg()" class="btn btn-primary">保存</button>
			      </div>
		      </form>
		    </div>
		  </div>
		</div>
		
	</div>
</body>
<script type="text/javascript">

	function submitMsg(){
		 if($("#msgContent").val() == ""){
             alert("请输入发布内容，发布内容不能为空！");
             return false;
         };
         
       	 //定义参数
         var options = {
             url:"${pageContext.request.contextPath }/backpage/message.do",
             type:"post",
             dataType:"json",
             success:function(data){
                 alert(data.msg);
             }
         };
         //jquery.form使用方式
         $("#jvForm2").ajaxSubmit(options);
         
	}

	function submitData(){
		 if($("#bsubject").val() == "==请选择=="||$("#bsubject").val() == ""){
             alert("请选择学科分类");
             return false;
         };
         
         if($("#bcategoty").val() == "==请选择=="||$("#bcategoty").val() == ""){
             alert("请选择普通分类");
             return false;
         };

         if($("#picfile").val().length == 0 ){
             alert("请选择上传图片");
             return false;
         };
		
		//定义参数
        var options = {
            url:"${pageContext.request.contextPath }/backpage/updateBook.do",
            type:"post",
            dataType:"json",
            data:$("#jvForm").serialize(),
            contentType : "application/json;charset=UTF-8",
            success:function(data){
                alert(data.msg);
            }
        };
        //jquery.form使用方式
        $("#jvForm").ajaxSubmit(options);
	}
	
    function uploadPic(){
    	//定义参数
        var options = {
            url:"${pageContext.request.contextPath}/uploadPic.do",
            type:"post",
            dataType:"json",
            success:function(data){
                //回调两个路径
                //url
                $("#img").attr("src", data.url);
                //path
                $("#path").val(data.path);
            }
        };
        //jquery.form使用方式
        $("#jvForm").ajaxSubmit(options);
    }
	
	
	$(function(){
		$("[data-toggle='tooltip']").tooltip();
	});
	$(function(){
		$("[data-toggle='popover']").popover();
	});
	
</script>
</html>
