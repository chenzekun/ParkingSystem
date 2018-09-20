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
</head>
<body>
<form id="form1" name="form1" method="post" action="">
  <a href="#">注销</a>
  <table width="807" border="1">
    <tr>
      <td width="101">车牌</td>
      <td width="51">名称</td>
      <td width="75">是否停车</td>
      <td width="111">会员状态</td>
      <td width="96">会员到期时间</td>
      <td width="76">VIP车位</td>
      <td width="251">操作</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td><a href="#">会员办理</a>
	  <a href="#">续费</a>
	  <a href="#">套餐升级</a>
	  </td>
    </tr>
  </table>
</form>
</body>
</html>
