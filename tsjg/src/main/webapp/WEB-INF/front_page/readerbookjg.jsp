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
<title>自定义荐购</title>

<script type="text/javascript">
	function subBtn(){
		if($("#bname").val() == ""){
            alert("书名不能为空！");
            return false;
        };
        if($("#bauthor").val() == ""){
            alert("作者不能为空！");
            return false;
        };
        if($("#bpublish").val() == ""){
            alert("出版社不能为空！");
            return false;
        };
        if($("#bisbn").val() == ""){
            alert("ISBN不能为空！");
            return false;
        };
        if($("#bpubtime").val() == ""){
            alert("出版时间不能为空！");
            return false;
        };
        
        //定义参数
        var options = {
        		url : "${pageContext.request.contextPath}/jg/readerBookJg.shtml",
        		type : "post",
        		dataType:"text",
        		data : $("#jvForm").serialize(),
        		contentType : "application/x-www-form-urlencoded",
        		success : function(data){
        			alert(data);
        		}
        };
        
        $("#jvForm").ajaxSubmit(options);
	}
</script>

</head>

<body style="background-color: rgba(10%,10%,10%,6%);">

	<div class="right_big">
		<div class="ud_jg">
			<form id="jvForm" action="" method="post">
				<table style="text-align: right;font-size: 14;">
					<tr height="30px">
						<td width="95px">书名：</td>
						<td>
							<input style="height: 25px;" id="bname" type="text" class="form-control" name="bookUdName" >
						</td>
						
						<td width="90px">作者：</td>
						<td>
							<input style="height: 25px;" id="bauthor" type="text" class="form-control" name="bookUdAuthor">
						</td>
					</tr>
					<tr height="30px">
						<td>出版社：</td>
						<td>
							<input style="height: 25px;" id="bpublish" type="text" class="form-control" name="bookUdPublish" >
						</td>
						
						<td>ISBN：</td>
						<td>
							<input style="height: 25px;" id="bisbn" type="text" class="form-control" name="isbn" >
						</td>
					</tr>
					<tr height="30px">
						<td>出版时间：</td>
						<td>
							<input style="height: 25px;" id="bpubtime" type="text" class="form-control" name="bookUdPubtime">
						</td>
					</tr>
				</table>
				
				<div style="margin-top: 10px;margin-left: 210px;">
					<input style="height: 28px;font-size: 12;" class="btn btn-default" onclick="subBtn()" type="button" value="荐购">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input style="height: 28px;font-size: 12;" class="btn btn-default" type="reset" value="重置">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a style="height: 28px;font-size: 12;" class="btn btn-default" href="${pageContext.request.contextPath}/toReaderBookJg.shtml" target="rightFrame" role="button">刷新</a>
				</div>
			</form>
		</div>
		<hr>
		
		<div class="jg_form">
			<table border="1" class="readerlist_table">
				<tr style="background: rgba(10%,20%,20%,5%);">
					<td>书名</td>
					<td>作者</td>
					<td>出版社</td>
					<td>ISBN</td>
					<td>出版时间</td>
					<td>荐购时间</td>
					<td>采购进度</td>
				</tr>
				
				<c:forEach items="${pagination.list }" var="entry">
					<tr>
						<td>${entry.bookUdName }</td>
						<td>${entry.bookUdAuthor }</td>
						<td>${entry.bookUdPublish }</td>
						<td width="110px">${entry.isbn }</td>
						<td width="90px">
							<fmt:formatDate value="${entry.bookUdPubtime }" pattern="yyyy-MM-dd" />
						</td>
						<td width="140px">
							<fmt:formatDate value="${entry.bookJgTime }" pattern="yyyy-MM-dd HH:mm:ss" />
						</td>
						<td width="60px">
						<c:if test="${entry.isget == 0 }">未到</c:if>
						<c:if test="${entry.isget == 1 }">已到</c:if>
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
