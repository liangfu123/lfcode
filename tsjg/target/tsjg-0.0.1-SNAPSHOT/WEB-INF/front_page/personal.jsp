<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>个人中心</title>
</head>
	
<body style="background-color: rgba(10%,10%,10%,6%);">
	
	<div class="personal_top">
		<table>
    		<tr style="height: 90px">
    		<td style="width: 200px;text-align: right;"><img src="${pageContext.request.contextPath }/img/logo.jpg"><label>&nbsp;&nbsp;个人中心</label></td>
    		<td style="width: 1050px;text-align: right;">${user_session.username }&nbsp;&nbsp;|&nbsp;&nbsp;<a href="javascript:(window.location.href='${pageContext.request.contextPath }/toMainFront.shtml')">返回</a></td>
    		</tr>
    	</table>
	</div>
	
	<div class="personal_main">
		<div class="personal_list">
			<ul class="nav nav-pills nav-stacked">
			  <li role="presentation" class="active"><a href="javascript:(0);">设置</a></li>
			  <li role="presentation"><a href="javascript:(0);" onclick="window.location.href='${pageContext.request.contextPath}/toPersonal.shtml'">完善资料</a></li>
			  <li role="presentation"><a href="javascript:(0);" onclick="window.location.href='${pageContext.request.contextPath}/toUpdatepwd.shtml'">修改密码</a></li>
			</ul>
		</div>
		
		<div class="personal_content">
    		<table style="margin-top: 20px;">
    			<tr style="height: 25px;">
    			<td style="width: 130px;text-align: right;"><img src="${pageContext.request.contextPath}/img/style.png">&nbsp;&nbsp;<label>完善资料</label></td>
    			</tr>
    		</table>
    		<hr>
    		
    		<table class="personal_table" border="1">
    			<tr class="personal_tr">
    				<td  class="personal_td">用户名</td><td>${user.username }</td>
    			</tr>
    			<tr class="personal_tr">
    				<td class="personal_td">真实姓名</td><td>${user.realname }</td>
    			</tr>
    			<tr class="personal_tr">
    				<td class="personal_td">性别</td><td>${user.sex }</td>
    			</tr>
    			<tr class="personal_tr">
    				<td class="personal_td">电话号码</td><td>${user.phone }</td>
    			</tr>
    			<tr class="personal_tr">
    				<td class="personal_td">电子邮箱</td><td>${user.email }</td>
    			</tr>
    			<tr class="personal_tr">
    				<td class="personal_td">QQ号</td><td>${user.qq }</td>
    			</tr>
    			<tr class="personal_tr">
    				<td class="personal_td">用户类型</td><td>${user.type }</td>
    			</tr>
    			<tr class="personal_tr">
    				<td class="personal_td">所属学院</td><td>${user.college }</td>
    			</tr>
    		</table>
    		
    		<br>
   			<div style="margin-left: 510px;">
   				<!-- Button trigger modal -->
				<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
				  编辑个人资料
				</button>
   			</div>
    		
		</div>
		
		<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">编辑个人资料</h4>
		      </div>
		      <form action="${pageContext.request.contextPath }/updatePersonal.shtml" method="post">
			      <div class="modal-body">
			        <table style="width: 700px;margin-left: 30px;">
			        	<tr height="40">
				        	<td style="text-align: right;">真实姓名：</td>
				        	<td>
				        		<input style="width: 250px;" type="text" class="form-control" name="realname" placeholder="真实姓名">
				        	</td>
			        	</tr>
			        	<tr height="40">
			        		<td style="text-align: right;">性别：</td>
				        	<td>
					        	&nbsp;&nbsp;男&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" id="optionsRadios1" value="男" checked>
					        	&nbsp;&nbsp;女&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" id="optionsRadios2" value="女">
				        	</td>
			        	</tr>
			        	<tr height="40">
			        		<td style="text-align: right;">电话号码：</td>
				        	<td>
				        		<input style="width: 250px;" type="text" class="form-control" name="phone" placeholder="电话号码">
				        	</td>
			        	</tr>
			        	<tr height="40">
				        	<td style="text-align: right;">电子邮箱：</td>
				        	<td>
				        		<input style="width: 250px;" type="text" class="form-control" name="email" placeholder="电子邮件">
				        	</td>
			        	</tr>
			        	<tr height="40">
				        	<td style="text-align: right;">QQ号：</td>
				        	<td>
				        		<input style="width: 250px;" type="text" class="form-control" name="qq" placeholder="QQ号">
				        	</td>
			        	</tr>
			        	<tr height="40">
				        	<td style="text-align: right;">用户类型：</td>
				        	<td>
				        		<select style="width: 250px;" name="type" class="form-control">
								  <option value="学生">学生</option>
								  <option value="教师">教师</option>
								  <option value="其他">其他</option>
								</select>
							</td>
			        	</tr>
			        	<tr height="40">
				        	<td style="text-align: right;">所属学院：</td>
				        	<td>
				        		<select style="width: 250px;" name="college" class="form-control">
								  <option value="文学与传媒学院">文学与传媒学院</option>
								  <option value="马克思主义学院">马克思主义学院</option>
								  <option value="外国语学院">外国语学院</option>
								  <option value="基础教育学院">基础教育学院</option>
								  <option value="经济与管理学院">经济与管理学院</option>
								  <option value="数学与计算机科学学院">数学与计算机科学学院</option>
								  <option value="电子信息与自动化学院">电子信息与自动化学院</option>
								  <option value="资源与环境学院">资源与环境学院</option>
								  <option value="藏汉双语学院">藏汉双语学院</option>
								  <option value="音乐舞蹈学院">音乐舞蹈学院</option>
								  <option value="美术学院">美术学院</option>
								  <option value="体育与健康学院">体育与健康学院</option>
								</select>
				        	</td>
			        	</tr>
			        	
			        </table>
			        	
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			        <button type="submit" class="btn btn-primary">保存</button>
			      </div>
		      </form>
		    </div>
		  </div>
		</div>
		
	</div>
	
</body>
</html>
