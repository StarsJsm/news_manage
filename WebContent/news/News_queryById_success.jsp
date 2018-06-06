<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻管理系统</title>
<link rel="stylesheet" href="../css/index.css" />
<link rel="stylesheet" type="text/css" href="../css/newscontent.css"/>
</head>
<body>
<div class="top">
		<div class="top_1">
			<img src="../img/logo.png" />
			<div class="sousuo">
				<input type="text" placeholder="请输入所用查询的信息" /> <a>搜索</a>
			</div>
			<div id="posern">
				<div class="posern">
					<img src="../img/user.jpg">
					<ul id="list">
						<li> ${sessionScope.loginUserName}</li>
						<li><a href="#">我的信息</a></li>
						<li><a href="<%=path%>/users/Users_logout.action">退出</a></li>
					</ul>
				</div>
			</div>
		</div> 
		<div class="conter">
			<div class="right_index">
				<h2><s:property value="#session.news.title"/></h2>
				<div class="news_top2">
					<ul>
						<li>发布人：<span><s:property value="#session.news.userId"/></span></li>
						<li>发布时间：<span><s:property value="#session.news.time"/></span></li>
						<li>浏览量：<span><s:property value="#session.news.count"/></span></li>
					</ul>
				</div>
				<div class="news_line">
					<ol>
						<li></li>
						<li></li>
					</ol>
				</div>
					
				<p>
					<s:property value="#session.news.content"/>
				</p>
				<!-- <ul class="zhuangtailan">
					<li>通过</li>
					<li>不通过</li>
				</ul> -->
			</div>
					
		</div>
	</div>
</body>
</html>