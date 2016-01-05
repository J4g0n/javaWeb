<%
    String redirection = request.getParameter("choix");

    if (redirection.equals("deu")) {
%>
    <jsp:forward page="Page_130_DeuxiemePage.jsp">
        <jsp:param name="nm" value="CHEVALLIER"/>
        <jsp:param name="pn" value="Pascal"/>
    </jsp:forward>
<%
    } else if (redirection.equals("tro")) {
%>
    <jsp:forward page="Page_130_TroisiemePage.jsp">
        <jsp:param name="nm" value="CHEVALLIER"/>
        <jsp:param name="pn" value="Pascal"/>
    </jsp:forward>
<%
    } else {
        // Redirection vers un site web externe
        response.sendRedirect("http://www.google.com");
    }
%>

