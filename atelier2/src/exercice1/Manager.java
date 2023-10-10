package exercice1;

import java.util.GregorianCalendar;

public class Manager extends Employe{
	private double salaire;
	private GregorianCalendar dateEmbauche;
	private Secretaire secretaireManager;

	private Manager(String nom,String prenom,GregorianCalendar dateNaissance,Adresse adresse,float salaire,GregorianCalendar dateEmbauche,Secretaire secretaireManager ) {
		super(nom,prenom,dateNaissance,adresse,salaire,dateEmbauche);
		this .secretaireManager = secretaireManager;
	}
	
	private Manager (String nom,String prenom,int j,int m,int a,int numero,String rue,String code_postal,String ville,float salaire,GregorianCalendar dateEmbauche,Secretaire secretaireManager) {
		this(nom,prenom,new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville),salaire,dateEmbauche,secretaireManager);
	}
	
	public void augmenterLeSalaire (int pourcentage) {
		
		/*GregorianCalendar dateAujourdHui = new GregorianCalendar();
		int anciennete = dateAujourdHui.get(dateAujourdHui.YEAR) -  dateEmbauche.get(dateEmbauche.YEAR);
		if (pourcentage > 0) {
			salaire = ( salaire * pourcentage / 100 + anciennete * 0.5/100);
		}*/
		
		int anciennete = super.calculAnnuite();
		if (pourcentage > 0) {
			salaire = ( salaire * pourcentage / 100 + anciennete * 0.5/100);
		}
	}
	
	public void setSecretaireManager(Secretaire secretaireManager) {
		this.secretaireManager =secretaireManager;
	}
	

}
