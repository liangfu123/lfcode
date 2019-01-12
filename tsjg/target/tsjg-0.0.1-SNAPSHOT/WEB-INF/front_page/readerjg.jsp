<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>自定义荐购</title>
</head>

<body style="background-color: rgba(10%,10%,10%,6%);">

	<div class="right_big">
		<div class="rank_top">
			<div class="rank_d"></div>
			<div class="rank_h1">
				<h1>自定义荐购</h1>
			</div>
		</div>
		<hr>
		
		<div class="jg_form">
			<div class="jg_sub">
				<form action="" method="post">
					<table style="text-align: right;margin-left: 100px;">
						<tr height="50px;">
							<td>书名：</td>
							<td>
								<input type="text" class="form-control" name="" placeholder="书名">
							</td>
						</tr>
						<tr height="50px;">
							<td>作者：</td>
							<td>
								<input type="text" class="form-control" name="" placeholder="作者">
							</td>
						</tr>
						<tr height="50px;">
							<td>出版社：</td>
							<td>
								<input type="text" class="form-control" name="" placeholder="出版社">
							</td>
						</tr>
						<tr height="50px;">
							<td>ISBN/ISSN：</td>
							<td>
								<input type="text" class="form-control" name="" placeholder="ISBN/ISSN">
							</td>
						</tr>
						<tr height="90px;">
							<td>&nbsp;</td>
							<td>
								<input class="btn btn-default" type="submit" value="荐购">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input class="btn btn-default" type="reset" value="重置">
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		
	</div>

</body>
</html>
