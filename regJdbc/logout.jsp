<%
String s=(String)session.getAttribute("uname");
session.removeAttribute("uname");
session.invalidate();
response.sendRedirect("index.html");
%>

