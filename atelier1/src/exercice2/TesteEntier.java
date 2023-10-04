package exercice2;

public class TesteEntier {

	public static void main(String[] args) {
		Entier e = new Entier(5);
		Entier e1 = new Entier(10,5,30);
		Entier e2 = new Entier();
		
		
		
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		e1.incrementer();
		System.out.println("teste incrémentation:"+e1);
		e.incrementer(2);
		System.out.println("teste incrémentation:"+e);
		

	}

}
