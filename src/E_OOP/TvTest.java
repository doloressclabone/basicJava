package E_OOP;

public class TvTest {
	public static void main(String[] args) {
		//인스턴스들은 인스턴스화를 통해서만 출력이 가능한 반면 클래스들은 그냥 뜬다.
		//변수부터 뜨고 메소드가 알파벳 순으로 뜸
		
		//클래스변수 호출방법(클래스명.변수명)
		//메인메소드의 지역변수 color가 선언되었다.
		String color = Tv.color;
					  //
		System.out.println(color);
		Tv.color = "Magenta";
		System.out.println(Tv.color);
		
		Tv.changeColor();
		System.out.println(Tv.color);
		
		//Tv클래스의 인스턴스 생성
		//Tv타입의 참조변수 t // main()메소드의 영역에 Tv를 참조로 하는 지역변수 t가 선언됨
		Tv t = new Tv();
		//t:참조(형)변수
		//인스턴스들은 = 참조변수.변수명 or 메소드명
		//t주소의 power를 출력해주세요.
		System.out.println(t.power);
		
		//t주소의 power메소드를 호출해주세요.
		t.power();
		
		//t주소의 power를 출력해주세요.
		System.out.println(t.power);
		
		//t주소의 채널을 16번으로 변경해주세요.
//		for(int i=0; i<15; i++){
//		t.channelUp();
//		}
		t.channel=16;
		//t주소의 channelUp 메소드를 호출해주세요.
		t.channelUp();
		
		//t주소의 채널을 출력해주세요.
		System.out.println(t.channel);
		
		
		
		
	}
}

class Tv{
	//전역변수(클래스변수, 인스턴스변수)
	//클래스변수
	static String color;
	//인스턴스변수
	boolean power; // 껌, 켬
	int channel; // 채널
	
	//클래스 메소드
	static void changeColor(){
		color = "green";
	}
	//인스턴스 메소드
	void channelUp(){
		channel++;
	}
	//인스턴스 메소드
	void channeldo(){
		channel--;
	}
	//인스턴스 메소드
	void power(){
		power = !power;	
	}
}





