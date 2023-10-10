package exercice1;
import java.util.*;
import exercice1.Adresse;

public class TesteQuestion1 {

	public static void main(String[] args) {
		Personne p1 = new Personne("Diallo", "Abdou Salam", new GregorianCalendar(1954,07,12),null);
		Personne p2 = new Personne("Mendy", "Pierre", new GregorianCalendar(2004,10,12),null);
		Personne p3 = new Personne("Lovichi", "Dorian",03,13,2004,11,"Avenue Xavier", "20250","Corte");
		Personne p4 = new Personne("Guetti", "Ahmed", new GregorianCalendar(2004,10,12),null);
		Personne p5 = new Personne("Lovichi", "Dorian",03,13,2004,11,"Avenue Xavier", "20250","Corte");

		
		System.out.println(p1.afficher());
		System.out.println(p2.afficher());
		System.out.println("Comparaison entre P1 et P2:"+p1.plusAgee(p2));
		System.out.println(p3.afficher());
		System.out.println(p3);
		System.out.println("teste d'égalité entre P1 et P3 :"+ p1.equals(p3));
		System.out.println("teste d'égalité entre P2 et P4 :"+ p2.equals(p4));
		System.out.println("teste d'égalité entre P3 et P4 :"+ p3.equals(p5));

		

	}

}
