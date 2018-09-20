<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>
</head>
<body>
<form id="form1" name="form1" method="post" action="<%=basePath%>frontground/ch/userRegister.action" >
  <div>手机号：
    <label>
    <input type="text" name="userTel" id="acc" onblur="checkData()"/>
	<span id="cn"></span>
    </label>
  </div>
   <div>密码：
    <label>
    <input type="text" name="userPwd" />
    </label>
  </div>
   <div>姓名：
    <label>
    <input type="text" name="userName" />
    </label>
  </div>
  <div>姓名：
   <input type="radio" name="userSex" id="radio" value="男">
		<label for="radio"></label> 男 <input type="radio"
		name="userSex" id="radio2" value="女"> <label
		for="radio2"></label> 女
  </div>
   <div>Email：
    <label>
    <input type="text" name="userEmail" />
    </label>
  </div>
   <div>身份证：
    <label>
    <input type="text" name="userIDCard" />
    </label>
  </div>
  <input type="file" name="file0" id="file0" multiple="multiple" /><br>
		<img src="" id="img0" style="width: 20rem; height: 15rem;">
  <input type="submit" value="注册" />
  <input type="button" value="返回" />
</form>
</body>
<script type="text/javascript"src="js/jquery.min.js"></script>

<script type="text/javascript">
	function checkData(){
	 	 console.log($("#acc").val()); 
		 $.ajax({
			 type:"post",
			 url:"<%=basePath%>frontground/ch/checkUser.action",
			 data:{"userTel":$("#acc").val()},
			 dataType:"text",
			 success:function(data){
				 alert(data);
				 console.log(data);	
				 $("#cn").html(data);
			 }		 		 
		 });
	}	

</script>
<script>
		$("#file0").change(function() {
			var objUrl = getObjectURL(this.files[0]);//获取文件信息  
			console.log("objUrl = " + objUrl);
			if (objUrl) {
				$("#img0").attr("src", objUrl);
			}
		});
		function getObjectURL(file) {
			var url = null;
			if (window.createObjectURL != undefined) {
				url = window.createObjectURL(file);
			} else if (window.URL != undefined) { // mozilla(firefox)  
				url = window.URL.createObjectURL(file);
			} else if (window.webkitURL != undefined) { // webkit or chrome  
				url = window.webkitURL.createObjectURL(file);
			}
			return url;
		}
	</script>
</html>
