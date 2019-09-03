package laboratorio;

public class MyStrategy extends Strategy {
	
	public MyStrategy(LaboRobot robot) {
		super(robot);
	}
	
	public void run() {
		robot.setColors(LaboRobot.blue, LaboRobot.yellow, LaboRobot.blue, LaboRobot.yellow, LaboRobot.blue);
		//Ir a la pared izquierda
		robot.turnTo(270);
		while(robot.robotX > 20) {
			robot.ahead(robot.robotX - 20);
		}
		
		//Patrullar
		robot.turnTo(0);
		while(true) {
			if(robot.robotY < 100) robot.turnTo(0);
			if(robot.robotY > 500) robot.turnTo(180);
			robot.ahead(100);
		}
	}

	public void onScannedRobot() {
			robot.fire(1);
	}
	
	public void onHitByBullet() {
		
	}
	
	public void onHitWall(){
		
	}

}
