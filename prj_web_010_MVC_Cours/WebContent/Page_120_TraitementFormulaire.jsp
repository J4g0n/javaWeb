<%
    String nom = request.getParameter("nom");
    String date = request.getParameter("date");
    String quand = request.getParameter("quand");

    if (nom.trim().isEmpty()) {
        date = "Nom obligatoire !!";
    }
    if (date.trim().isEmpty()) {
        date = "Date de réservation obligatoire !!";
    }

    out.println(nom + "<br/>");
    out.println(date + "<br/>");
    out.println(quand + "<br/>");
%>