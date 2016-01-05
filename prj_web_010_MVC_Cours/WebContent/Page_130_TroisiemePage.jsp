<%
    String nom = request.getParameter("nm");
    String prenom = request.getParameter("pn");

    out.println(nom + " " + prenom + " sur la troisieme page");
%>