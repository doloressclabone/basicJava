package F_OOP2;

public class PointTest {
	public static void main(String[] args) {
		Point3D p3d = new Point3D(10,20,30);
	}
}

class Point2{
	int x;
	int y;
	
	Point2(int x, int y){
		this.x=x;
		this.y=y;
	}
}
//Point2에 기본생성자를 만들어 주는 방법 or 
class Point3D extends Point2{
	int z;
	Point3D(int x, int y, int z){
		super(x,y); //부모클래스를 초기화하기 위한 것.
		this.z=z;
	}
}