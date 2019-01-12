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
<title>中图-分类</title>
</head>

<body style="background-color: rgba(10%,10%,10%,6%);">

	<div class="right_big">
		<div class="bcategory_from">
			<ul class="nav nav-tabs">
			  <li role="presentation" class="active"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=A'">马列主义、毛泽东思想、邓小平理论</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=B'">哲学、宗教</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=C'">社会科学总论</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=D'">政治、法律</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=E'">军事</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=F'">经济</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=G'">文化、科学、教育、体育</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=H'">语言、文字</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=I'">文学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=J'">艺术</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=K'">历史、地理</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=N'">自然科学总论</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=O'">数理科学和化学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=P'">天文学、地球科学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=Q'">生物科学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=R'">医药、卫生</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=S'">农业科学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=T'">工业技术</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=U'">交通运输</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=V'">航空、航天</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=X'">环境科学、安全科学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookCnclass.shtml?bookCnclassLetter=Z'">综合性图书</a></li>
			</ul>
		</div>
		<hr>
		<div class="bcategory_result">
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
				  <ul style="margin-left: 300px;margin-top:1px;" class="pagination">
				    
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
