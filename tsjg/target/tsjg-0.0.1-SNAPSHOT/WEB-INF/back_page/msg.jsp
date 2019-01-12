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
<title>信息发布</title>
</head>
<body style="background-color: rgba(10%,10%,10%,6%);">
	<div class="back_right">
		<div class="back_right_box">
			<form action="" method="post">
				<table class="back_right_msg">
					<tr>
						<td style="text-align: right;width: 120px;">标题：</td>
			        	<td>
			        		<input style="width: 220px;" type="text" class="form-control" name="" placeholder="标题">
			        	</td>
					</tr>
					<tr>
						<td style="text-align: right;">内容：</td>
			        	<td width="350px;">
			        		<textarea style="height: 200px;resize:none;width: 500px;" class="form-control" rows="3" ></textarea>
						</td>
					</tr>
					<tr>
						<td style="text-align: right;">用户选择：</td>
			        	<td>
			        		<select style="width: 110px;" name="college" class="form-control">
							  <option value="">所有用户</option>
							  <option value="">部分用户</option>
							  <option value="">单个用户</option>
							</select>
			        	</td>
			        	<c:if test="">
			        	
			        	</c:if>
					</tr>
					
					<tr>
						<td style="text-align: right;"></td>
			        	<td>
			        		<button type="submit" class="btn btn-primary">发布</button>
			        	</td>
					</tr>
					
				</table>
			</form>
		</div>
	</div>
</body>
</html>
