<%--
  Created by IntelliJ IDEA.
  User: ipi
  Date: 05/01/2016
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulaire</title>
</head>
<body>
    <form action="Page_120_TraitementFormulaire.jsp">
        <table>
            <tr>
                <td>Nom et Prénom : </td>
                <td><input type="text" name="nom"/></td>
            </tr>
            <tr>
                <td>Date : </td>
                <td><input type="text" name="date"/></td>
            </tr>
            <tr>
                <td>Quand : </td>
                <td>
                    <select name="quand" size="1">
                        <option value="mid">Midi</option>
                        <option value="soi">Soir</option>
                    </select>
                </td>
            </tr>
        </table>
        <button type="submit">Add</button>
    </form>
</body>
</html>
