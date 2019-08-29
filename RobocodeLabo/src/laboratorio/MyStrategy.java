package laboratorio;

public class MyStrategy extends Strategy {

	public MyStrategy(LaboRobot robot) {
		super(robot);
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		robot.setColors(000000, 000000, 000000, 000000, 000000);
		if(robot.robotX > 100) robot.turnTo(270); else robot.turnTo(90); 
		while(robot.robotX > 20) {
			robot.ahead(robot.robotX - 20);
		}
		if(robot.robotY < 100) robot.turnTo(0);
		int lado = 0;
		while(true) {
			if(robot.robotY > 500) robot.turnTo(90);
			robot.ahead(100);
		}
	}
	
	private void recorrerLado(int direccion, int largo, char eje) {
		if(eje == 'x') {
			
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
