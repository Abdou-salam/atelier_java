package atelier1;

public class Des_memoire extends Des {

	public Des_memoire() {
		super();
		
	}

	public Des_memoire(int nbFaces) {
		super(nbFaces);
	
	}

	public Des_memoire(String nom, int nbFaces) {
		super(nom, nbFaces);
		
	}

	public Des_memoire(String nom) {
		super(nom);
		
	}

	@Override
	public int lancer(int val_prop) {
		int compare = super.lancer();
		int compteur = 0;
		int res;
		if (compare == val_prop && compteur!=2 ) {
			res = compare;
			compteur++;
		}else if (compteur == 2) {
			compteur = 0;
			res = compare;
		}else {
			res = compare;
		}
		return res;
	}

	
	
	

	

}
