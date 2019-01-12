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
<title>图书-学科参考</title>
</head>

<body style="background-color: rgba(10%,10%,10%,6%);">

	<div class="right_big">
		<div class="bsub_from">
			<ul class="nav nav-tabs">
			  <li role="presentation" class="active"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/booksubject.shtml?subjectId=1'">工学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/booksubject.shtml?subjectId=2'">文学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/booksubject.shtml?subjectId=3'">法学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/booksubject.shtml?subjectId=4'">理学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/booksubject.shtml?subjectId=5'">艺术学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/booksubject.shtml?subjectId=6'">教育学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/booksubject.shtml?subjectId=7'">历史学</a></li>
			</ul>
		</div>
		<hr>
		<div class="bsub_result">
			<br>
			<div class="result_list">
				<table border="1" class="result_table">
					<tr style="background-color: rgba(10%,10%,10%,6%);">
						<td>书名</td>
						<td>作者</td>
						<td>出版社</td>
						<td>ISBN</td>
					</tr>
					<c:forEach items="${pagination.list }" var="entry">
						<tr>
							<td><a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toBookDetails.shtml?isbn=${entry.isbn }')">${entry.bookName }</a></td>
							<td>${entry.bookAuthor }</td>
							<td>${entry.bookPublish }</td>
							<td width="150px">${entry.isbn }</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			
			<div class="result_pagination">
				
				<nav aria-label="Page navigation">
				  <ul style="margin-left: 300px;margin-top:2px;" class="pagination">
				    
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
