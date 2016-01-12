package utils;

public class EtatSQL {
    private String codeEtat;
    private String tableSQL;
    private String libelleEtat;

    public EtatSQL(String codeEtat, String tableSQL, String libelleEtat) {
        super();
        this.codeEtat = codeEtat;
        this.tableSQL = tableSQL;
        this.libelleEtat = libelleEtat;
    }

    public  String getCodeEtat() {
        return codeEtat;
    }

    public String getTableSQL() {
        return tableSQL;
    }

    public String getLibelleEtat() {
        return libelleEtat;
    }
}