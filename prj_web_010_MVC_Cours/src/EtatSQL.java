//		================================
//		Auteur		:	Choua�b LAGHLAM
//		Date		:	Janvier 2014
//		================================
//		Projet GSB
//		Classe qui permet � une m�thode acc�dant
//		� la BD de renvoyer des infos sur 
//		l'ex�cution d'une instruction SQL
//		================================
public class EtatSQL {
//	propri�t�s
	private String codeEtat;
	private String tableSQL;
	private String libelleEtat;
	// constructeur
	public EtatSQL(String codeEtat, String tableSQL, String libelleEtat) {
		super();
		this.codeEtat = codeEtat;
		this.tableSQL = tableSQL;
		this.libelleEtat = libelleEtat;
	// getteurs
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
