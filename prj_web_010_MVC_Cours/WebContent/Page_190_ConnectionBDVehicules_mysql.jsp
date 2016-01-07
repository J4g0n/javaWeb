<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%
	/*
		=======================================================
		- Installer Wampserver et le configurer sur le port 8090
		=======================================================
		- Cr�er une BD :BDVehicules contenant une table Proprietaires et table Vehicules
		- configurer une source de donn�es : odbc
		================================================================================
		ici code � inclure dans les autres pages JSP pour se connecter � la base de donn�es
	*/
    
    Connection cnx = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/BDVehicule","root","");
				//out.println("<br>Connexion � la base BDVehicules r�ussie<br>");
				}
            catch (Exception e) 
           	    {
            	out.println("<br>La connexion est impossible � la BD BDVehicule<br>");
           		out.println(e.toString());
				}
 %>