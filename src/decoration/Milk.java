package decoration;

public class Milk extends CodimentDecorator {
	private Beverage beverage;
	
	public Milk(Beverage b) {
		this.beverage = b;
	}
	
	@Override
	public String getDesc() {
		return beverage.getDesc()+", Milk";
	}

	@Override
	public int cost() {
		return beverage.cost() + 1000;
	}
}
