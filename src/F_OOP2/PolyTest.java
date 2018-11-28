package F_OOP2;

public class PolyTest {
	public static void main(String[] args) {
//		1.스마트TV 3대 저장하세요
		SmartTv[] smt = new SmartTv[3];
		SmartTv st1 = new SmartTv();
		smt[0] = st1;
		
		smt[1] = new SmartTv();
		SmartTv st2 = new SmartTv();
		smt[1] = st2;
		
		smt[2] = new SmartTv();
		SmartTv st3 = new SmartTv();
		smt[2] = st3;

//		2.3D tv 2대 저장하세요
//		ThreeDTv thdt1 = new ThreeDTv();
//		ThreeDTv thdt2 = new ThreeDTv();
//		ThreeDTv thdt3 = new ThreeDTv();
//		
		ThreeDTv[] tht = new ThreeDTv[2];
		tht[0] = new ThreeDTv();
		tht[1] = new ThreeDTv();
		
//		tht[0] = thdt1;
//		tht[1] = thdt2;
//		3.아프리카 tv 4대 저장하세요.
//		AfreecaTv aft1 = new AfreecaTv();
//		AfreecaTv aft2 = new AfreecaTv();
//		AfreecaTv aft3 = new AfreecaTv();
//		AfreecaTv aft4 = new AfreecaTv();
		
		AfreecaTv[] aft = new AfreecaTv[4];
		aft[0] = new AfreecaTv();
		aft[1] = new AfreecaTv();
		aft[2] = new AfreecaTv();
		aft[3] = new AfreecaTv();
		
//		aft[0] = aft1;
//		aft[0] = aft2;
//		aft[0] = aft3;
//		aft[0] = aft4;
		
		Tv[] t = new Tv[9];
		t[0] = new SmartTv();
		t[1] = new SmartTv();
		t[2] = new SmartTv();
		t[3] = new ThreeDTv();
		t[4] = new ThreeDTv();
		t[5] = new AfreecaTv();
		t[6] = new AfreecaTv();
		t[7] = new AfreecaTv();
		t[8] = new AfreecaTv();
		//2번방을 뽑으면 스마트tv의 주소값이 나오지만 타입은 tv이다.
//		t[2]. -> 인터넷메소드가 없음
//		((SmartTv)t[2]). or SmartTv st4 = (SmartTv)t[2];-> 인터넷메소드 생김. -> 다운캐스팅(생략불가능)
		
//		SmartTv tt = (SmartTv)new Tv(); // 문법상 오류는 없으나
	}
}

class Tv{
	boolean power;
	int channel;
	
	void power(){
		power =! power;
	}
	
	void channelUp(){
		channel++;
	}
}

class SmartTv extends Tv{
	void internet(){

	}
}

class ThreeDTv extends Tv{
	void threeD(){
		
	}
}

class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
}
















