package E_OOP;

public class MemberCall {
	
	int iv = 10;
	static int cv = 100;
	
	int iv2 = iv;
	int iv3 = cv;
	
	static int cv2 = cv;
	//static int cv3 = iv
	static int cv3 = new MemberCall().iv; //선언과 동시에 인스턴스화를 해줄 경우에는 가능하다.
	
	static void method(){
		cv = 500;
		// iv = 500;
	}
	
	void method2(){
		cv = 1000;
	}
	
	static void method3(){
		method(); // 클래스 메소드니까 클래스 메소드를 호출할 수 있다.
//		method2(); // 인스턴스 메소드가 로드되기 전 시점이기 때문에 불가능하다.
	}
	
	void method4(){
		method();
		method2(); // 인스턴스 메소드가 로드된 시점엔 인스턴스와 클래스 모두가 로드되어 있기 때문에 참조가 가능하다.
	}
	
	
	
	
	
	
	
	
}
