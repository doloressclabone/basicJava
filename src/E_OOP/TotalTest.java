package E_OOP;
// -7 , +1 
public class TotalTest { // 0
//TotalTest 클래스가 Method Area에 로드되면서 클래스메소드와 클래스변수가 같이 로드된다.
//	클래스메소드 : main메소드, int타입을 리턴값으로 받는 volumeDown()가 있다.
//	클래스변수 : 클래스변수가 존재하지 않는다.

	public static void main(String[] args) { //0
		//main메소드를 실행하게 되면서 call stack영역에 쌓이게 된다.

		TvMaker.color = "Blue";  // 0
		//인스턴스화를 통하지 않고도 클래스안의 멤버변수나 멤버메소드를 호출할 수 있는 것들이 있다. 바로 '클래스변수'와 '클래스메소드'이다.
		//TvMaker클래스의 주소로 들어가 그 안에 클래스변수 color에 String 타입의 "Blue"를 대입해준다(color의 타입이 String이기 때문에)
		//color는 해당 클래스 내에서 값을 공유하는 클래스 변수이기 때문에 기본값 null은 가지고 있던 color에 "Blue"가 직접적으로 대입된다.
		
		TvMaker tm = new TvMaker();  // +1
		//TvMaker를 인스턴스화.
		//TvMaker 클래스는 이미 로드가 되어 있는 상태이므로 다음 순서로 main메소드안에 지역변수 tm을 선언해준다
		//new 연산자를 통해 인스턴스화가 진행되며 heap메모리에 tm의 주소가 생기고 인스턴스변수와 인스턴스메소드가 힙메모리에 같이 로드된다
//		인스턴스 변수:String name = "";	int age; 각각 null값으로 초기화 된다.
//		인스턴스 메소드:TvMaker(), TvMaker(String, int) 인스턴스메소드로는 매개변수를 가지지않는 TvMaker 생성자 메소드와,
//		String과 int 타입을 매개변수로 가지는 TvMaker 생성자 메소드가 있다.
//		이제 생성자 메소드가 call stack 영역에 호출될 차례이다.
//		생성자 메소드에 매개변수를 입력하지 않고 호출할 것이다. 매개변수를 가지고 있지 않은 생성자 메소드를 call stack 영역에 호출한다.
//		this("man", 25);해당 생성자 메소드의 실행문이다.
//		this는 해당 클래스의 인스턴스 변수를 가리키고 바로 뒤따라 오는 ()의 내용을 해당 클래스의 해당 데이터타입의 인스턴스 변수에 대입해주면 된다.
//		그렇게 되면 null과 기본값으로 초기화된 인스턴스변수 String name과 int age에 각각 "man"과 "25"로 초기화 한 뒤 생성자 메소드는 종료되고, call stack에서 지워진다.

		tm.age = 30; //
		//인스턴스 접근
		//인스턴스화를 통해 주소를 가지게 된 TvMaker타입의 참조변수 tm에는 .(dot)연산자를 통해 접근이 가능하다.
		//참조변수 tm의 인스턴스변수 age에 int 값 30을 대입해준다.
		//값을 공유하는 클래스변수 color와는 달리 인스턴스 변수는 독립된 값을 지닌다.
		//참조변수 tm의 인스턴스변수 age에만 값이 저장되고, tm을 통해서만 데이터에 접근할 수 있다. 
		
		// 3. 메서드 호출
		// 3.1
		System.out.println(TvControll.channel); //-2 호출방법 ㅜㅜ 명시적초기화 
		//System클래스의 메소드 println를 실행하려고 한다. 이를 먼저 call stack에 쌓아준다
		//println의 ()안에 Tvcontroll.channel이 있다. 인스턴스화 한 것이 아니므로 클래스 변수와 클래스 Tvcontroll클래스를 Method Area에 로드해준다.
		//클래스변수:final int MAX_VOLUME = 100 	final int MIN_VOLUME = 0 static final int MAX_CHANNEL = 50
		//static final int MIN_CHANNEL = 1	static int channel = 15;
		//위와 같은 클래스변수들이 존재하고 대입받은 값으로 초기화된다.
		//클래스메소드:volumeDown()
		//M.A영역에 TvControll클래스를 로드시켰다. 이 안에서 channel 변수의 값을 바로 빼오려고 한다.
		//이는TvMaker와 마찬가지로 인스턴스화를 거치지 않고도 출력할 수 있는 클래스 변수에 해당하기 때문에 가능하다
		//Tvcontroll클래스안의 클래스변수 channel을 호출하면 15를 대입받게 되고 그 값을 println하게 되며 콘솔에 15가 나오고 메소드는 종료된다.
		//call stack영역에서 println 메소드가 지워진다.
		
		
		TvControll.volumeDown(); // -선언or참조
		//이번에도 역시 TvControll클래스안의 클래스메소드 volumeDown()메소드를 호출하려고 한다.
		//TvControll클래스는 이미 로드가 되어 있으니 다시 로드시킬 필요는 없다. dot연산자를 통해 호출하려는 메소드의 명이 바로 이어진다.
		//이 역시도 volumeDown()메소드가 클래스메소드 이기에 가능하다.
		//메소드의 호출이 이루어졌으므로 C.S영역에 volumeDown()이 쌓인다.
		// if (channel == MAX_CHANNEL) {channel = MIN_CHANNEL;} else {channel++;}	return channel;
		//volumeDown()메소드의 실행문이다. 만약 channel의 값이 MAX_CHANNEL의 값과 같다면 {channel = MIN_CHANNEL;} 이와 같이
		//else 그렇지 않다면 {channel++;} 이와같이 실행하고 변수 channel에 그 값을 저장하고 return 그 값을 반환해준다. 그러므로 volumeDown()메소드의 반환타입 역시 int로 맞춰준다.
		//위에서 channel의 값을 콘솔 영역에 찍어주었을 때 15였고 그 이후에 어떤 초기화 과정도 이루어지지 않았다. 그렇기 때문에 channel은 15이며
		//이는 50의 값을 지닌 MAX_CHANNEL의 값과 일치하지 않기 때문에 {channel++;} 이를 실행하고 메소드를 닫고 C.S영역에서 volumeDown()이 사라진다.
		
		System.out.println(TvControll.channel); 
		////System클래스의 메소드 println를 실행하려고 한다. 이를 먼저 call stack에 쌓아준다
		//println의 ()안에 Tvcontroll.channel이 있다. 이미 로드되었으므로 바로 클래스안에서 값을 찾아준다.
		//윗 행에서 TvControll.volumeDown();이 실행되었으므로 클래스변수 channel엔 ++된 값 17이 저장되어 있다.
		//17이 콘솔에 출력되고 메소드가 닫히면서 C.S영역에서 println가 지워진다.

		// 3.2
		TvControll tc; //
		//TvControll의 주소를 참조하는 참조변수 tc를 main메소드의 지역변수로 선언해준다.
		
		tc = new TvControll(); //
		//new 연산자를 통해 heap 영역에 tc의 주소가 생성되고 TvControll의 인스턴스변수와 인스턴스메소드들이 로드된다.
		//인스턴스변수:int volume = 99;
		//인스턴스메소드:volumeUp()
		//TvControll클래스 내에는 생성자가 존재하지 않으므로 JVM을 통해 기본생성자를 부여받아 생성이 완료된다.
		
		
		System.out.println(tc.volume);
		//System클래스의 메소드 println를 실행하려고 한다. 참조변수 tc에 접근해 volume의 값을 출력하려고 한다.
		//tc는 이미 로드가 되어 있으므로 바로 volume
		tc.volumeUp();
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);

		// -4 오버로딩,매개변수88줄,...
		Calc cc = new Calc();
		System.out.println(cc.add(Integer.MAX_VALUE, 4));
		System.out.println(cc.add(3L, Integer.MAX_VALUE));

	}
}

class TvMaker extends TvControll{ 
	// 1. 
	// 1.1  
	static String color;
	static int inch;
	// 1.2 
	String name = "";
	int age;

	// 2. 
	// 2.1 
	TvMaker() {
		this("man", 25);
	}

	// 2.2 
	TvMaker(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class TvControll {
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	static final int MAX_CHANNEL = 50;
	static final int MIN_CHANNEL = 1;

	static int channel = 15;
	int volume = 99;

	// 4. return문
	int volumeUp() {
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume;
	}

	static int volumeDown() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}

class Calc {
	// 5.
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}