<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>新书通报</title>

<script type="text/javascript">
$(function(){
	$("#content").carousel({
		interval: 2000//设置间隔时间，可以写也可以不写，不写就默认时间
	});
});
</script>

</head>

<body style="background-color: rgba(10%,10%,10%,6%);">
	<div class="left_big">
		<div class="left_list">
			<ul class="nav nav-pills nav-stacked">
			  <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/toNewbooklist.shtml" target="rightFrame">图书通报</a></li>
			  <li role="presentation"><a href="${pageContext.request.contextPath}/toNewMaglist.shtml" target="rightFrame">期刊通报</a></li>
			</ul>
		</div>
		
		<div id="content" class="left_img">
			<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" style="height: 174px;width: 200px;">
			  <!-- Indicators -->
			  <ol class="carousel-indicators">
			    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
			  </ol>
			
			  <!-- Wrapper for slides -->
			  <div class="carousel-inner" role="listbox">
			    <div class="item active">
			      <img style="height: 174px;width: 200px;" src="${pageContext.request.contextPath}/img/lunbo7.jpeg">
			      <div class="carousel-caption"></div>
			    </div>
			    <div class="item">
			      <img style="height: 174px;width: 200px;" src="${pageContext.request.contextPath}/img/lunbo8.jpeg">
			       <div class="carousel-caption"></div>
			    </div>
			    <div class="item">
			      <img style="height: 174px;width: 200px;" src="${pageContext.request.contextPath}/img/lunbo9.jpeg">
			       <div class="carousel-caption"></div>
			    </div>
			  </div>
			</div>
		</div>
		<div class="left_msg">
			<table style="font-size: 14px;margin-left: 15px;">
				<tr style="height: 30px;">
					<td><label>链接</label></td>
				</tr>
				<tr style="height: 28px;">
					<td><a href="javascript:void(0);">阿坝师范学院图书馆</a></td>
				</tr>
				<tr style="height: 28px;">
					<td><a href="javascript:void(0);">阿坝师范学院教务处</a></td>
				</tr>
				<tr style="height: 28px;">
					<td><a href="javascript:void(0);">阿坝师范学院招生信息网</a></td>
				</tr>
				<tr style="height: 28px;">
					<td><a href="javascript:void(0);">阿坝师范学院就业信息网</a></td>
				</tr>
				<tr style="height: 28px;">
					<td><a href="javascript:void(0);">阿坝师范学院团委官网</a></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
