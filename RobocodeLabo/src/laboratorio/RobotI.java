package laboratorio;

public interface RobotI {

	public void fire(double i);
	public void back(int distance);
	public void ahead(int distance);
	public void turnGunRight(int degrees);
	public void setColors(int bodyColor, int gunColor,int radarColor, int bulletColor,int canArcColor);
}
