package exercice1;

import java.util.GregorianCalendar;

public class Manager extends Personne{
	private float salaire;
	private GregorianCalendar dateEmbauche;

	private Manager(String nom,String prenom,GregorianCalendar dateNaissance,Adresse adresse,float salaire,GregorianCalendar dateEmbauche) {
		super(nom,prenom,dateNaissance,adresse);
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
	}
	
	private Manager (String nom,String prenom,int j,int m,int a,int numero,String rue,String code_postal,String ville,float salaire,GregorianCalendar dateEmbauche) {
		this(nom,prenom,new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville),salaire,dateEmbauche);
	}
	

	

}
