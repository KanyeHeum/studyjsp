<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "ko">
<head>
<meta charset="UTF-8">
<meta name = "viewport" content = "width = device - width,initial-scale = 1.0"/>
<title>count</title>
</head>
<body>
	<%! int globalCount = 0; %>
	<% int localCount = 0; %>
	<% 
		globalCount++;
		localCount++;
	%>
	globalCount = <%=globalCount %>
	localCount = <%= localCount %>
</body>
</html>