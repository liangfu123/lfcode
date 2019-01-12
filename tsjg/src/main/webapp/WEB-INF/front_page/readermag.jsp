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
<title>已荐购期刊</title>
</head>

<body style="background-color: rgba(10%,10%,10%,6%);">

	<div class="right_big">
		<div class="readerlist_title">
			<div style="height: 5px;">&nbsp;</div>
			<div class="readerlist_h">
				<h1>期刊</h1>
			</div>
		</div>
		<hr>
		
		<div class="readerlist_form">
			<table border="1" class="readerlist_table">
				<tr style="background: rgba(10%,20%,20%,5%);">
					<td>标题</td>
					<td>主管单位</td>
					<td>主办单位</td>
					<td>ISSN</td>
					<td>国内刊号</td>
					<td>出版周期</td>
					<td>荐购时间</td>
					<td>采购进度</td>
				</tr>
				
				<c:forEach items="${pagination.list }" var="entry">
					<tr>
						<td><a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toMagDetails.shtml?issn=${entry.magIssn }')">${entry.magTitle }</a></td>
						<td>${entry.magCompetent }</td>
						<td>${entry.magHostunit }</td>
						<td width="80px">${entry.magIssn }</td>
						<td width="80px">${entry.magCn }</td>
						<td width="60px">${entry.magPubcycle }</td>
						<td width="140px"><fmt:formatDate value="${entry.magJg.magjgTime }" pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td width="60px">
							<c:if test="${entry.magJg.isget == 0 }">未到</c:if>
						    <c:if test="${entry.magJg.isget == 1 }">已到</c:if>
						</td>
					</tr>
				</c:forEach>
				
			</table>
			
			<div class="readerlist_pagination">
				
				<nav aria-label="Page navigation">
				  <ul style="margin-left: 280px;margin-top: 1px;" class="pagination">
				    
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
