package atelier1;

public class TestDe {

	public static void main(String[] args) {
		Des d = new Des();
		Des d1 = new Des("teste",18);
		Des d2 = new Des(18);
		Des d3 = new Depipe(6,2);
		Des d4 = new Des_memoire(23);
		
		
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("Dé pipé:"+d3);
		System.out.println("Dés à effet mémoire:"+d4);

		
		
		System.out.println("la sortie de la  lancé est:"+d.lancer());
		System.out.println("la sortie de la lancé du dé pipé est:"+d3.lancer());
		System.out.println(d1.equals(d1));
		System.out.println(d1.equals(d2));
		System.out.println("la sortie de la lancé du dés en mémoire est:"+d4.lancer(5));
		
		
		

	}

}
