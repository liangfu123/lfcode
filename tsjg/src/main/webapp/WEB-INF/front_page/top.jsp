<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>前台头部</title>
</head>
	
<body>
	<nav class="navbar">
	   <div style="background: white;" class="container-fluid">
	   
	    <div class="navbar-header">
	      <a class="navbar-brand" href="javascript:void(0);">
	        <img style="height: 40px;width: 40px;margin-top: -10px;margin-left: 15px;" src="${pageContext.request.contextPath }/img/logo.jpg">
	      </a>
	    </div>
	
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	      <ul class="nav navbar-nav">
	        <li class="active"><a href="${pageContext.request.contextPath }/toLeft.shtml" target="leftFrame">书目检索 <span class="sr-only">(current)</span></a></li>
	        <li><a href="${pageContext.request.contextPath }/toBook.shtml" target="leftFrame">图书导航</a></li>
	        <li><a href="${pageContext.request.contextPath }/toRank.shtml" target="leftFrame">排行榜</a></li>
	        <li><a href="${pageContext.request.contextPath }/toMag.shtml" target="leftFrame">期刊导航</a></li>
	        <li><a href="${pageContext.request.contextPath }/toNewbook.shtml" target="leftFrame">新书通报</a></li>
	        <li><a href="${pageContext.request.contextPath }/toReader.shtml" target="leftFrame">读者荐购</a></li>
	      </ul>
	      
	      <ul class="nav navbar-nav navbar-right">
	        <li><a href="${pageContext.request.contextPath }/logout.shtml" target="_top">退出</a></li>
	        <li>
	        <a href="${pageContext.request.contextPath }/toPersonal.shtml" target="_top">个人中心</a>
	        </li>
	        <c:if test="${count != 0}">
		        <div class="redpoint">
		        	${count}
				</div>
			</c:if>
	      </ul>
	    </div>
	  </div>
	</nav>
</body>
</html>
