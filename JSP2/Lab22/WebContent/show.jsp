<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h1>Hi<%=request.getAttribute("Nm") %>
<br/>
You have send on 
<%=request.getAttribute("DT")%>
</h1>
</body>
</html>