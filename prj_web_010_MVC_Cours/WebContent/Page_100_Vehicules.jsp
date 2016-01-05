<%@ page import="models.Vehicule" %>

<%
    Vehicule porsche = new Vehicule("Porsche", "Carrera", 19);
    Vehicule toyota = new Vehicule("Toyota", "Rav4", 13);
    Vehicule audi = new Vehicule("Audi", "A4", 13);
%>

<%
    out.println(porsche.getMarque() + " " + porsche.getModele());
    out.println(toyota.getMarque() + " " + toyota.getModele());
    out.println(audi.getMarque() + " " + audi.getModele());
%>