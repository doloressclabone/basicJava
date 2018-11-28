package E_OOP;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("red", "auto",2);
		Car c3 = new Car("yellow", "auto");
	
	}
}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		color = "black";
		gearType = "stick";
		door = 4;
	}
	
	Car(String color, String gearType){
		this();
		this.color = color; //전역변수와 지역변수를 구분짓기 위해 this.를 붙이는데 this 뒤의 변수는 전역변수(인스턴스 변수)를 가리킨다.
		this.gearType = gearType;

	}
	
	Car(String color, String gearType,  int door){
		//this(); // 생성자의 가장 윗부분에 와야 한다.
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	//생성자는 인스턴스변수들만을 초기화할 목적을 가진다.
	//매개변수의 타입과 갯수는 같아도 순서가 다르면 그것 역시 오버로딩이 가능하다?
	//
//	Car(String color3,  int door3, String gearType3){
//		color = color3;
//		gearType = gearType3;
//		door = door3;
//	}
	
}
