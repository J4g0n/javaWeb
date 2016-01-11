package depots;

import modeles.Message;
import modeles.Utilisateur;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by ipi on 08/01/2016.
 */
public class DepotMessages {

    private static List<Message> recupererMessages() {
        File fichier = new File("C:\\Users\\ipi\\Desktop\\Workspace_JavaWeb_Andreux_Simon\\prj_040_Servlet_Exercices\\res\\topics.txt");

        List<Message> listMessages = new ArrayList<Message>();

        try {
            BufferedReader curseurFichier = new BufferedReader(new FileReader(fichier));
            String [] infosFichier;
            String ligne;
            int id;
            String auteur;
            String contenu;
            String date;
            int parent;

            while ((ligne=curseurFichier.readLine()) != null) {
                infosFichier = ligne.trim().split(";");
                id = Integer.parseInt(infosFichier[0]);
                auteur = infosFichier[1];
                contenu = infosFichier[2];
                parent = Integer.parseInt(infosFichier[3].trim());
                date = infosFichier[4];

                listMessages.add(new Message(id, auteur, contenu, parent, date, true));
            }

            curseurFichier.close();
        } catch (FileNotFoundException e) {
            throw new Error("Impossible de lire le fichier : " + e.getMessage());
        } catch (IOException e) {
            throw new Error("Impossible de lire le fichier : " + e.getMessage());
        }

        return listMessages;
    }

    public static List<Message> recupererDiscussions() {
        ListIterator<Message> listMessage = recupererMessages().listIterator();
        List<Message> listTopics = new ArrayList<Message>();

        while (listMessage.hasNext()) {
            Message m = listMessage.next();
            if (!(m.parent > 0)) {
                listTopics.add(m);
            }
        }

        return listTopics;
    }

    public static List<Message> recupererTopic(int topicId) {
        ListIterator<Message> listMessage = recupererMessages().listIterator();
        List<Message> listTopics = new ArrayList<Message>();

        while (listMessage.hasNext()) {
            Message m = listMessage.next();
            if (m.parent == topicId) {
                listTopics.add(m);
            }
        }

        return listTopics;
    }

    public static void ajouterMessage(String auteur, String contenu, int parent) {
        File fichier = new File("C:\\Users\\ipi\\Desktop\\Workspace_JavaWeb_Andreux_Simon\\prj_040_Servlet_Exercices\\res\\topics.txt");

        try {
            BufferedWriter curseurFichier = new BufferedWriter(new FileWriter(fichier, true));
            int id = (int) (Math.random() * 10000); // TODO: do better (i'm just doing this in order to test

            String date = new Date().toLocaleString();
            curseurFichier.write(id + "; " + auteur + "; " + contenu + "; " + parent + "; " + date + ";" + "oui" + ";\n");

            curseurFichier.close();
        } catch (FileNotFoundException e) {
            throw new Error("Impossible de lire le fichier : " + e.getMessage());
        } catch (IOException e) {
            throw new Error("Impossible de lire le fichier : " + e.getMessage());
        }
    }
}
