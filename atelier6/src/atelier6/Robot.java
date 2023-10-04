package atelier6;

public class Robot {
	private  String ref;
	private String nom;
	private int x,y;
	private int orient;
	private int nbr;
	private static int compteur = 0;
	
	
	
	public Robot(String nom, int x, int y, int orient) {
		this.ref = "ROB"+ compteur++ ;
		this.nom = nom;
		this.x = x;
		this.y = y;
		this.orient = orient;
		
	}
	public Robot(String nom) {
		this.nom = nom;
		x = 0;
		y = 0;
		orient = 1;
		ref = "ROB"+ compteur++ ;
	}
	
	public void setOrient(int val) {
		orient =val;
		
	}
	
	public void avancer(int orient) {
		if (orient == 1) {
			y += 1;
		}else if (orient == 2) {
			y -= 1;
		}else if (orient == 3) {
			x += 1;
		}else {
			x -= 1;
		}
	}
	
	public String afficheToi() {
		
		return "nom:"+nom+" ,ref:"+ref+" x:"+x+" ,y:"+y+" ,orientation:"+orient;
				
		
	}
	public String toString() {
		return "nom:"+nom+" ,ref:"+ref+" x:"+x+" ,y:"+y+" ,orientation:"+orient;
	}


	
}
