package decoration;

public class Prim extends CodimentDecorator {
	private Beverage beverage;
	
	public Prim(Beverage b) {
		this.beverage = b;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc()+", Prim";
	}

	@Override
	public int cost() {
		return beverage.cost() + 500;
	}
}
