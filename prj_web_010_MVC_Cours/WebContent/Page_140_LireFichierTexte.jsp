<%@ page import="java.io.File" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.FileReader" %>

<%
    String nom = "";
    String prenom = "";
    String photo = "";

    String nomFichier = "presidentsFrancais.txt";
    String cheminFichier = request.getRealPath("/");
    nomFichier = cheminFichier + "/" + nomFichier;

    File fichier = new File(nomFichier);

    if (fichier.exists()) {
        BufferedReader curseurFichier = new BufferedReader(new FileReader(fichier));
        String ligne;
        String [] infoPresident;

        /*curseurFichier = new BufferedReader(new FileReader(fichier));
        curseurFichier.lines().map(line -> line.trim().split(";")).map(infos -> {
            out.println(infos[0] + " " + infos[1] + "<br/>");
            return ;
        });
        */
        while ((ligne=curseurFichier.readLine()) != null) {
            infoPresident = ligne.trim().split(";");
            nom = infoPresident[0];
            prenom = infoPresident[1];
            photo = infoPresident[2];
%>
    
    <table>
        <tr>
            <td><%=nom %></td>
            <td><%=prenom %></td>
            <td><img src="<%=photo %>"/></td>
        </tr>
    </table>

<%
    }
        curseurFichier.close();
    } else {

    }
%>