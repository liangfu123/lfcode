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
<title>图书-分类</title>
</head>

<body style="background-color: rgba(10%,10%,10%,6%);">

	<div class="right_big">
		<div class="bcategory_from">
			<ul class="nav nav-tabs">
			  <li role="presentation" class="active"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=1'">青春</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=2'">小说</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=3'">文学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=4'">艺术</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=5'">动漫</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=6'">幽默</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=7'">娱乐时尚</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=8'">旅游</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=9'">地理</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=10'">少儿</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=11'">外语</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=12'">教材</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=13'">考试</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=14'">中小学教辅</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=15'">科普读物</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=16'">生活</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=17'">婚恋/性</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=18'">育儿/成长</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=19'">保健/心里健康</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=20'">体育</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=21'">励志</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=22'">管理</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=23'">经济</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=24'">法律</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=25'">政治/军事</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=26'">哲学/宗教</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=27'">社会科学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=28'">古籍</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=29'">文化</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=30'">历史</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=31'">传记</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=32'">计算机/网络</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=33'">医学</a></li>
			  <li role="presentation"><a href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/bookcategory.shtml?categoryId=34'">科学技术</a></li>
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
