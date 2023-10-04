package exercice2;

public class Teste {

	public static void main(String[] args) {
		Vecteur3D v1 = new Vecteur3D(3.0,2.0,5.0);
		Vecteur3D v2 = new Vecteur3D(1.0,2.0,3.0);
		Vecteur3D v3 = v1.somme(v2);
		double v4 = v1.produitScal(v2);
		
		
		System.out.println("V1 = "+v1);
		System.out.println("V2 = "+v2);
		System.out.println();
		
		//Norme de vecteur
		System.out.println("Norme de V1 = "+v1.normeVect());
		System.out.println("Norme de V2 = "+v2.normeVect());
		System.out.println();
		
		//somme 
		System.out.println("V1 + V2 ="+v3);
		System.out.println("la méthode static : V1 + V2 = "+Vecteur3D.somme(v1, v2));
		System.out.println();
		
		//produit scalaire
		System.out.println("V1.V2 = "+v4);
		System.out.println("la méthode static : V1.V2 = "+Vecteur3D.produitScal(v1, v2));
		System.out.println();
		
		

	}

}
