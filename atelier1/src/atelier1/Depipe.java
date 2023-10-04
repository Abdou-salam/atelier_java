package atelier1;

import java.util.Random;

public class Depipe  extends Des{

	private int bornmin  ;
	private static Random r = new Random();

	public Depipe() {
		super();
		
	}

	public Depipe(int nbFaces,int bornmin) {
		super(nbFaces);
		this.bornmin = bornmin;
		
	}

	public Depipe(String nom, int nbFaces,int bornmin) {
		super(nom, nbFaces);
		this.bornmin = bornmin;
		
		
	}

	public Depipe(String nom,int bornmin) {
		super(nom);
		this.bornmin = bornmin;
		
	}

	@Override
	public int lancer() {
		return r.nextInt((this.nbFaces - this.bornmin) + 1)+ this.bornmin + 1;
		
	}

	@Override
	public int lancer(int nbr) {
		int max = lancer();
		int tampon;
		for(int i=0;i<nbr;i++) {
			tampon = lancer();
			if (max < tampon){
				max = tampon;
			}
		}
		return max;
		
	}

	@Override
	public String toString() {
		
		return super.toString() + " borne minimal:"+bornmin;
	}
	
	
	
	

}
