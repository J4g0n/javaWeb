package depots;

import modeles.Utilisateur;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by ipi on 08/01/2016.
 */
public class DepotUtilisateurs {
    //private static List<Utilisateur> listUtilisateur = new ArrayList<Utilisateur>();

    private static List<Utilisateur> recupererUtilisateurs() {
        File fichier = new File("C:\\Users\\ipi\\Desktop\\Workspace_JavaWeb_Andreux_Simon\\prj_040_Servlet_Exercices\\res\\utilisateurs.txt");

        List<Utilisateur> listUtilisateur = new ArrayList<Utilisateur>();

        try {
            BufferedReader curseurFichier = new BufferedReader(new FileReader(fichier));
            String [] infosFichier;
            String ligne;
            String login;
            String password;

            while ((ligne=curseurFichier.readLine()) != null) {
                infosFichier = ligne.trim().split(";");
                login = infosFichier[0];
                password = infosFichier[1];

                listUtilisateur.add(new Utilisateur(login, password));
            }

            curseurFichier.close();
        } catch (FileNotFoundException e) {
            throw new Error("Impossible de lire le fichier : " + e.getMessage());
        } catch (IOException e) {
            throw new Error("Impossible de lire le fichier : " + e.getMessage());
        }

        return listUtilisateur;
    }

    public static void creerUtilisateur(String login, String password) {
        File fichier = new File("C:\\Users\\ipi\\Desktop\\Workspace_JavaWeb_Andreux_Simon\\prj_040_Servlet_Exercices\\res\\utilisateurs.txt");

        try {
            BufferedWriter curseurFichier = new BufferedWriter(new FileWriter(fichier, true));

            curseurFichier.write(login + "; " + password + ";\n");

            curseurFichier.close();
        } catch (FileNotFoundException e) {
            throw new Error("Impossible de lire le fichier : " + e.getMessage());
        } catch (IOException e) {
            throw new Error("Impossible de lire le fichier : " + e.getMessage());
        }
    }

    public static boolean existeUtilisateur(String login, String password) {
        ListIterator<Utilisateur> listUtilisateur = recupererUtilisateurs().listIterator();
        boolean returnValue = false;

        while (listUtilisateur.hasNext()) {
            Utilisateur u = listUtilisateur.next();
            returnValue = returnValue || (u.login.trim().equals(login) && u.password.trim().equals(password));
        }

        return returnValue;
    }
}
