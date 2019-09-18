package entrega2;

import robocode.JuniorRobot;

public class WallStrategist extends Strategist{
	
	private static WallStrategist strategist;

	public static Strategist singleton() {
		return (strategist == null) ?  new WallStrategist() : strategist;
	}
	
	@Override
	public Strategy getStrategy(JuniorRobot robot) {
		return (robot.robotX <= 20) ? this.patrol() : this.position();
	}
	
	private Strategy position() {
		return new Strategy(){
			
			public void run(JuniorRobot robot) {
				robot.turnTo(270);
				robot.ahead(robot.robotX - 20);
				robot.turnTo(0);
			}
			
			public void onScannedRobot(JuniorRobot robot) {}
			
			public void onHitByBullet(JuniorRobot robot) {}
			
			public void onHitWall(JuniorRobot robot) {}
		};
	}
	
	private Strategy patrol() {
		return new Strategy(){
			
			public void run(JuniorRobot robot) {
				if(robot.robotY < 100) {
					robot.turnTo(0);
				}
				if(robot.robotY > 500) {
					robot.turnTo(180);
				}
				robot.turnGunTo(90);
				robot.ahead(100);
			}
			
			public void onScannedRobot(JuniorRobot robot) {
				if (robot.scannedDistance < 100){
					robot.fire(3);
				}
				else {
					robot.fire(1);
				}
			}
			
			public void onHitByBullet(JuniorRobot robot) {
				if(robot.hitByBulletAngle == 0) {
					robot.turnGunTo(0);
				}else if(robot.hitByBulletAngle == 180) {
					robot.turnGunTo(180);
				}
			}
			
			public void onHitWall(JuniorRobot robot) {}
		};
	}

}
