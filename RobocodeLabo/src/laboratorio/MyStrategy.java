package laboratorio;

import robocode.ScannedRobotEvent;

public class MyStrategy extends Strategy {
	

	private boolean patrullando = false;
	
	public MyStrategy(LaboRobot11 robot) {
		super(robot);
	}
	
	public void run() {
		robot.setColors(0, 0, 0, 0, 0);
		//Ir a la pared izquierda
		robot.turnTo(270);
		while(robot.robotX > 20) {
			robot.ahead(robot.robotX - 20);
		}
		
		//Patrullar
		robot.turnTo(0);
		robot.turnGunTo(90);
		while(true) {
			patrullando = true;
			if(robot.robotY < 100) {
				//BOOOKEE
				robot.setColors(LaboRobot.blue, LaboRobot.yellow, LaboRobot.blue, LaboRobot.yellow, LaboRobot.blue);
				robot.turnTo(0);
				robot.turnGunTo(90);
			}
			if(robot.robotY > 500) {
				//robot.setColors(LaboRobot.yellow, LaboRobot.blue, LaboRobot.yellow, LaboRobot.blue, LaboRobot.yellow);
				robot.turnTo(180);
				robot.turnGunTo(90);
			}
			robot.ahead(100);
		}
	}

	public void onScannedRobot() {
		if(patrullando) {			
			if (robot.scannedDistance < 100){
				robot.fire(3);
			}
			else {
				robot.fire(1);
			}
		}
	}
	
	public void onHitByBullet() {
		if(robot.hitByBulletAngle == 0) {
			robot.turnGunTo(0);
		}else if(robot.hitByBulletAngle == 180) {
			robot.turnGunTo(180);
		}
	}
	
	public void onHitWall(){
		
	}

}
