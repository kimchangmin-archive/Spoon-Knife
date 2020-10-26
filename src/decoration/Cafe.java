package decoration;

public class Cafe {
	public static void main(String[] args) {
		Beverage b1 = new Latte();
		System.out.println(b1.toString());
		
		b1 = new Prim(b1);
		b1 = new Shot(b1);
		System.out.println(b1.toString());
		
		Beverage b2 = new Caffuchino();
		System.out.println(b2.toString());
		
		b2 = new Prim(b2);
		b2 = new Shot(b2);
		b2 = new Milk(b2);
		System.out.println(b2.toString());

	}
}
