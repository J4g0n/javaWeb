package JVA230;

import java.sql.*;
/*	=============================================
 * 	Classe parametrage acc�s � une BD relationnelle
 * 	=============================================
 * 	Auteur		:	Choua�b LAGHLAM
 * 	Date		:	Avril 2006
 * 	=============================================
 */
public class ParametresBD {
    //	propri�t�	:	type SGBDR : Mysql, MS SQL Server, Oracle,..
    // changer ci-dessous l�attribut SGBDR en valeur MY ou MS ou OR pour sp�cialiser
    // l�acc�s � MySQL ou � Microsoft SQL Server ou � Oracle
    private static final String SGBDR="MS";
    /*
     * 		========================
     * 		param�tres Serveur Mysql
     * 		========================
     */
    // 		constante 	:	nom de la source de donn�es :
    //				:	Type d�acc�s + nom serveur + nom de la BD
    //private static final String urlMY = "jdbc:mysql://localhost/Rungis";
    private static final String urlMY = "jdbc:mysql://localhost/bdtest";
    //		constante	:	login
    private static final String userMY = "root";
    //		constante	:	mot de passe
    private static final String passwordMY = "";
    //		constante	:	driver jdbc
    private static final String driverJMY = "com.mysql.jdbc.Driver";
    /*
     * 		========================
     * 		param�tres Serveur SQLServer 2012 et plus
     * 		========================
     */
    // 		constante 	:	nom de la source de donn�es
    private static final String urlMS =
            "jdbc:sqlserver://S23POSTE19;database=bdChanteursSS";
    //		constante	:	login
    private static final String userMS = "sa";
    //		constante	:	mot de passe
    private static final String passwordMS = "batterie";
    //		constante	:	driver jdbc
    private static final String driverJMS =
            "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    /*
     * 		========================
     * 		param�tres Serveur Oracle 11g et plus
     * 		========================
     */
    //		constante 	:	nom de la source de donn�es
    private static final String urlOR =
            "jdbc:oracle:thin:@localhost:1521:bd_chanteurs";
    //		constante	:	login
    private static final String userOR = "root";
    //		constante	:	mot de passe
    private static final String passwordOR = "";
    //		constante	:	driver jdbc
    private static final String driverJOR =
            "oracle.jdbc.OracleDriver";
    /*
     * 		==============================
     *  	getteurs (pas de setteurs ici)
     *  	==============================
     */
    public static String getSGBDR() {
        return SGBDR;
    }
    public static String getDriverJ() {
        switch(getSGBDR())
        {
            case	"MY":			// Mysql
                return driverJMY;
            case	"MS":
                return driverJMS;		// MS SQL Server
            case	"OR":
                return driverJOR;		// Oracle
            default 	:
                return "";
        }
    }
    public static String getUrl() {
        switch(getSGBDR())
        {
            case	"MY":			// Mysql
                return urlMY;
            case	"MS":
                return urlMS;		// MS SQL Server
            case	"OR":
                return urlOR;		// Oracle
            default 	:
                return "";
        }
    }
    public static String getUser() {
        switch(getSGBDR())
        {
            case	"MY":			// Mysql
                return userMY;
            case	"MS":
                return userMS;		// MS SQL Server
            case	"OR":
                return userOR;		// Oracle
            default 	:
                return "";
        }
    }
    public static String getPassword() {
        switch(getSGBDR())
        {
            case	"MY":			// Mysql
                return passwordMY;
            case	"MS":
                return passwordMS;		// MS SQL Server
            case	"OR":
                return passwordOR;		// Oracle
            default 	:
                return "";
        }
    }
    //		m�thode	:	pour ins�rer ou modifier ou supprimer
    //		dans la BD
    public static EtatSQL executeUpdateSQL(String requete) throws ClassNotFoundException{
        try {
            Class.forName(getDriverJ());
            Connection connexion = DriverManager.getConnection(getUrl(),getUser(),getPassword());
            Statement instruction = connexion.createStatement();
            int resultatTemp = instruction.executeUpdate(requete);
            EtatSQL resultatSQL=new EtatSQL("000","table","OK pour : "+requete);
            return resultatSQL;
        }
        catch (Exception e)
        {
            EtatSQL resultatSQL=new EtatSQL("-100","table","KO pour : "+requete);
            return resultatSQL;
        }
    }
    //		m�thode		:	pour lire BD
    public static ResultSet executeRequeteSQL(String requete) throws ClassNotFoundException{
        try {
            Class.forName(getDriverJ());
            ResultSet resultat = null;
            Connection connexion = DriverManager.getConnection(getUrl()
                    ,getUser(),getPassword());
            Statement instruction = connexion.createStatement();
            ResultSet resultatTemp = instruction.executeQuery(requete);
            resultat = resultatTemp;
            return resultat;
        }
        catch (Exception e) {
            return null;
        }
    }	// fin m�thode
}	// fin classe