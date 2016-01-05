<%--
  Created by IntelliJ IDEA.
  User: ipi
  Date: 05/01/2016
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        int i = 5;
    %>
    Nombre de factures: <%=i %>
    Nous sommes le <%=new java.text.SimpleDateFormat("dd MMMM HH:mm:ss").format(new java.util.Date()) %>
</body>
</html>
