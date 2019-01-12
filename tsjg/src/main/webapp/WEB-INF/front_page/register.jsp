<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>注册</title>
</head>
<body>
	<div class="register_big" style="background-image:url(${pageContext.request.contextPath }/img/register.jpg)">
		<div class="register_small"><br>
			<label style="font-size: 36px;margin-left: 110px;color: #F75000;"><span style="font-size: 26px;">图书荐购系统</span> | 用户注册</label>
			<div class="register_a"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath }/toLogin.shtml'">登录</a></div>
			<div class="register_form">
				<form action="${pageContext.request.contextPath }/register.shtml" method="post" class="form-horizontal">
				  <div style="width: 400px;" class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label"></label>
				    <div style="width: 300px" class="col-sm-10">
				      <input type="text" class="form-control" id="inputEmail3" name="username" placeholder="学号/工号/手机号">
				    </div>
				  </div>
				  
				  <div style="width: 400px;" class="form-group">
				    <label for="inputPassword3" class="col-sm-2 control-label"></label>
				    <div style="width: 300px" class="col-sm-10">
				      <input type="password" class="form-control" id="inputPassword3" name="password" placeholder="密码">
				    </div>
				  </div>
				  
				  <div style="width: 400px;" class="form-group">
				    <label for="inputPassword3" class="col-sm-2 control-label"></label>
				    <div style="width: 300px" class="col-sm-10">
				      <input type="password" class="form-control" id="inputPassword3" name="verifypwd" placeholder="确认密码">
				    </div>
				  </div>
				  
				  <div style="width: 400px;" class="form-group">
				    <label for="inputPassword3" class="col-sm-2 control-label"></label>
				    <div style="width: 200px" class="col-sm-10">
				      <input id="vCode" type="text" class="form-control" name="verifycode" placeholder="验证码">  
				    </div>
				     <img id="vcode_img" alt="点击更换" title="点击更换" src="${pageContext.request.contextPath }/validatecode.jsp"
				      onclick="javascript:document.getElementById('vcode_img').src='${pageContext.request.contextPath}/validatecode.jsp?'+new Date();">
				  </div>
				  
				  <div style="width: 400px;" class="form-group">
				    <div style="width: 270px;" class="col-sm-offset-2 col-sm-10">
				      <button style="width: 270px;background:#ffcc66;" type="submit" class="btn btn-default">注册</button>
				    </div>
				  </div>
				  
				  <h2>${msg }</h2>
				</form>
			</div><hr>

			<div class="register_link">
			
				<table style="font-size: 14px; margin:0 auto;">
					<tr>
						<td><label>版权所有&nbsp;&nbsp;阿坝师范学院</label></td>
					</tr>
				</table>
			</div>
		</div>
		
	</div>
	
</body>
</html>
