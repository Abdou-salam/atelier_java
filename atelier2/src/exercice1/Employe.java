package exercice1;
import java.util.*;

public class Employe extends Personne{
	private  double salaire;
	private GregorianCalendar dateEmbauche;
	
	
	protected Employe(String nom,String prenom,GregorianCalendar dateNaissance,Adresse adresse,double salaire,GregorianCalendar dateEmbauche) {
		super(nom,prenom,dateNaissance,adresse);
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
	}
	
	private Employe (String nom,String prenom,int j,int m,int a,int numero,String rue,String code_postal,String ville,double salaire,GregorianCalendar dateEmbauche) {
		this(nom,prenom,new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville),salaire,dateEmbauche);
	}
	
	public GregorianCalendar getDateEmbauche() {
		return dateEmbauche;
	}
	
	public Employe createEmploye() {
		GregorianCalendar dateAujourdHui = new GregorianCalendar();
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
	
	public int calculAnnuite() {
		GregorianCalendar dateAujourdHui = new GregorianCalendar();
		return dateAujourdHui.get(dateAujourdHui.YEAR) -  this.getDateEmbauche().get(this.getDateEmbauche().YEAR);
	}
	
	

}
