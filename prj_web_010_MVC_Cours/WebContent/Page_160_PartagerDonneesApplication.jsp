<%--
  Created by IntelliJ IDEA.
  User: ipi
  Date: 06/01/2016
  Time: 09:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        //application.setAttribute("attr", "Value");
        //application.getAttribute("attr");
        String nomFichier = application.getInitParameter("factures");
        out.println("Nom du fichier: " + nomFichier);
    %>
</body>
</html>
