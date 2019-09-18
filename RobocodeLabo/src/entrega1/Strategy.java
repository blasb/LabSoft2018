package entrega1;

public abstract class Strategy {
	
	protected LaboRobot11 robot;
	
	public Strategy(LaboRobot11 robot) {
		this.robot = robot;
	}
	
	abstract public void run();
	
	public abstract void onScannedRobot();
	
	public abstract void onHitByBullet();
	
	public abstract void onHitWall();
	
}
