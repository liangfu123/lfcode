<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>后台主页</title>
</head>
<body style="background-color: rgba(10%,10%,10%,6%);">
	<div class="back_left">
		<ul class="nav nav-pills nav-stacked">
		  <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/backpage/toRight.do" target="rightFrameBack">图书管理</a></li>
		  <li role="presentation"><a href="${pageContext.request.contextPath}/backpage/toMag.do" target="rightFrameBack">期刊管理</a></li>
		  <li role="presentation"><a href="${pageContext.request.contextPath}/backpage/toManager.do" target="rightFrameBack">用户管理</a></li>
		  <li role="presentation"><a href="${pageContext.request.contextPath}/backpage/toBookPurchase.do" target="rightFrameBack">图书采购</a></li>
		  <li role="presentation"><a href="${pageContext.request.contextPath}/backpage/toMagPurchase.do" target="rightFrameBack">期刊采购</a></li>
		  <li role="presentation"><a href="${pageContext.request.contextPath}/backpage/toBookZj.do" target="rightFrameBack">图书自荐</a></li>
		  <li role="presentation"><a href="${pageContext.request.contextPath}/backpage/toMagZj.do" target="rightFrameBack">期刊自荐</a></li>
		  <li role="presentation"><a href="${pageContext.request.contextPath}/logout.shtml" target="_top">退出登录</a></li>
		</ul>
	</div>
</body>
</html>
