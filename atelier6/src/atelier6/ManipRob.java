package atelier6;

public class ManipRob {

	public static void main(String[] args) {
		Robot r1 = new Robot("Toto",10,20,2);
		Robot r2 = new Robot("Titi");
		Robot rob = new Robot("robot");
		
		System.out.println(r1.afficheToi());
		System.out.println(r2.afficheToi());
		System.out.println(rob);
		
		System.out.println(r1);
		System.out.println(r2);
		

	}

}
