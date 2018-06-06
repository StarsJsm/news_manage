<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
System.out.println(path);
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="css/Login.css"/>
</head>
<body>
	<div class="big_div">
		<div class="login_center">
			<div class="center_right">
				<h2>新闻管理系统</h2>
				<form action="<%=path%>/users/Users_login.action" method="post">
					<div>
						<ul>
							<li><input type="text" placeholder="请输入用户名" name="userId" /></li>
							<li><input type="password" placeholder="请输入密码"
								name="userPswd" /></li>
							<li><input class="input_ys" type="checkbox" id="" /><label>记住密码</label></li>
							<li><input type="submit" value="登录"></li>
						</ul>
					</div>
					<div>
						<s:fielderror />
						<!-- 显示表单验证的出错信息 -->
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>