package decoration;

public class Shot extends CodimentDecorator {
	private Beverage beverage;
	
	public Shot(Beverage b) {
		this.beverage = b;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc()+", Shot";
	}

	@Override
	public int cost() {
		return beverage.cost() + 500;
	}
}
