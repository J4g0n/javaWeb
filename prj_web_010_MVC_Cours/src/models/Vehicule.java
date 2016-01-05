package models;

/**
 * Created by ipi on 05/01/2016.
 */
public class Vehicule {
    private String marque;
    private String modele;
    private int numeroSerie;

    public Vehicule(String m, String mo, int num) {
        super();
        marque = m;
        modele = mo;
        numeroSerie = num;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

}
