package Y_exam;

public class Exam_06 {
	public static void main(String[] args) {
//		SutdaCard card1 = new SutdaCard(3, false);
//		SutdaCard card2 = new SutdaCard();
//		System.out.println(card1.info());
//		System.out.println(card2.info());
		
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		
		Student s = new Student("홍길동",1,1,100,60,76);
		System.out.println(s.info());
		
	}
}


class SutdaCard{
	static int num; 
	static boolean isKwang;
	String nope;
	
	SutdaCard(int num, boolean isKwang){
		num = (int)(Math.random()*10+1);
			nope = (isKwang==true?"K":null);
		}


	SutdaCard(){
		num=1;
	}
	
	{if(isKwang==true){
		nope = "K";
	}
	}
	
	void info(){
		System.out.print(num);
		System.out.println(nope);
	}
	
	
	
	
}

class Student{
	static String name;
	static int ban;
	static int no;
	static int kor;
	static int eng;
	static int math;
	
	int getTotal(){
		return kor + eng + math;
	}
	
	float getAverage(){
		return (int)((kor+eng+math)/3f*10+0.5f)/10f;
	}
	
	Student(String a, int b, int c, int d, int e, int f){
		this.name = a;
		this.ban = b;
		this.no = c;
		this.kor= d;
		this.eng=e;
		this.math=f;
	}
	
	void info(){
		System.out.println(name+","+ban+","+no+","+kor+","+eng+","+math);
	}
}

a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
b. 생성자는 객체를 생성하기 위한 것이다. - 인스턴스를 초기화하기 위한 것
c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
e. 생성자는 오버로딩 할 수 없다. - 있다

a. 객체 자신을 가리키는 참조변수이다. o
b. 클래스 내에서라면 어디서든 사용할 수 있다. x
c. 지역변수와 인스턴스변수를 구별할 때 사용한다. o
d. 클래스 메서드 내에서는 사용할 수 없다. x

a. 메서드의 이름이 같아야 한다. o
b. 매개변수의 개수나 타입이 달라야 한다. o
c. 리턴타입이 달라야 한다. x
d. 매개변수의 이름이 달라야 한다. o

long add(int a, int b) { return a+b;}
a. long add(int x, int y) { return x+y;} - x 타입 갯수
b. long add(long a, long b) { return a+b;} 타입다름
c. int add(byte a, byte b) { return a+b;} 타입다름
d. int add(long a, int b) { return (int)(a+b);} 타입다름

다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
a.멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다. x
b.지역변수는 사용하기 전에 반드시 초기화해야 한다. o(전역만 해당)
c.초기화 블럭보다 생성자가 먼저 수행된다. x
d.명시적 초기화를 제일 우선적으로 고려해야 한다. o
e.클래스변수보다 인스턴스변수가 먼저 초기화된다. x

다음중 인스턴스변수의 초기화 순서가 올바른 것은?
a. 기본값-명시적초기화-초기화블럭-생성자 o
b. 기본값-명시적초기화-생성자-초기화블럭
c. 기본값-초기화블럭-명시적초기화-생성자
d. 기본값-초기화블럭-생성자-명시적초기화

다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
a. 자동 초기화되므로 별도의 초기화가 필요없다. - x
b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다. - x
c. 매서드의 매개변수로 선언된 변수도 지역변수이다. - x
d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다. - o
e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다. - x

호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
println
method1
method2
main
a. 제일 먼저 호출스택에 저장된 것은 main메서드이다. o
b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다. x
c. method2메서드를 호출한 것은 main메서드이다. o
d. println메서드가 종료되면 method1메서드가 수행을 재개한다. o
e. main-method2-method1-println의 순서로 호출되었다. o
f. 현재 실행중인 메서드는 println 뿐이다. o
