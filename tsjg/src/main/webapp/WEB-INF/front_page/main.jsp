<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>前台主页</title>
</head>

<frameset rows="52,*" cols="*" frameborder="0" framespacing="0" border="0">
	<frame src="${pageContext.request.contextPath }/toTop.shtml" name="topFrame" scrolling="no" >
	<frameset cols="20%,80%" frameborder="0" framespacing="0" border="0">
		<frame src="${pageContext.request.contextPath }/toLeft.shtml" name="leftFrame" scrolling="no" >
		<frame src="${pageContext.request.contextPath }/toRight.shtml" name="rightFrame" scrolling="no" >
	</frameset>    
</frameset>

<body>
</body>
</html>
