package laboratorio;

public class MyStrategy extends Strategy {

	public MyStrategy(LaboRobot robot) {
		super(robot);
	}
	
	public void run() {
		robot.setColors(111111, 111111, 111111, 111111, 111111);
		robot.turnTo(270); 
		while(robot.robotX > 20) {
			robot.ahead(robot.robotX - 20);
		}
		if(robot.robotY < 100) robot.turnTo(180) else robot.turnTo(0);
		while(true) {
			if(robot.robotY > 500) robot.turnTo(0);
			if(robot.robotY < 100) robot.turnTo(180);
			robot.ahead(100);
			robot.ahead(100);
		}*
	}
	
	public void onScannedRobot() {
		robot.fire(1);
	}
	
	public void onHitByBullet() {
		
	}
	
	public void onHitWall(){
		
	}

}
