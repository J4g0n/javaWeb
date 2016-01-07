Vous devez trouver un nombre entre 0 et 1024
<%
    String nbEssaisPar = (String)session.getAttribute("nbEssais");
    String numberPar = (String)session.getAttribute("number");
    String tryNbPar = (String)request.getParameter("tryNb");

    int nbEssais;
    int number;
    int tryNb = 0;

    if (nbEssaisPar == null) {
        nbEssais = 0;
    } else {
        nbEssais = Integer.parseInt(nbEssaisPar);
    }
    if (numberPar == null) {
        number = (int) (Math.random() * 1024);
        session.setAttribute("number", Integer.toString(number));
    } else {
        number = Integer.parseInt(numberPar);
    }
    if (tryNbPar != null) {
        tryNb = Integer.parseInt(tryNbPar);
    }
%>
<form action="Exercice180.jsp">
    <input type="text" name="tryNb"/>
    <button type="submit">Tester</button>
</form>
<%
    nbEssais++;
    session.setAttribute("nbEssais", Integer.toString(nbEssais));
    if (nbEssais > 10) {
        out.println("Nombre d'essais autorisés dépassés !");
    } else if (tryNbPar == null) {
        out.println("Essayer un nombre");
    } else if (tryNb == number) {
        out.println("Bravo, " + tryNb + " était le nombre qu'il fallait trouver");
    } else if (tryNb > number) {
        out.println("C'est moins");
    } else {
        out.println("C'est plus");
    }
%>