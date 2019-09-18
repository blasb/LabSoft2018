package entrega2;

import robocode.JuniorRobot;

public interface Strategy {
	
	public abstract void run(JuniorRobot robot);
	
	public abstract void onScannedRobot(JuniorRobot robot);
	
	public abstract void onHitByBullet(JuniorRobot robot);
	
	public abstract void onHitWall(JuniorRobot robot);
	
}
