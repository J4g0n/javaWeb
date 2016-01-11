<%--
  Created by IntelliJ IDEA.
  User: ipi
  Date: 11/01/2016
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exercice 050 Nouveau topic</title>
</head>
<body>
    <%
        String parentId = request.getParameter("parent");
        session.setAttribute("parent", parentId);
    %>
    <form action="NouveauTopic" method="post">
        <input type="text" disabled name="parentId" value="<%=parentId%>"/>
        <input type="text" name="contenu"/>
        <button type="submit">Creer topic</button>
    </form>
    <a href="Exercice050_Messages.jsp"><button>Annuler</button></a>
</body>
</html>
