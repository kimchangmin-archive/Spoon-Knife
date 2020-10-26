package decoration;

public class Latte extends Beverage {
	public Latte() {
		desc = "Latte";
	}
	
	@Override
	public int cost() {
		return 3500;
	}
}
