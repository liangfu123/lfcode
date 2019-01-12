<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>个人中心</title>
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
	
	<div class="personal_main">
		<div class="personal_list">
			<ul class="nav nav-pills nav-stacked">
			  <li role="presentation" class="active"><a href="javascript:(0);">设置</a></li>
			  <li role="presentation"><a href="javascript:(0);" onclick="window.location.href='${pageContext.request.contextPath}/toPersonal.shtml'">完善资料</a></li>
			  <li role="presentation"><a href="javascript:(0);" onclick="window.location.href='${pageContext.request.contextPath}/toUpdatepwd.shtml'">修改密码</a></li>
			</ul>
		</div>
		
		<div class="personal_content">
    		<table style="margin-top: 20px;">
    			<tr style="height: 25px;">
    			<td style="width: 130px;text-align: right;"><img src="${pageContext.request.contextPath}/img/style.png">&nbsp;&nbsp;<label>修改密码</label></td>
    			</tr>
    		</table>
    		<hr><br><br><br>
    		
    		<form action="${pageContext.request.contextPath }/updatepwd.shtml" method="post">
    			<table style="margin-left: 160px;">
    				<tr style="height: 50px;">
    					<td style="text-align: right;"> 旧密码：</td>
    					<td><input type="password" style="width: 330px;" class="form-control" id="exampleInputName2" name="oldPwd" ></td>
    				</tr>
    				<tr style="height: 50px;">
    					<td style="text-align: right;"> 新密码：</td>
    					<td><input type="password" style="width: 330px;" class="form-control" id="exampleInputName2" name="newPwd" ></td>
    				</tr>
    				<tr style="height: 50px;">
    					<td style="text-align: right;"> 再次确认密码：</td>
    					<td><input type="password" style="width: 330px;" class="form-control" id="exampleInputName2" name="password" ></td>
    				</tr>
    				<tr><td>&nbsp;</td><td style="text-align: left;"><p id="msg" style="color: red;">${message }</p></td></tr>
    				<tr style="height: 50px;">
    					<td>&nbsp;</td>
    					<td><input style="height: 40px;width: 110px;" type="submit" value="修改密码"></td>
    				</tr>
    			</table>
		  	</form>
		</div>
		
	</div>
	
</body>
</html>
