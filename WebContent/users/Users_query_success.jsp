<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻管理系统</title>
<link rel="stylesheet" href="../css/index.css" />
<link rel="stylesheet" type="text/css" href="../css/table.css" />
<script src="../js/down_menu.js"></script>
<script type="text/javascript" src="../js/jump.js" ></script>
</head>
<body>
<!--顶部-->
		<div class="top">
			<div class="top_1">
				<img src="../img/logo.png" />
				<div class="sousuo">
					<input type="text" placeholder="请输入所用查询的信息" />
					<a>搜索</a>
				</div>
				<div id="posern">
					<div class="posern">
						<img src="../img/user.jpg">
						<ul id="list">
						    <%-- <li> ${sessionScope.loginUserName}</li> --%>
							<li><a href="#">我的信息</a></li>
							<li><a href="<%=path%>/users/Users_logout.action">退出</a></li>
						</ul>
					</div>
				</div>
			</div>

		</div>
		<!--内容-->
		<div class="conter">
			<ul id="nav">
				<li class="li_backg">首页</li>
				<li>新闻审核</li>
				<li><a href="Users_query.action">查看用户</a></li>
				<li>添加用户</li>
				<li>删除用户</li>
				<li>修改密码</li>
			</ul>
			
			<div class="right_index">
				<!--第一个表单-->
				<table id="first" class="first-table">
					<thead>
						<tr>
							<th>姓名</th>
							<th>院系</th>
							<th>性别</th>
							<th>电话</th>
							<th>邮箱</th>
							<th>账号状态</th>
							<th>操作</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
					    <s:iterator value="#session.users_listAll" var="user">
						<tr>
							<td><s:property value="#user.userName"/></td>
							<td><s:property value="#user.departId"/></td>
							<td><s:property value="#user.userSex"/></td>
							<td><s:property value="#user.userTele"/></td>
							<td><s:property value="#user.userEmail"/></td>
							<td><s:property value="#user.status"/></td>
							<td><a href="" >冻结</a></td>
							<td><a href="<%=path%>/users/Users_delete.action?uid=<s:property value="#user.userId"/>" onclick="javascript: return confirm('确定删除？');">删除</a></td>
						</tr>
						</s:iterator>
					</tbody>
				</table>
			</div>
		</div>
</body>
</html>