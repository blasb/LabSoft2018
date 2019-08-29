package laboratorio;

public abstract class Strategy {
	
	protected LaboRobot robot;
	
	public Strategy(LaboRobot robot) {
		this.robot = robot;
	}
	
	abstract public void run();
	
	public abstract void onScannedRobot();
	
	public abstract void onHitByBullet();
	
	public abstract void onHitWall();
	
}
