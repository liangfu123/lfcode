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
<title>期刊详情</title>
<script type="text/javascript">
	function subComment(magId,userId){
			var url = "${pageContext.request.contextPath}/magComment.shtml";
			var tArea = document.getElementById("tArea");
			var mcContent = tArea.value;
			var params = {"magId":magId,"mcContent":mcContent,"userId":userId};
			$.post(url,params,function(data){
				alert(data.msg);
			},"json");
		}
	
	function jgBtn(magIssn,userId){
		var url = "${pageContext.request.contextPath}/magJg.shtml";
		var params = {"magIssn":magIssn,"userId":userId};
		$.post(url,params,function(data){
			alert(data.msg);
		},"json");
	}
</script>
</head>

<body style="background-color: rgba(10%,10%,10%,6%);">
	<div class="details_big">
		<div class="details_img">
			<img src="${pageContext.request.contextPath }/img/top_mag.jpg">
		</div>
		
		<div class="details_box">
			<div class="book_img">
				<div class="book_img_box">
					<img src="http://localhost:8024/image-web/${maginfo.magImgurl }">				
				</div>
			</div>
			<div class="book_details">
				<table style="font-size: 14px;" class="book_details_table">
					<tr>
						<td style="width: 140px;text-align: right;">标题:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${maginfo.magTitle }</td>
					</tr>
					<tr>
						<td style="text-align: right;">主管单位:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${maginfo.magCompetent }</td>
					</tr>
					<tr>
						<td style="text-align: right;">主办单位:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${maginfo.magHostunit }</td>
					</tr>
					<tr>
						<td style="text-align: right;">出版周期:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${maginfo.magPubcycle }</td>
					</tr>
					<tr>
						<td style="text-align: right;">邮发代号:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${maginfo.magMailnum }</td>
					</tr>
					<tr>
						<td style="text-align: right;">ISSN:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${maginfo.magIssn }</td>
					</tr>
					<tr>
						<td style="text-align: right;">国内刊号:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${maginfo.magCn }</td>
					</tr>
					<tr>
						<td style="text-align: right;">期刊分类:&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>${maginfo.magCategoryName }</td>
					</tr>
				</table>
				
				<table class="book_details_content">
					<tr>
						<td>
							<dl style="margin-top: 15px;" class="dl-horizontal">
							  <dt style="width: 75px;">简介:</dt>
							  <dd style="width: 440px;margin-left: 100px;">
							  	  ${maginfo.magIntro }
							  </dd>
							</dl>
						</td>
					</tr>
				</table>
				
				<table class="book_details_button">
					<tr>
						<td>
							<a class="btn btn-default" href="javascript:void(0);" onclick="jgBtn('${maginfo.magIssn }','${user_session.userId }')" role="button">荐购</a>&nbsp;&nbsp;
							<a class="btn btn-default" href="javascript:void(0);" onclick="window.location.href='${pageContext.request.contextPath }/toMainFront.shtml'" role="button">返回</a>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	
	<div class="commentBox">
		<br>
		<form action="">
			<table>
				<tr>
					<td width="880px">
						<textarea style="resize:none;width: 800px;margin-left: 25px;" id="tArea" name="mcContent" class="form-control" rows="3" ></textarea>
					</td>
					<td >
						<button class="btn btn-default" onclick="subComment('${maginfo.magId }','${user_session.userId }')" type="button">发表评论</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	
	<c:forEach items="${comments }" var="entry">
		<div class="commentUser">
			<table style="width: 1100px;position:relative;top:10px;">
				<tr>
					<td style="font-size: 14px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${entry.username }&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;${entry.mcContent }&nbsp;&nbsp;&nbsp;&nbsp;(<fmt:formatDate value="${entry.mcTime }" pattern="yyyy-MM-dd HH:mm:ss" />  )</td>
					<td width="100px" style="font-size: 12px;"><a>有用</a>&nbsp;&nbsp;${entry.mcBeuse }&nbsp;&nbsp;&nbsp;<a>没用</a>&nbsp;&nbsp;${entry.mcNouse }</td>
				</tr>
			</table>
		</div>
	</c:forEach>
	
</body>
</html>
