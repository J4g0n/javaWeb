<%
    public double addition(double x, double y) {
        return (x + y);
    }
%>
<%
    public double soustraction(double x, double y) {
        return x - y;
    }
%>
<%
    out.prinln("Addition de 2 et de 6: " + addition(2,6));
    out.prinln("Soustraction de 2 et de 6: " + soustraction(2,6));
%>