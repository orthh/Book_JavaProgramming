package chap05_point;

public class Point3D extends Point{

	int z;
	
	public Point3D(int x, int y) {
		super(x, y);
		
	}
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public void moveUp() {
		this.z++;
	}
	public void moveDown() {
		this.z--;
	}
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	public String toString() {
		
		return "(" + super.getX() + "," + super.getY() + "," + z + ")의 점"; 
	}
	
	
}
