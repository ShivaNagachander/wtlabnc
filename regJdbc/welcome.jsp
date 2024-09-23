<%
out.print("Login Successful");
String s=(String)session.getAttribute("uname");
session.setMaxInactiveInterval(30);

%>
<a href="logout.jsp">logout</a>
