<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>个人中心</title>

<script type="text/javascript">
	function readAll(){
		var url = "${pageContext.request.contextPath}/readAll.shtml";
		$.post(url,function (data){
			alert(data.msg);
		},"json");
	}
	function deleteAll(){
		var url = "${pageContext.request.contextPath}/deleteAll.shtml";
		$.post(url,function (data){
			alert(data.msg);
		},"json");
	}
</script>

</head>
	
<body style="background-color: rgba(10%,10%,10%,6%);">
	
	<div class="personal_top">
		<table>
    		<tr style="height: 90px">
    		<td style="width: 200px;text-align: right;"><img src="${pageContext.request.contextPath }/img/logo.jpg"><label>&nbsp;&nbsp;个人中心</label></td>
    		<td style="width: 1050px;text-align: right;">${user_session.username }&nbsp;&nbsp;|&nbsp;&nbsp;<a href="javascript:(window.location.href='${pageContext.request.contextPath }/toMainFront.shtml')">返回</a></td>
    		</tr>
    	</table>
	</div>
	
	<div class="personal_main_msg">
		<div style="background: white;" class="personal_list">
			<ul class="nav nav-pills nav-stacked">
			  <li role="presentation" class="active"><a href="javascript:(0);">设置</a></li>
			  <li role="presentation"><a href="javascript:(0);" onclick="window.location.href='${pageContext.request.contextPath}/toPersonal.shtml'">完善资料</a></li>
			  <li role="presentation"><a href="javascript:(0);" onclick="window.location.href='${pageContext.request.contextPath}/toUpdatepwd.shtml'">修改密码</a></li>
			  <li role="presentation">
			  	<a href="javascript:(0);" onclick="window.location.href='${pageContext.request.contextPath}/toMsg.shtml'">系统信息</a>
			  </li>
			  <c:if test="${count != 0}">
	        	<div class="redpoint2">${count }
				</div>
			  </c:if>
			</ul>
		</div>
		
		<div style="background: white;" class="personal_content_msg">
    		<table style="margin-top: 20px;">
    			<tr style="height: 25px;">
    			<td style="width: 130px;text-align: right;"><img src="${pageContext.request.contextPath}/img/style.png">&nbsp;&nbsp;<label>系统信息</label></td>
    			</tr>
    		</table>
    		<hr>
    		
    		<table style="margin-left: 50px;font-size: 14px;">
    			<tr>
    				<td width="100px"><a href="javascript:void(0)" onclick="readAll()">全标已读</a></td>
    				<td><a href="javascript:void(0)" onclick="deleteAll()">全部清空</a></td>
    			</tr>
    		</table>
    		<br>
    		
    		<c:forEach items="${msglist }" var="entry">
	    		<div style="margin-left: 50px;width: 760px;font-size: 14px;">
	    			<span style="position: relative;">
	    				<c:if test="${entry.isread eq 0 }">
	   						<i style="display:block;background:#f00;border-radius:50%;width:5px;height:5px;top:0px;right:10px;position:absolute;"></i>
	   					</c:if>
	    			</span>
	   				<span >
	   					${entry.message.msgContent }
	   				</span><br>
	   				<span style="font-size: 14px;">
	   					<fmt:formatDate value="${entry.message.msgTime }" pattern="yyyy-MM-dd HH:mm:ss" />
	   				</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	   				<span style="font-size: 14px;">管理员</span><hr>    			
	    		</div>
    		</c:forEach>
    		
    		<br><br><br>
		</div>
		
	</div>
	
</body>
</html>
