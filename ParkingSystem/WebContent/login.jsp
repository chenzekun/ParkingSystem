<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/messages_zh.js"></script>
<script>
$(document).ready(function() {
	$("#form1").on("submit",function(event){
		$(this).validate();
	});
	
	$("#form1").validate({
	rules:{
		userTel:"required",
		userPwd:"required"
					
	}
	});
	
});
</script>
<base href="<%=basePath%>">
</head>
<body>
	<form action="<%=basePath%>frontground/ch/login.action" method="post" di="form1" name="form1">
		用户名：<input type="text" name="userTel" /><br />
		 密码：<input type="password" name="userPwd" /><br />
		 <a href="userReg.jsp">注册账号</a>
		  <input type="submit" value="登录" />
	</form>
</body>
</html>
