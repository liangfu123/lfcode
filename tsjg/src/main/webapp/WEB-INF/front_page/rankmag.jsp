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
<title>排行榜-期刊</title>
</head>

<body style="background-color: rgba(10%,10%,10%,6%);">

	<div class="right_big">
		<div class="rank_top">
			<div class="rank_d"></div>
			<div class="rank_h1">
				<h1>期刊排行榜</h1>
			</div>
		</div>
		<hr>
		
		<div class="rank_result">
			<br>
			<div class="result_list">
				<table border="1" class="result_table">
					<tr style="background-color: rgba(10%,10%,10%,6%);">
						<td>标题</td>
						<td>主管单位</td>
						<td>主办单位</td>
						<td width="120">ISSN</td>
						<td width="90">出版周期</td>
						<td width="90">荐购次数</td>
					</tr>
					<c:forEach items="${pagination.list }" var="entry">
						<tr>
							<td><a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toMagDetails.shtml?issn=${entry.magIssn }')">${entry.magTitle }</a></td>
							<td>${entry.magCompetent }</td>
							<td>${entry.magHostunit }</td>
							<td>${entry.magIssn }</td>
							<td>${entry.magPubcycle }</td>
							<td>${entry.magNum }</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			
			<div class="result_pagination">
				
				<nav aria-label="Page navigation">
				  <ul style="margin-left: 300px;margin-top:0px;" class="pagination">
				    
				    <c:forEach items="${pagination.pageView }" var="page">
				    	${page }
				    </c:forEach>
				  
				  </ul>
				</nav>
				
			</div>
			
		</div>
	</div>

</body>
</html>
