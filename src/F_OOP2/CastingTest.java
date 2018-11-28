package F_OOP2;

public class CastingTest {
	public static void main(String[] args) {
		FireCar fc = new FireCar();
		
		fc.water();
		
		Car c = fc; // up-casting 캐스트연산자 생략가능
		c.drive();
		FireCar fc2 = (FireCar)c;
		fc2.water();
		//자식클래스의 인스턴스를 먼저 만들어놔야 자식으로도 변경가능하고 다시 부모 자신으로도 돌아올 수 있다.
		
		FireCar fc3 = (FireCar)new Car();
	}
}

class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("순천으로 가자");
	}
	
	void stop(){
		System.out.println("주차중");
	}
}

class FireCar extends Car{
	void water(){
		System.out.println("물대포");
	}
}

class Ambulance extends Car{
	void AED(){
		System.out.println("200줄 차지");
	}
}