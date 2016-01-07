<%
    String db = (String) session.getAttribute("dateDebut");
    String cpt = (String) session.getAttribute("compte");
    String etat = (String) session.getAttribute("etatSession");

    if (db == null) {
        db = "";
    }
    if (cpt == null) {
        cpt = "Hubert";
    }
    if (etat == null) {
        etat = "non connecté";
    }
%>

<h1>Je suis la page 1.</h1>
<h1>Date début de session: <%=db %></h1>
<h1>Compte: <%=cpt %></h1>
<h1>Etat session: <%=etat %></h1>

<form action="Page_150_Session2.jsp">
    <input value="valider" type="submit"/>
</form>