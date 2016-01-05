<%
    String nom = request.getParameter("nom");
    String prenom = request.getParameter("prenom");

    out.println("Bonjour " + prenom + " " + nom);
%>