package exercice1;
import java.util.*;

public class Employe extends Personne{
	private  float salaire;
	private GregorianCalendar dateEmbauche;
	private GregorianCalendar dateAujourdHui = new GregorianCalendar();
	
	private Employe(String nom,String prenom,GregorianCalendar dateNaissance,Adresse adresse,float salaire,GregorianCalendar dateEmbauche) {
		super(nom,prenom,dateNaissance,adresse);
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
	}
	
	private Employe (String nom,String prenom,int j,int m,int a,int numero,String rue,String code_postal,String ville,float salaire,GregorianCalendar dateEmbauche) {
		this(nom,prenom,new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville),salaire,dateEmbauche);
	}
	
	public GregorianCalendar getDateEmbauche() {
		return dateEmbauche;
	}
	
	public Employe createEmploye() {
		int age = (dateAujourdHui.get(dateAujourdHui.YEAR) - getDateNaissance().get(getDateNaissance().YEAR));
		Employe e;
		if (age > 16 && age < 65) {
			e = new Employe(getNom(),getPrenom(),getDateNaissance(),getAdresse(),this.salaire,this.dateEmbauche);
		}else {
			e = null;
		}
		return e;
	}
	
	public void augmenterLeSalaire (int pourcentage) {
		if (pourcentage > 0) {
			salaire = salaire * pourcentage / 100;
		}
	}
	
	public int calculAnnuite(Employe e) {
		return dateAujourdHui.get(dateAujourdHui.YEAR) -  e.getDateEmbauche().get(e.getDateEmbauche().YEAR);
	}
	
	

}
