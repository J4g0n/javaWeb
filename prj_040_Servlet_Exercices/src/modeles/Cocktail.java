package modeles;

/**
 * Created by ipi on 12/01/2016.
 */
public class Cocktail {
    String nom;
    String alcool;
    int proportionAlcool;
    String soda;
    String jus;
    int proportionJus;
    String photo;

    public Cocktail(String nom, String alcool, int proportionAlcool, String jus, String soda, int proportionJus, String photo) {
        this.nom = nom;
        this.alcool = alcool;
        this.proportionAlcool = proportionAlcool;
        this.jus = jus;
        this.soda = soda;
        this.photo = photo;
        this.proportionJus = proportionJus;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAlcool() {
        return alcool;
    }

    public void setAlcool(String alcool) {
        this.alcool = alcool;
    }

    public int getProportionAlcool() {
        return proportionAlcool;
    }

    public void setProportionAlcool(int proportionAlcool) {
        this.proportionAlcool = proportionAlcool;
    }

    public String getSoda() {
        return soda;
    }

    public void setSoda(String soda) {
        this.soda = soda;
    }

    public String getJus() {
        return jus;
    }

    public void setJus(String jus) {
        this.jus = jus;
    }

    public int getProportionJus() {
        return proportionJus;
    }

    public void setProportionJus(int proportionJus) {
        this.proportionJus = proportionJus;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
