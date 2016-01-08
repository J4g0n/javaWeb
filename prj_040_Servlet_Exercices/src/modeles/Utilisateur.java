package modeles;

/**
 * Created by ipi on 08/01/2016.
 */
public class Utilisateur {
    public String login = "";
    public String password = "";

    public Utilisateur(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String serialize() {
        return login + "; " + password + ";";
    }
}
