package decoration;

public abstract class Beverage {
	String desc = "no name";
	
	public String getDesc() {
		return desc;
	}
	
	public abstract int cost();
	
	public String toString() {
		return getDesc()+" : "+cost(); 
	}	
}
