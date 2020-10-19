package factory;

public class HeavyRobotFactory extends RobotFactory {

	@Override
	Robot createRobot(String name) {
		switch(name) {
			case "heavy": return new HeavyRobot();
			case "light": return new LightRobot();
		}
		return null;
	}
}
