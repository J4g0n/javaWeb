<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%
	/*
		=======================================================
		1) Installer Wampserver et le configurer sur le port 8090
		=======================================================
		2) Cr�er une BD :BDVehicules contenant une table Proprietaires et table Vehicules
		================================================================================
		3) cr�er une page jsp sp�cialis�e dans la connexion � la BD et l'inclure ici
%>
<%@ include file="Page_190_ConnectionBDVehicules_mysql.jsp" %>
<%
	/*	=================================================
		lire la liste des vehicules et leur propri�taires
		=================================================
	*/
	Statement stmtVeh = cnx.createStatement();
	String requeteVeh;
	int compteur = 0;
	requeteVeh="SELECT * from vehicule";
	String titre="Gestion des Vehicules : Liste des V�hicules";
	ResultSet rstVeh;
	rstVeh = stmtVeh.executeQuery(requeteVeh);
	out.println("<H3>"+titre+"<H3>");
	while (rstVeh.next())
    {
		compteur++;
		out.println("<h4>V�hicule : "+rstVeh.getString("marque")+" - "+rstVeh.getString("modele")+
				" - "+rstVeh.getInt("prix"));
    }
%>