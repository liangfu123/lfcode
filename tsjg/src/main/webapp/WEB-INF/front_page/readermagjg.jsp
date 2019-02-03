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
		if($("#mTitle").val() == ""){
            alert("题名不能为空！");
            return false;
        };
        if($("#mMailnum").val() == ""){
            alert("邮发代号不能为空！");
            return false;
        };
        if($("#mCompetent").val() == ""){
            alert("主管单位不能为空！");
            return false;
        };
        if($("#mHostunit").val() == ""){
            alert("主办单位不能为空！");
            return false;
        };
        if($("#mIssn").val() == ""){
            alert("ISSN不能为空！");
            return false;
        };
        if($("#mCn").val() == ""){
            alert("国内刊号不能为空！");
            return false;
        };
        
        
        //定义参数
        var options = {
        		url : "${pageContext.request.contextPath}/jg/readerMagJg.shtml",
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
						<td width="95px">标题：</td>
						<td>
							<input style="height: 25px;" id="mTitle" type="text" class="form-control" name="magUdTitle" >
						</td>
						
						<td width="90px">邮发代号：</td>
						<td>
							<input style="height: 25px;" id="mMailnum" type="text" class="form-control" name="magUdMailnum">
						</td>
					</tr>
					<tr height="30px">
						<td>主管单位：</td>
						<td>
							<input style="height: 25px;" id="mCompetent" type="text" class="form-control" name="magUdCompetent" >
						</td>
						
						<td>主办单位：</td>
						<td>
							<input style="height: 25px;" id="mHostunit" type="text" class="form-control" name="magUdHostunit" >
						</td>
					</tr>
					<tr height="30px">
						<td>ISSN：</td>
						<td>
							<input style="height: 25px;" id="mIssn" type="text" class="form-control" name="magIssn">
						</td>
					
						<td>国内刊号：</td>
						<td>
							<input style="height: 25px;" id="mCn" type="text" class="form-control" name="magUdCn">
						</td>
					</tr>
				</table>
				
				<table style="margin-top: 10px;margin-left: 220px;">
					<tr>
						<td>
							<input style="height: 28px;font-size: 12;" class="btn btn-default" onclick="subBtn()" type="button" value="荐购">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input style="height: 28px;font-size: 12;" class="btn btn-default" type="reset" value="重置">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a style="height: 28px;font-size: 12;" class="btn btn-default" href="${pageContext.request.contextPath}/toReaderMagJg.shtml" target="rightFrame" role="button">刷新</a>
						</td>
					</tr>
				</table>
			</form>
		</div>
		<hr>
		
		<div class="jg_form">
			<table border="1" class="readerlist_table">
				<tr style="background: rgba(10%,20%,20%,5%);">
					<td>标题</td>
					<td>主管单位</td>
					<td>主办单位</td>
					<td>邮发代号</td>
					<td>国内刊号</td>
					<td>issn</td>
					<td>荐购时间</td>
					<td>采购进度</td>
				</tr>
				
				<c:forEach items="${pagination.list }" var="entry">
					<tr>
						<td>${entry.magUdTitle }</td>
						<td>${entry.magUdCompetent }</td>
						<td>${entry.magUdHostunit }</td>
						<td width="60px">${entry.magUdMailnum }</td>
						<td width="80px">${entry.magUdCn }</td>
						<td width="75px">${entry.magIssn }</td>
						<td width="140px">
							<fmt:formatDate value="${entry.magJgTime }" pattern="yyyy-MM-dd HH:mm:ss" />
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
