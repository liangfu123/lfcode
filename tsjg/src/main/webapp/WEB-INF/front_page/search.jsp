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
<title>多字段检索</title>

</head>

<body style="background-color: rgba(10%,10%,10%,6%);">

	<div class="right_big">
		<div class="search_form">
			<form action="${pageContext.request.contextPath }/multiSearchBook.shtml" method="post">
				<table class="search_table">
					<tr style="height: 35px;">
						<td>书名：</td>
						<td>
							<input style="width: 200px;height: 25px;" type="text" class="form-control" name="bookName" value="${bookName }">
						</td>
						<td>作者：</td>
						<td>
							<input style="width: 200px;height: 25px;" type="text" class="form-control" name="bookAuthor" value="${bookAuthor }">
						</td>
					</tr>
					<tr style="height: 35px;">
						<td>出版社：</td>
						<td>
							<input style="width: 200px;height: 25px;" type="text" class="form-control" name="bookPublish" value="${bookPublish }">
						</td>
						<td>ISBN：</td>
						<td>
							<input style="width: 200px;height: 25px;" type="text" class="form-control" name="isbn" value="${isbn }">
						</td>
					</tr>
					<tr style="height: 40px;">
						<td>&nbsp;</td>
						<td style="text-align: left;">
							<input style="height: 30px;" class="btn btn-default" type="submit" value="检索">
							<label style="color: red;">${msg }</label>			
						</td>
					</tr>
				</table>
			</form>
		</div>
		<hr>
		
		<div class="search_result">
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
				  <ul style="margin-left: 300px;margin-top:3px;" class="pagination">
				    
				    <c:forEach items="${pagination.pageView }" var="page">
				    	${page }
				    </c:forEach>
				  
				  </ul>
				</nav>
				
			</div>
			
			<button style="margin-top: 100px;margin-right: 350px;" type="button" class="close" data-dismiss="alert" aria-label="Close">
			  <span aria-hidden="true">${user_session.username } 您的检索结果展示面板</span>
			</button>
			
		</div>
		
	</div>

</body>
</html>
