<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.gzbaba.web.UserArgroovyClass" %>
<%@ page import="com.gzbaba.script.AGroovyClass" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Groovy Demo</title>
</head>
<body>
	<h3>欢迎进入, Groovy Demo!</h3>
	<%
		AGroovyClass test = new AGroovyClass();
		out.println(test.getString());
	%>
</body>
</html>