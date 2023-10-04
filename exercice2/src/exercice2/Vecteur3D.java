package exercice2;

public class Vecteur3D {
	private double x,y,z;
	
	
	public Vecteur3D(double x,double y,double z) {
		this.x = x;
		this.y=  y;
		this.z = z;
		
	}
	public Vecteur3D() {
		x = 0;
		y = 0;
		z = 0;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public String toString() {
		
		return "< "+x+","+y+","+z+" >";
	}
	
	public double normeVect() {
		
		return Math.sqrt((x*x)+ (y*y)+ (z*z));
	}
	
	public double produitScal(Vecteur3D v) {
		return (this.x*v.x) +(this.y*v.y)+(this.z*v.z);
		
	}
	
	public static double produitScal(Vecteur3D v1,Vecteur3D v2 ) {
		return (v1.x*v2.x) +(v1.y*v2.y)+(v1.z*v2.z);
	}
	
	public Vecteur3D somme(Vecteur3D v){
		double x,y,z;
		x = this.x + v.x;
		y = this.y + v.y;
		z = this.z + v.z;
		return new Vecteur3D(x,y,z);
	}
	public static Vecteur3D somme(Vecteur3D v1,Vecteur3D v2) {
		double x ,y,z;
		x = v1.x + v2.x;
		y = v1.y + v2.y;
		z = v1.z + v2.z;
		
		return new Vecteur3D(x,y,z);
	}
	
	
}
