<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>用户管理</title>

<script type="text/javascript">
	function changeCode(code){
		if(code == "性别"){
			var obj = document.getElementById("change");
			obj.add(new Option("男", "男"));
			obj.add(new Option("女", "女"));
		}
		if(code == "用户类型"){
			var obj = document.getElementById("change");
			obj.add(new Option("学生", "学生"));
			obj.add(new Option("教师", "教师"));
			obj.add(new Option("其他", "其他"));
		}
		if(code == "所属学院"){
			var obj = document.getElementById("change");
			obj.add(new Option("文学与传媒学院", "文学与传媒学院"));
			obj.add(new Option("马克思主义学院", "马克思主义学院"));
			obj.add(new Option("外国语学院", "外国语学院"));
			obj.add(new Option("基础教育学院", "基础教育学院"));
			obj.add(new Option("经济与管理学院", "经济与管理学院"));
			obj.add(new Option("数学与计算机科学学院", "数学与计算机科学学院"));
			obj.add(new Option("电子信息与自动化学院", "电子信息与自动化学院"));
			obj.add(new Option("资源与环境学院", "资源与环境学院"));
			obj.add(new Option("藏汉双语学院", "藏汉双语学院"));
			obj.add(new Option("音乐舞蹈学院", "音乐舞蹈学院"));
			obj.add(new Option("美术学院", "美术学院"));
			obj.add(new Option("体育与健康学院", "体育与健康学院"));
		}
	}
</script>

</head>
<body style="background-color: rgba(10%,10%,10%,6%);">
	<div class="back_right">
		<div class="back_right_box">
			<form action="${pageContext.request.contextPath }/backpage/toManagerQuery.do" method="post">
				<table class="back_right_manager">
					<tr>
						<td width="70px">
							<a class="btn btn-default" href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath}/backpage/toManager.do'" role="button">全部</a>
						</td>
						<td width="130px">
							<select style="width: 110px;margin-left: 10px;" name="choice" onchange="changeCode(this.value);" class="form-control">
							  <option value="">
							  	<%-- <c:if test="${not empty choice }">${choice }</c:if>
							  	<c:if test="${empty choice }">请选择</c:if> --%>
							  	请选择
							  </option>
							  <option value="性别">性别</option>
							  <option value="用户类型">用户类型</option>
							  <option value="所属学院">所属学院</option>
							</select>
						</td>
						<td width="220px">
							<%-- <input style="width: 200px;margin-left: 10px;" type="text" name="choiceValue" value="${cValue }" class="form-control"> --%>
							<select id="change" style="width: 200px;margin-left: 10px;" name="choiceValue" class="form-control">
							 
							</select>
						</td>
						<td width="90px">
							<input style="margin-left: 10px;" class="btn btn-default" type="submit" value="检索">
						</td>
						<td width="310px">
							<p style="color: red;margin-top: 10px;">${msg }</p> 
						</td>
					</tr>
				</table>
			</form>
			
			<table border="1" class="back_right_mlist">
				<tr style="height: 30px;color: red;font-size: 14px;">
					<td>
						用户名
					</td>
					<td>
						真实姓名
					</td>
					<td>
						性别
					</td>
					<td>
						电话号码
					</td>
					<td>
						电子邮箱
					</td>
					<td>
						QQ号
					</td>
					<td>
						用户类型
					</td>
					<td>
						所属学院
					</td>
				</tr>
				
				<c:forEach items="${users.list }" var="entry">
					<tr style="height: 30px;">
						<td width="110px">
							${entry.username }
						</td>
						<td>
							${entry.realname }
						</td>
						<td>
							${entry.sex }
						</td>
						<td>
							${entry.phone }
						</td>
						<td>
							${entry.email }
						</td>
						<td>
							${entry.qq }
						</td>
						<td>
							${entry.type }
						</td>
						<td>
							${entry.college }
						</td>
					</tr>
				</c:forEach>
				
			</table>
			
			<div style="width: 920px;height: 30px;margin-left: 20px;">
				
				<nav aria-label="Page navigation">
				  <ul style="margin-left: 280px;" class="pagination">
				    
				    <c:forEach items="${users.pageView }" var="page">
				    	${page }
				    </c:forEach>
				  
				  </ul>
				</nav>
				
			</div>
			
		</div>
	</div>
</body>
</html>
