package modeles;

/**
 * Created by ipi on 08/01/2016.
 */
public class Message {
    public int id;
    public String auteur;
    public String contenu;
    public int parent = -1;
    public String date;
    public boolean accepte;

    public Message(int id, String auteur, String contenu, int parent, String date, boolean accepte) {
        this.id = id;
        this.auteur = auteur;
        this.contenu = contenu;
        this.parent = parent;
        this.date = date;
        this.accepte = accepte;
    }
}
