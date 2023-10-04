package exercice2;

public class Entier {
	private int val  ;
	public final int bMin ;//= Integer.MIN_VALUE;
	public final int bMax; //=Integer.MAX_VALUE;
	
	
	public Entier(int val,int bMin,int bMax) {
		this.bMax = bMax;
		this.bMin=bMin;
		if (val >= bMin && val<= bMax) {
		this.val = val;
		}else {
			this.val = 0;
		}
	}
	public Entier(int val) {
		bMin = Integer.MIN_VALUE;
		bMax =Integer.MAX_VALUE;
		if (val >= bMin && val<= bMax) {
		this.val = val;
		}else {
			this.val = 0;
		}
	}
	
	public Entier() {
		bMin = Integer.MIN_VALUE;
		bMax =Integer.MAX_VALUE;
		val=0 ;
	}
	
	
	
	public void setVal(int val) {
		this.val = val;
	}
	public void incrementer() {
		
		int tmp =this.val + 1;
		if (tmp>= bMin && tmp<= bMax) {
			this.val++;
		}
		
	}
	
	public void incrementer(int n) {
		int tmp =this.val + 1;
		if (tmp>= bMin && tmp<= bMax) {
			this.val++;
		}
	
	}

	@Override
	public String toString() {
		return "valeur entier:"+val+" ,borne min:"+bMin+" ,borne max:"+bMax;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean res = false;
		if (o == null) {
			res = false;
		}else {
			
			if (o instanceof Entier) {
				Entier val_comp = (Entier) o;
				res = (val_comp.val == this.val);
				
			}
		}
		return res;
	}
	
	
	

}
