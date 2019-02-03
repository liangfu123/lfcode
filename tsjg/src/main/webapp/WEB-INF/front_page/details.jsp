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
<title>图书详情</title>
<script type="text/javascript">
	function subComment(bookId,userId){
		var url = "${pageContext.request.contextPath}/bookComment.shtml";
		var tArea = document.getElementById("tArea");
		var bcContent = tArea.value;
		var params = {"bookId":bookId,"bcContent":bcContent,"userId":userId};
		$.post(url,params,function(data){
			alert(data.msg);
		},"json");
	}
	
	function jgBtn(isbn,userId){
		var url = "${pageContext.request.contextPath}/jg/bookJg.shtml";
		var params = {"isbn":isbn,"userId":userId};
		$.post(url,params,function(data){
			alert(data.msg);
		},"json");
	}
	
</script>
</head>

<body style="background-color: rgba(10%,10%,10%,6%);">
	<div class="details_big">
		<div class="details_img">
			<img src="${pageContext.request.contextPath }/img/top_book.jpg">
		</div>
		
		<div class="details_box">
			<div class="book_img">
				<div class="book_img_box">
					<img src="http://localhost:8024/image-web/${bookinfo.bookImgurl }">				
				</div>
			</div>
			<div class="book_details">
				<table class="book_details_table">
					<tr>
						<td style="width: 111px;text-align: right;">题名:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${bookinfo.bookName }</td>
						
						<td style="text-align: right;">页数:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${bookinfo.bookNumberpage }</td>
					</tr>
					<tr>
						<td style="text-align: right;">作者:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${bookinfo.bookAuthor }</td>
						
						<td style="text-align: right;">ISBN:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${bookinfo.isbn }</td>
					</tr>
					<tr>
						<td style="text-align: right;">出版社:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${bookinfo.bookPublish }</td>
						
						<td style="text-align: right;">出版时间:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${bookinfo.bookPubtime }</td>
					</tr>
					<tr>
						<td style="text-align: right;">中图分类:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${bookinfo.bookCnclassLetter }</td>
						
						<td style="text-align: right;">定价:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${bookinfo.bookPrice }</td>
					</tr>
					<tr>
						<td style="text-align: right;">荐购次数:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${bookinfo.bookNum }</td>
					</tr>
				</table>
				
				<table class="book_details_content">
					<tr>
						<td>
							<dl style="margin-top: 15px;" class="dl-horizontal">
							  <dt style="width: 75px;">摘要:</dt>
							  <dd style="width: 440px;margin-left: 100px;">
							  	  ${bookinfo.bookSummary }
							  </dd>
							</dl>
						</td>
					</tr>
				</table>
				
				<table class="book_details_button">
					<tr>
						<td>
							<a class="btn btn-default mybtn" href="javascript:void(0);" onclick="jgBtn('${bookinfo.isbn }','${user_session.userId }')" role="button">荐购</a>&nbsp;&nbsp;
						</td>
					</tr>
				</table>
			</div>
		</div>
		 
	</div>
	
	<div class="commentBox">
		<br>
		<form action="" method="post">
			<table>
				<tr>
					<td width="880px">
						<textarea style="resize:none;width: 800px;margin-left: 25px;" id="tArea" name="bcContent" class="form-control" rows="3" ></textarea>
					</td>
					<td >
						<button class="btn btn-default" onclick="subComment('${bookinfo.bookId }','${user_session.userId }')" type="button">发表评论</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	<c:forEach items="${comments }" var="entry">
		<div class="commentUser">
			<table style="width: 1100px;position:relative;top:10px;">
				<tr>
					<td style="font-size: 14px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${entry.username }&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;${entry.bcContent }&nbsp;&nbsp;&nbsp;&nbsp;(<fmt:formatDate value="${entry.bcTime }" pattern="yyyy-MM-dd HH:mm:ss" />  )</td>
					<td width="100px" style="font-size: 12px;"><a>有用</a>&nbsp;&nbsp;${entry.bcBeuse }&nbsp;&nbsp;&nbsp;<a>没用</a>&nbsp;&nbsp;${entry.bcNouse }</td>
				</tr>
			</table>
		</div>
	</c:forEach>
	
</body>
</html>
