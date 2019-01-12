<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>采购清单</title>
</head>
<body style="background-color: rgba(10%,10%,10%,6%);">
	<div class="back_right">
		<div class="back_right_box">
			<form action="" method="post">
				<table class="back_right_form">
					<tr>
						<td width="120px">
							<select style="width: 90px;margin: 0 auto;" class="form-control">
							  <option value="0">图书</option>
							  <option value="1">期刊</option>
							</select>
						</td>
						<td width="70px">
							<input class="btn btn-default" type="submit" value="导出">
						</td>
						<td width="60px">
							<a class="btn btn-default" href="javascript:void(0);" role="button">删除</a>
						</td>
					</tr>
				</table>
			</form>
			
			<table border="1" class="back_right_list">
				<tr style="height: 30px;color: red;font-size: 14px;">
					<td width="15px">
						<div class="checkbox">
						  <label>
						    &nbsp;&nbsp;<input type="checkbox" id="blankCheckbox" value="option1" aria-label="...">
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
						ISBN/ISSN
					</td>
					<td>
						出版社
					</td>
					<td>
						荐购次数
					</td>
					<td>
						操作
					</td>
				</tr>
				
				<tr style="height: 22px;">
					<td width="15px">
						<div class="checkbox">
						  <label>
						    &nbsp;&nbsp;<input type="checkbox" id="blankCheckbox" value="option1" aria-label="...">
						  </label>
						</div>
					</td>
					<td>
						<a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toDetails.shtml')">红楼梦 </a>
					</td>
					<td>
						罗贯中
					</td>
					<td width="120px">
						1234567890123
					</td>
					<td>
						清华大学出版社
					</td>
					<td width="80px">
						20
					</td>
					<td width="140px">
						<a class="btn btn-default" href="javascript:void(0);" role="button">删除</a>&nbsp;&nbsp;
						<!-- Button trigger modal -->
						<button style="font-size: 12px;height: 35px;" type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
						  编辑
						</button>
					</td>
				</tr>
				
				<tr style="height: 22px;">
					<td width="15px">
						<div class="checkbox">
						  <label>
						    &nbsp;&nbsp;<input type="checkbox" id="blankCheckbox" value="option1" aria-label="...">
						  </label>
						</div>
					</td>
					<td>
						<a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toDetails.shtml')">红楼梦 </a>
					</td>
					<td>
						罗贯中
					</td>
					<td width="120px">
						1234567890123
					</td>
					<td>
						清华大学出版社
					</td>
					<td width="80px">
						20
					</td>
					<td width="140px">
						<a class="btn btn-default" href="javascript:void(0);" role="button">删除</a>&nbsp;&nbsp;
						<!-- Button trigger modal -->
						<button style="font-size: 12px;height: 35px;" type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
						  编辑
						</button>
					</td>
				</tr>
				
				<tr style="height: 22px;">
					<td width="15px">
						<div class="checkbox">
						  <label>
						    &nbsp;&nbsp;<input type="checkbox" id="blankCheckbox" value="option1" aria-label="...">
						  </label>
						</div>
					</td>
					<td>
						<a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toDetails.shtml')">红楼梦 </a>
					</td>
					<td>
						罗贯中
					</td>
					<td width="120px">
						1234567890123
					</td>
					<td>
						清华大学出版社
					</td>
					<td width="80px">
						20
					</td>
					<td width="140px">
						<a class="btn btn-default" href="javascript:void(0);" role="button">删除</a>&nbsp;&nbsp;
						<!-- Button trigger modal -->
						<button style="font-size: 12px;height: 35px;" type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
						  编辑
						</button>
					</td>
				</tr>
				
				<tr style="height: 22px;">
					<td width="15px">
						<div class="checkbox">
						  <label>
						    &nbsp;&nbsp;<input type="checkbox" id="blankCheckbox" value="option1" aria-label="...">
						  </label>
						</div>
					</td>
					<td>
						<a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toDetails.shtml')">红楼梦 </a>
					</td>
					<td>
						罗贯中
					</td>
					<td width="120px">
						1234567890123
					</td>
					<td>
						清华大学出版社
					</td>
					<td width="80px">
						20
					</td>
					<td width="140px">
						<a class="btn btn-default" href="javascript:void(0);" role="button">删除</a>&nbsp;&nbsp;
						<!-- Button trigger modal -->
						<button style="font-size: 12px;height: 35px;" type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
						  编辑
						</button>
					</td>
				</tr>
				
				<tr style="height: 22px;">
					<td width="15px">
						<div class="checkbox">
						  <label>
						    &nbsp;&nbsp;<input type="checkbox" id="blankCheckbox" value="option1" aria-label="...">
						  </label>
						</div>
					</td>
					<td>
						<a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toDetails.shtml')">红楼梦 </a>
					</td>
					<td>
						罗贯中
					</td>
					<td width="120px">
						1234567890123
					</td>
					<td>
						清华大学出版社
					</td>
					<td width="80px">
						20
					</td>
					<td width="140px">
						<a class="btn btn-default" href="javascript:void(0);" role="button">删除</a>&nbsp;&nbsp;
						<!-- Button trigger modal -->
						<button style="font-size: 12px;height: 35px;" type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
						  编辑
						</button>
					</td>
				</tr>
				
				<tr style="height: 22px;">
					<td width="15px">
						<div class="checkbox">
						  <label>
						    &nbsp;&nbsp;<input type="checkbox" id="blankCheckbox" value="option1" aria-label="...">
						  </label>
						</div>
					</td>
					<td>
						<a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toDetails.shtml')">红楼梦 </a>
					</td>
					<td>
						罗贯中
					</td>
					<td width="120px">
						1234567890123
					</td>
					<td>
						清华大学出版社
					</td>
					<td width="80px">
						20
					</td>
					<td width="140px">
						<a class="btn btn-default" href="javascript:void(0);" role="button">删除</a>&nbsp;&nbsp;
						<!-- Button trigger modal -->
						<button style="font-size: 12px;height: 35px;" type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
						  编辑
						</button>
					</td>
				</tr>
				
				<tr style="height: 22px;">
					<td width="15px">
						<div class="checkbox">
						  <label>
						    &nbsp;&nbsp;<input type="checkbox" id="blankCheckbox" value="option1" aria-label="...">
						  </label>
						</div>
					</td>
					<td>
						<a href="javascript:void(0);" onclick="window.open('${pageContext.request.contextPath}/toDetails.shtml')">红楼梦 </a>
					</td>
					<td>
						罗贯中
					</td>
					<td width="120px">
						1234567890123
					</td>
					<td>
						清华大学出版社
					</td>
					<td width="80px">
						20
					</td>
					<td width="140px">
						<a class="btn btn-default" href="javascript:void(0);" role="button">删除</a>&nbsp;&nbsp;
						<!-- Button trigger modal -->
						<button style="font-size: 12px;height: 35px;" type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
						  编辑
						</button>
					</td>
				</tr>
				
			</table>
			
			<div>
				
				<%-- <nav aria-label="Page navigation">
				  <ul class="pagination">
				    
				    <c:forEach items="${pagination.pageView }" var="page">
				    	${page }
				    </c:forEach>
				  
				  </ul>
				</nav> --%>
				
			</div>
			
		</div>
		
		<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div style="width: 800px;" class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">编辑</h4>
		      </div>
		      <form action="${pageContext.request.contextPath }/" method="post">
			      <div style="width: 800px;" class="modal-body">
			        <table style="width: 770px;">
			        	<tr height="40">
				        	<td style="text-align: right;">题名：</td>
				        	<td>
				        		<input style="width: 220px;" type="text" class="form-control" name="" placeholder="题名">
				        	</td>
				        	
				        	<td style="text-align: right;">作者：</td>
				        	<td>
					        	<input style="width: 220px;" type="text" class="form-control" name="" placeholder="作者">
				        	</td>
			        	</tr>
			        
			        	<tr height="40">
			        		<td style="text-align: right;">ISBN/ISSN：</td>
				        	<td>
				        		<input style="width: 220px;" type="text" class="form-control" name="" placeholder="ISBN/ISSN">
				        	</td>
				        	
				        	<td style="text-align: right;">出版社：</td>
				        	<td>
				        		<input style="width: 220px;" type="text" class="form-control" name="" placeholder="出版社">
				        	</td>
			        	</tr>
			        	
			        	<tr height="40">
				        	<td style="text-align: right;">学科分类：</td>
				        	<td>
				        		<select style="width: 220px;" name="college" class="form-control">
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
				        	
				        	<td style="text-align: right;">普通分类：</td>
				        	<td>
				        		<select style="width: 220px;" name="college" class="form-control">
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
			        	
			        <table style="width: 700px;height: 220px;margin-left: 50px;">
			        	<tr>
			        		<td style="text-align: right;">封面：</td>
				        	<td width="200px">
				        		<div style="width: 200px;" class="form-group"><br>
								    <input type="file" id="file" onchange="filechange(event)">
								    <div id="picBox">
								    	<img src="" id="img" width="130px" height="140px" style="margin-top: 6px;margin-left: 10px;">
								    </div>
								</div>
				        	</td>
			       
				        	<td style="text-align: right;">摘要：</td>
				        	<td width="350px;">
				        		<textarea style="height: 200px;resize:none;" class="form-control" rows="3" ></textarea>
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
<script type="text/javascript">
	var filechange = function(event){
		var files = event.target.files, file;
		if(files && files.length > 0){
			file = files[0];
			var URL = window.URL || window.webkitURL;
			var imgURL = URL.createObjectURL(file);
			$("#img").attr("src",imgURL);
		}
	};
</script>
</html>
