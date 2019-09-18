package entrega2;
import robocode.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html


public class LaboRobot11 extends JuniorRobot
{
	
	private Strategy strategy = CornerStrategist.singleton().getStrategy(this);
	
	@Override	
	public void run() {
		while(true) {
			strategy = CornerStrategist.singleton().getStrategy(this);
			strategy.run(this);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		strategy.onScannedRobot(this);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		strategy.onHitByBullet(this);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		strategy.onHitWall(this);
	}	
}