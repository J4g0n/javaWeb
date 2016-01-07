<%@ page import="java.util.Calendar" %>

<%
    String db = (String) session.getAttribute("dateDebut");
    String cpt = (String) session.getAttribute("compte");
    String etat = (String) session.getAttribute("etatSession");

    if (db == null) {
        Calendar calendar = Calendar.getInstance();
        int annee = calendar.get(Calendar.YEAR);
        int jour = calendar.get(Calendar.DAY_OF_MONTH);
        int mois = calendar.get(Calendar.MONTH) + 1;
        db = jour + "/" + mois + "/" + annee;
    }
    if (cpt == null) {
        cpt = "Hubert";
    }
    if (etat == null) {
        etat = "non connecté";
    }

    session.setAttribute("dateDebut", db);
    session.setAttribute("compte", cpt);
    session.setAttribute("etatSession", etat);
%>

<h1>Je suis la page 2.</h1>
<h1>Date début de session: <%=db %></h1>
<h1>Compte: <%=cpt %></h1>
<h1>Etat session: <%=etat %></h1>

<form action="Page_150_Session.jsp">
    <input value="valider" type="submit"/>
</form>