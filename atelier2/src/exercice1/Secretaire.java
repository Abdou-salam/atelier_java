package exercice1;
import java.util.*;

public class Secretaire extends Personne{
	private float salaire;
	private GregorianCalendar dateEmbauche;
	
	public Secretaire (String nom,String prenom,GregorianCalendar dateNaissance,Adresse adresse,float salaire,GregorianCalendar dateEmbauche) {
		super(nom,prenom,dateNaissance,adresse);
		this.salaire =salaire;
		this.dateEmbauche = dateEmbauche;
		
	}
	
}
