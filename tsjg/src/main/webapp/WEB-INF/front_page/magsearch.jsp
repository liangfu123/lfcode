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
<title>期刊检索</title>
</head>

<body style="background-color: rgba(10%,10%,10%,6%);">

	<div class="right_big">
		<div class="right_form">
			<form action="${pageContext.request.contextPath }/searchMag.shtml" method="post">
				<table> 
					<tr style="height: 90px;">
						<td>
							<select class="form-control" name="choiseType">
							  <option value="1">标题</option>
							  <option value="2">ISSN</option>
							  <option value="3">国内刊号</option>
							  <option value="4">出版周期</option>
							</select>
						</td>
						<td>&nbsp;</td>
						<td width="240px">
							<input type="text" name="inputValue" value="${inputValue }" class="form-control">
						</td>
						<td>&nbsp;<p style="color: red">${msg }</p></td>
						<td>
							<input class="btn btn-default" type="submit" value="检索">
						</td>
					</tr>
				</table>
			</form>
		</div>
		<hr>
		
		<div class="right_result">
			<br>
			<div class="result_list">
				<table border="1" class="result_table">
					<tr style="background-color: rgba(10%,10%,10%,6%);">
						<td>标题</td>
						<td>主办单位</td>
						<td>邮发代号</td>
						<td>ISSN</td>
						<td>国内刊号</td>
						<td>出版周期</td>
					</tr>
					<c:forEach items="${pagination.list }" var="entry">
						<tr>
							<td><a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toBookDetails.shtml?isbn=${entry.magIssn }')">${entry.magTitle }</a></td>
							<td>${entry.magHostunit }</td>
							<td>${entry.magMailnum }</td>
							<td width="150px">${entry.magIssn }</td>
							<td>${entry.magCn }</td>
							<td>${entry.magPubcycle }</td>
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
