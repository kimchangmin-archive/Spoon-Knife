package design;

public class printer {
	private printer() {}
	
	public static printer getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	private static class LazyHolder{
		private static final printer INSTANCE = new printer();
	}
}
