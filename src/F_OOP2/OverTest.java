package F_OOP2;

public class OverTest {
	public static void main(String[] args) { //지역변수 -> 전역변수 -> 부모클래스. 부모에 있지만 부모걸 사용하지 않는다.
		OverGo og = new OverGo();
		String str = og.upMethod(); // 자식클래스의 업메소드가 실행됨.
		
	}
}

class OverUp{
	int x = 3;
	int y = 3;
	
	String upMethod(){
		return "하이"+x+x;
	}
}

class OverGo extends OverUp{
	int z = 5;
	
	@Override
	String upMethod(){ //안에는 상관이 없음 스트링으로만 반환해주면 됨. / 부모클래스에 있는 메소드를 내 입맛에 맞게 재정의 한 것.
		return x+y+z+"오버라이드";
	}
	
	String upMethod(int k){ //같은 이름의 메소드를 여러 개 만드는 것
		return x+y+k+"오버로딩";
	}
} // this. 지역변수와 전역변수를 구분하기 위해
	// super 자식클래스와 부모클래스를 구분하기 위해. / 자식클래스에서만 사용가능.
//변수 : 지역 -> 전역 -> 부모
//메소드 : 자식 -> 부모