package observer;

public class Meeting {

	public static void main(String[] args) {
		Singer mc = new Singer();
		
		SingerFan fan1 = new SingerFan("ÆÒ1");
		SingerFan fan2 = new SingerFan("ÆÒ2");
		
		mc.addFan(fan1);
		mc.addFan(fan2);
		
		mc.speak();
		
		mc.deleteFan(fan1);
		
		SingerFan fan3 = new SingerFan("ÆÒ3");
		mc.addFan(fan3);
		
		mc.speak();
	}
}
