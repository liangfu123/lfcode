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
<title>图书自荐</title>
<script type="text/javascript">
	function delOne(isbn){
		var url = "${pageContext.request.contextPath}/backpage/deleteBookZj.do";
		var params = {"isbn":isbn};
		$.post(url,params,function (data){
			if(data.result == 1 ){
				alert("删除成功");
			}else{
				alert("删除失败");
			}
		},"json");
	}
	
	//全选
	function checkBox(name,checked){
		$("input[name='"+ name +"']").attr("checked",checked);
	}
	
	function deletes(){
		var s = $("input[name='checkisbn']:checked").length;
		if(s <= 0){
			alert("请至少选一个!");
			return false;
		}
		
		if(!confirm("你确定删除吗？")){
			return false;
		}
		
		$("#jvFormDel").attr("action","${pageContext.request.contextPath }/backpage/deleteBooksZj.do");
		$("#jvFormDel").attr("method","post").submit();
	}
	
	function exports(){
		var url = "${pageContext.request.contextPath}/backpage/exportBooksZj.do";
		$.post(url,function (data){
			if(data.url){
				alert(data.url);
			}else{
				alert("导出失败");
			}
		},"json");
	}
</script>
</head>
<body style="background-color: rgba(10%,10%,10%,6%);">
	<div class="back_right">
		<div class="back_right_box">
			<form action="">
				<table class="back_right_form">
					<tr>
						<td width="100px">
							<label>图书自荐</label>
						</td>
						<td width="70px">
							<input class="btn btn-default" onclick="exports()" type="button" value="导出">
						</td>
						<td width="70px">
							<a class="btn btn-default" href="javascript:void(0);" onclick="deletes()" role="button">删除</a>
						</td>
						<td width="70px">
							<a class="btn btn-default" href="${pageContext.request.contextPath}/backpage/toBookZj.do" target="rightFrameBack" role="button">刷新</a>
						</td>
					</tr>
				</table>
			</form>
			
			<form id="jvFormDel" action="">
				<table border="1" class="back_right_purchase">
					<tr style="color: red;font-size: 14px;">
						<td width="15px">
							<div>
							  <label>
							    <input type="checkbox" id="blankCheckbox" onclick="checkBox('checkisbn',this.checked)" value="option1" aria-label="...">
							  </label>
							</div>
						</td>
						<td>
							题名
						</td>
						<td>
							作者
						</td>
						<td>
							ISBN
						</td>
						<td>
							出版社
						</td>
						<td>
							出版时间
						</td>
						<td>
							操作
						</td>
					</tr>
					
					<c:forEach items="${pagination.list }" var="entry">
						<tr>
							<td width="15px">
								<div>
								  <label>
								    <input type="checkbox" name="checkisbn" id="blankCheckbox" value="${entry.isbn }" aria-label="...">
								  </label>
								</div>
							</td>
							<td>
								${entry.bookUdName }
							</td>
							<td>
								${entry.bookUdAuthor }
							</td>
							<td width="120px">
								${entry.isbn }
							</td>
							<td>
								${entry.bookUdPublish }
							</td>
							<td width="80px">
								<fmt:formatDate value="${entry.bookUdPubtime }" pattern="yyyy-MM-dd"/>
							</td>
							<td width="55px">
								<a href="javascript:void(0);" onclick="delOne('${entry.isbn }')" role="button">删除</a>
							</td>
						</tr>
					</c:forEach>
					
				</table>
			</form>
			
			<div style="width: 920px;height: 30px;margin-left: 20px;">
				
				<nav aria-label="Page navigation">
				  <ul style="margin-left: 280px;margin-top: -11px;" class="pagination">
				    
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
