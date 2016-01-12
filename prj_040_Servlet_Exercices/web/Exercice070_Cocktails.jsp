<%@ page import="modeles.Cocktail" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: ipi
  Date: 12/01/2016
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="Exercice070_CSS.css">
</head>
<body>
    <%@include file="Exercice070_Entete.jsp" %>
    <%@include file="Exercice070_Menu.jsp" %>
    <table>
        <%
            ArrayList<Cocktail> listCocktail = (ArrayList<Cocktail>) request.getAttribute("cocktails");
            for (Cocktail cocktail: listCocktail) {
        %>
        <tr>
            <td><%=cocktail.getNom()%></td>
            <td><%=cocktail.getAlcool()%></td>
            <td><%=cocktail.getProportionAlcool()%></td>
            <td><%=cocktail.getSoda()%></td>
            <td><%=cocktail.getJus()%></td>
            <td><%=cocktail.getProportionJus()%></td>
            <td><img width="200" height="150" src="<%=cocktail.getPhoto()%>" alt="Super photo que tu peux pas voir"/></td>
        </tr>
        <%
            }
        %>
    </table>
    <%@include file="Exercice070_Pied.jsp" %>
</body>
</html>
