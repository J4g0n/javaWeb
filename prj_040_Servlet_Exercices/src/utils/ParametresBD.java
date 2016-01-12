package utils;

import java.sql.*;

/*	=============================================
 * 	Classe parametrage acc�s � une BD relationnelle
 * 	=============================================
 * 	Auteur		:	Choua�b LAGHLAM
 * 	Date		:	Avril 2006
 * 	=============================================
 */
public class ParametresBD {
    private static final String SGBDR = "MY";

    private static final String urlMY = "jdbc:mysql://localhost/bdcocktails";
    private static final String userMY = "root";
    private static final String passwordMY = "";
    private static final String driverJMY = "com.mysql.jdbc.Driver";

    private static final String urlMS =
            "jdbc:sqlserver://S23POSTE19;database=bdChanteursSS";
    private static final String userMS = "sa";
    private static final String passwordMS = "batterie";
    private static final String driverJMS =
            "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    private static final String urlOR =
            "jdbc:oracle:thin:@localhost:1521:bd_chanteurs";
    private static final String userOR = "root";
    private static final String passwordOR = "";
    private static final String driverJOR =
            "oracle.jdbc.OracleDriver";

    public static String getSGBDR() {
        return SGBDR;
    }

    public static String getDriverJ() {
        switch (getSGBDR()) {
            case "MY":
                return driverJMY;
            case "MS":
                return driverJMS;
            case "OR":
                return driverJOR;
            default:
                return "";
        }
    }

    public static String getUrl() {
        switch (getSGBDR()) {
            case "MY":
                return urlMY;
            case "MS":
                return urlMS;
            case "OR":
                return urlOR;
            default:
                return "";
        }
    }

    public static String getUser() {
        switch (getSGBDR()) {
            case "MY":
                return userMY;
            case "MS":
                return userMS;
            case "OR":
                return userOR;
            default:
                return "";
        }
    }

    public static String getPassword() {
        switch (getSGBDR()) {
            case "MY":
                return passwordMY;
            case "MS":
                return passwordMS;
            case "OR":
                return passwordOR;
            default:
                return "";
        }
    }

    public static EtatSQL executeUpdateSQL(String requete) throws ClassNotFoundException {
        try {
            Class.forName(getDriverJ());
            Connection connexion = DriverManager.getConnection(getUrl(), getUser(), getPassword());
            Statement instruction = connexion.createStatement();
            instruction.executeUpdate(requete);
            return new EtatSQL("000", "table", "OK pour : " + requete);
        } catch (Exception e) {
            e.printStackTrace();
            return new EtatSQL("-100", "table", "KO pour : " + requete);
        }
    }

    public static ResultSet executeRequeteSQL(String requete) throws ClassNotFoundException {
        try {
            Class.forName(getDriverJ());
            Connection connexion = DriverManager.getConnection(getUrl(), getUser(), getPassword());
            Statement instruction = connexion.createStatement();
            return instruction.executeQuery(requete);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}