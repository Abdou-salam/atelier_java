package exercice2;
import java.util.*;

public class EntierFou extends Entier{

	private int niveauDeFolie;
	private Random r = new Random();
	
	public EntierFou(int val,int bMin,int bMax,int niveauDeFolie) {
		super(val,bMin,bMax);
		this.niveauDeFolie = niveauDeFolie;
		
	}
	
	public EntierFou() {
		super();
		niveauDeFolie = 0;
	}
	
	@Override
	
	public void incrementer() {
		super.incrementer(r.nextInt(niveauDeFolie + 1));
	}
	
	
	
	
	
}
