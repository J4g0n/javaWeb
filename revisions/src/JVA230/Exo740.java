package JVA230;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by ipi on 04/01/2016.
 */
public class Exo740 {
    public static void main(String[] args) {
        try {
            // 1) Charger le pilote JDBC en mémoire
            // Class.forName("jdbc:mysql://localhost/bd_chanteurs");
            Class.forName("com.mysql.jdbc.Driver");
            // 2) Se connecter à la base de donnees
            Connection conDBChanteurs = DriverManager.getConnection("jdbc:mysql://localhost/bdtest", "root", "");
            // 3) Fabriquer la requete sql
            String reqTousLesChanteurs = "SELECT * FROM tennisman";
            // 4) Exécuter la requete sur la BD
            // 4.1) Fabriquer un objet de type instruction (statement)
            Statement statement = conDBChanteurs.createStatement();
            // 4.2) Récupérer le résultat renvoyé par la BD
            // si requete SELECT, je reçois les lignes de la BD
            // 		je prévois un objet de type ResultSet pour les récupérer
            // si requete INSERT ou UPDATe ou DELETE, je reçois un entier de la BD
            //		nombre de lignes insérées ou modifiées ou supprimées
            ResultSet lesLignesRecuperees = statement.executeQuery(reqTousLesChanteurs);
            // 4.3) Lire les résultats avec une boucle de lecture des lignes renvoyées par la BD
            // 		si requete select
            while (lesLignesRecuperees.next()) {
                // faire traitement adéquat pour chaque ligne de la table récupérée
                System.out.println("Tennisman nom: " + lesLignesRecuperees.getString(2));
                System.out.println("Tennisman prenom: " + lesLignesRecuperees.getString(3));
                System.out.println("Tennisman age: " + lesLignesRecuperees.getInt(4) + "\n");
            }
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("Problème connexion base de donnee " + e.getMessage());
        }
    }
}
