package exercice1;

import java.util.*;



public class Personne{
    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    private final GregorianCalendar dateNaissance;
    private Adresse adresse=ADRESSE_INCONNUE;
    private static int nbrPers = 0;
	
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
		nbrPers++;
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'année de naissance
	 * @param numero le n° de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
	}

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le prénom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * @param retourne l'adresse	 
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"PrŽnom : "+prenom+"\n"+
		"NŽ(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
		"-"+dateNaissance.get(Calendar.MONTH)+
		"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}
	
	// Question 2 et 3
	
	public boolean plusAgee(Object o) {
		boolean res = false;
		
		if (o != null && o instanceof Personne ) {
			Personne p = (Personne) o ;
			if ( this.dateNaissance.before( p.dateNaissance) == true) {
				res = true;
			}
		}else {
			res = false;
		}
		return res;
	}
	
	// Question 4
	
	public boolean equals (Object o) {
		boolean res = false;
		if (o != null && o instanceof Personne ) {
			Personne p = (Personne)o;
			if (this.prenom.equals(p.prenom) && this.nom.equals(p.nom) && this.dateNaissance.equals(p.dateNaissance)) {
				res = true;
			}	
		}else {
			res = false;
			
		}
		return res;
	}
	
	public String afficher() {
		return "Nom:"+nom+"\nPrenom:"+prenom+"\nDate de Naissance:"
				+dateNaissance.get(Calendar.YEAR)+"/"+dateNaissance.get(Calendar.MONTH)+"/"+dateNaissance.get(Calendar.DAY_OF_MONTH)+"\nAdresse:"+adresse;
	}
	
	
	
}

    
   
   