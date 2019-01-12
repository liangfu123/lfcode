<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>图书详情</title>

</head>

<body style="background-color: rgba(10%,10%,10%,6%);">
	<div class="details_big">
		<div class="details_img">
			<img src="${pageContext.request.contextPath }/img/top.jpg">
		</div>
		
		<div class="details_box">
			<div class="book_img">
				<div class="book_img_box">
					<img src="${pageContext.request.contextPath }/img/book_hlm.jpg">				
				</div>
			</div>
			<div class="book_details">
				<table class="book_details_table">
					<tr>
						<td style="width: 140px;text-align: right;">题名:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>红楼梦</td>
						
						<td style="text-align: right;">页数:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>560</td>
					</tr>
					<tr>
						<td style="text-align: right;">作者:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>曹雪芹</td>
						
						<td style="text-align: right;">ISBN:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>1234567890123</td>
					</tr>
					<tr>
						<td style="text-align: right;">出版社:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>人民出版社</td>
						
						<td style="text-align: right;">学科分类:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>文学</td>
					</tr>
					<!-- <tr>
						<td style="text-align: right;">出版时间:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>2018-09-12</td>
					</tr> -->
				</table>
				
				<table class="book_details_content">
					<tr>
						<td>
							<dl style="margin-top: 15px;" class="dl-horizontal">
							  <dt style="width: 75px;">摘要:</dt>
							  <dd style="width: 440px;margin-left: 100px;">
							  	    哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈
							  	    哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈
							  	    哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈
							  	    哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈
							  	    哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈
							  </dd>
							</dl>
						</td>
					</tr>
				</table>
				
				<table class="book_details_button">
					<tr>
						<td>
							<a class="btn btn-default" href="javascript:void(0);" role="button">加入荐购车</a>&nbsp;&nbsp;
							<a style="width: 100px;" class="btn btn-default" href="javascript:void(0);" role="button">荐购</a>&nbsp;&nbsp;
							<a class="btn btn-default" href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath }/toMainFront.shtml'" role="button">返回</a>
						</td>
					</tr>
				</table>
			</div>
		</div>
		
	</div>
</body>
</html>
