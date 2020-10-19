package factory;

public class FactroyMain {
	public static void main(String[] args) {
		
		RobotFactory rf = new HeavyRobotFactory();
		Robot r = rf.createRobot("heavy");
		Robot r2 = rf.createRobot("light");
		
		System.out.println("이 로봇의 타입은 "+r.getName()+" 타입 입니다.");
		System.out.println("이 로봇의 타입은 "+r2.getName()+" 타입 입니다.");
		
		RobotFactory mrf = new ModifiedHeavyRobotFactory();
		Robot r3 = mrf.createRobot("factory.HeavyRobot");
		Robot r4 = mrf.createRobot("factory.LightRobot");
		
		System.out.println("이 로봇의 타입은 "+r3.getName()+" 타입 입니다.");
		System.out.println("이 로봇의 타입은 "+r4.getName()+" 타입 입니다.");
	}
}
