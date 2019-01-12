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
<title>期刊管理</title>
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
		var url = "${pageContext.request.contextPath}/backpage/editMag.do";
		var params = {"code":code};
		$.post(url,params,function (data){
			var maginfo = data.maginfo;
			$("#mTitle").val(maginfo[0].magTitle);
			$("#mCompetent").val(maginfo[0].magCompetent);
			$("#mHostunit").val(maginfo[0].magHostunit);
			$("#mMailnum").val(maginfo[0].magMailnum);
			$("#mIssn").val(maginfo[0].magIssn);
			$("#mCn").val(maginfo[0].magCn);
			$("#mPubcycle").val(maginfo[0].magPubcycle);
			$("#mIntro").val(maginfo[0].magIntro);
			$("#img").attr("src", "http://localhost:8024/image-web/" + maginfo[0].magImgurl);
			
			var mCategory = data.mCategory;
			var html = "<option>==请选择==</option>";
			for(var i = 0; i < mCategory.length ; i++){
				html += '<option value = " '+ mCategory[i].magCategoryId +' ">' + mCategory[i].magCategoryName + '</option>';
			}
			$("#mCategoty").html(html);
			
		},"json");
	}
	
	function delOne(magissn){
		var url = "${pageContext.request.contextPath}/backpage/deleteOneMag.do";
		var params = {"magissn":magissn};
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
		var s = $("input[name='checkissn']:checked").length;
		if(s <= 0){
			alert("请至少选一个!");
			return false;
		}
		
		if(!confirm("你确定删除吗？")){
			return false;
		}
		
		$("#jvFormDel").attr("action","${pageContext.request.contextPath }/backpage/deleteBatchMag.do");
		$("#jvFormDel").attr("method","post").submit();
	}

	function newMagBtn(){
		var s = $("input[name='checkissn']:checked").length;
		if(s <= 0){
			alert("请至少选一个!");
			return false;
		}
		
		if(!confirm("你确定发布吗？")){
			return false;
		}

		var options = {
	            url:"${pageContext.request.contextPath }/backpage/newMagPub.do",
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
			<form action="${pageContext.request.contextPath }/backpage/addMags.do" method="post" enctype="multipart/form-data" onsubmit="return check()">
				<table class="back_right_form">
					<tr>
						<td width="100px">
							<label>期刊管理</label>
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
							<a class="btn btn-default" href="${pageContext.request.contextPath}/backpage/toMag.do" target="rightFrameBack" role="button">刷新</a>
						</td>
						<td width="100px">
							<a class="btn btn-default" href="javascript:void(0);" onclick="newMagBtn()" role="button">新书发布</a>
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
			
			<form id="jvFormDel" action="">
				<table border="1" class="back_right_list">
					<tr style="height: 30px;color: red;font-size: 14px;">
						<td width="15px">
							<div class="checkbox">
							  <label>
							    &nbsp;&nbsp;<input type="checkbox" onclick="checkBox('checkissn',this.checked)" id="blankCheckbox" value="option1" aria-label="...">
							  </label>
							</div>
						</td>
						<td>
							标题
						</td>
						<td>
							主管单位
						</td>
						<td>
							主办单位
						</td>
						<td>
							封面
						</td>
						<td>
							邮发代号
						</td>
						<td>
							ISSN
						</td>
						<td>
							国内刊号
						</td>
						<td>
							出版周期
						</td>
						<td>
							操作
						</td>
					</tr>
					
					<c:forEach items="${mags.list }" var="entry">
					
						<tr style="height: 40px;">
							<td width="15px">
								<div class="checkbox">
								  <label>
								    &nbsp;&nbsp;<input type="checkbox" name="checkissn" id="blankCheckbox" value="${entry.magIssn }" aria-label="...">
								  </label>
								</div>
							</td>
							<td>
								<a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toMagDetails.shtml?issn=${entry.magIssn }')">${entry.magTitle } </a>
							</td>
							<td>
								${entry.magCompetent }
							</td>
							<td width="120px">
								${entry.magHostunit }
							</td>
							<td width="70px">
								<img height="40px" width="40px" src="http://localhost:8024/image-web/${entry.magImgurl } ">
							</td>
							<td>
								${entry.magMailnum }
							</td>
							<td>
								${entry.magIssn }
							</td>
							<td>
								${entry.magCn }
							</td>
							<td>
								${entry.magPubcycle }
							</td>
							<td width="140px">
								<a class="btn btn-default" href="javascript:void(0);" onclick="delOne('${entry.magIssn }')" role="button">删除</a>&nbsp;&nbsp;
								<!-- Button trigger modal -->
								<button style="font-size: 12px;height: 35px;" type="button" onclick="btnSub('${entry.magIssn }')" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
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
				    
				    <c:forEach items="${mags.pageView }" var="page">
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
				        	<td style="text-align: right;">标题：</td>
				        	<td>
				        		<input style="width: 220px;" id="mTitle" type="text" class="form-control" name="magTitle">
				        	</td>
				        	
				        	<td style="text-align: right;">主管单位：</td>
				        	<td>
					        	<input style="width: 220px;" id="mCompetent" type="text" class="form-control" name="magCompetent">
				        	</td>
			        	</tr>
			        
			        	<tr height="40">
			        		<td style="text-align: right;">主办单位：</td>
				        	<td>
				        		<input style="width: 220px;" id="mHostunit" type="text" class="form-control" name="magHostunit">
				        	</td>
				        	
				        	<td style="text-align: right;">邮发代号：</td>
				        	<td>
				        		<input style="width: 220px;" id="mMailnum" type="text" class="form-control" name="magMailnum">
				        	</td>
			        	</tr>
			        	
			        	<tr height="40">
			        		<td style="text-align: right;">ISSN：</td>
				        	<td>
				        		<input style="width: 220px;" id="mIssn" type="text" class="form-control" name="magIssn" >
				        	</td>
				        	
				        	<td style="text-align: right;">国内刊号：</td>
				        	<td>
				        		<input style="width: 220px;" id="mCn" type="text" class="form-control" name="magCn" >
				        	</td>
			        	</tr>
			        	
			        	<tr height="40">
			        		
				        	<td style="text-align: right;">
				        		出版周期：
				        	</td>
				        	<td>
				        		<input style="width: 220px;" id="mPubcycle" type="text" class="form-control" name="magPubcycle">
				        	</td>
				        	
				        	<td style="text-align: right;width: 100px;">期刊分类：</td>
				        	<td>
				        		<select style="width: 220px;" id="mCategoty" name="magCategoryId" class="form-control">
								  
								</select>
				        	</td>
			        	</tr>
			        				        	
			        </table>
			        	
			        <table style="width: 700px;height: 220px;margin-left: 50px;">
			        	<tr>
			        		<td style="text-align: right;">封面：</td>
				        	<td width="200px">
				        		<div style="width: 200px;" class="form-group"><br>
								    <input type="file" id="picfile" onchange="uploadPic()" name="file">
								    <div id="picBox">
								    	<img src="" id="img" width="130px" height="140px" style="margin-top: 6px;margin-left: 10px;">
								    	<input type="hidden" name="magImgurl" id="path"/>
								    </div>
								</div>
				        	</td>
			       
				        	<td style="text-align: right;">简介：</td>
				        	<td width="350px;">
				        		<textarea style="height: 200px;resize:none;" id="mIntro" name="magIntro" class="form-control" rows="3" ></textarea>
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
	 if($("#mCategoty").val() == "==请选择=="||$("#bsubject").val() == ""){
        alert("请选择期刊分类");
        return false;
    };

    if($("#picfile").val().length == 0 ){
        alert("请选择上传图片");
        return false;
    };
	
	//定义参数
	  var options = {
	      url:"${pageContext.request.contextPath }/backpage/updateMag.do",
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
