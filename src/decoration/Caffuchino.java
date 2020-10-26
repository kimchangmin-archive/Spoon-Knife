package decoration;

public class Caffuchino extends Beverage {
	public Caffuchino() {
		desc = "Caffuchino";
	}
	
	@Override
	public int cost() {
		return 3000;
	}
}
