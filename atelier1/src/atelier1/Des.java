package atelier1;

import java.util.*;

public class Des {
	private String nom;
	protected int nbFaces;
	private static Random r = new Random();
	private static int num = 1;
	//question 1
	public int getNbFaces() {
		return nbFaces;
	}
	public void setNbFaces(int nbFaces) {
		 this.nbFaces = nbFaces;
	 }
	public String getNom() {
		  return nom;
	  }
	
	 
	  
	// constructeur
	public Des() {
		this.nbFaces = 6;
		this.nom = "De";
	}
	
	public Des(int nbFaces) {
		//int nb = random.nextInt((120 - 3) + 1) + 3;
		if  (nbFaces >= 3 && nbFaces< 120){
			this.nbFaces = nbFaces ;
			this.nom = "De <<n°"+num+">>";
			num++;
		}else {
			System.out.println("erreur");
		}
	}
		
	public Des(String nom) {
		this.nom =nom;
	}
	
	
	
	public int lancer() {
		return r.nextInt((this.nbFaces - 3) + 1)+ 3;
	}
	
	//question 4 contrainte sur le nom
	
	public Des(String nom,int nbFaces) {
		//int nb = random.nextInt((120 - 3) + 1) + 3;
		if  (nbFaces >= 3 && nbFaces< 120 && nom!= null){
			this.nbFaces = nbFaces ;
			this.nom = "De <<n°"+num+">>";
			num++;
		}else {
			System.out.println("erreur");
			
			
		}
		
		
	}
	//question 5
	public int lancer(int nbr) {
		int max = r.nextInt((this.nbFaces - 3) + 1)+ 3;
		int tampon;
		for(int i=0;i<nbr;i++) {
			tampon = lancer();
			if (max < tampon){
				max = tampon;
			}
		}
		return max;
	}
	
	
	
	public String toString() {
		return "Nom:"+nom+", Nombre de face:"+nbFaces;
	}
	public boolean equals(Object o) {
		boolean res = false;
		if (o == null) {
			res = false;
		}else{
			if (o instanceof Des) {
				Des d = (Des) o;
				res = this.nom.equals(d.nom) && this.nbFaces == d.nbFaces;
				}
			}
		return res;
	}
		
}



