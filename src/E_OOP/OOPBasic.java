package E_OOP;

public class OOPBasic {
	public static void main(String[] args) {
		/*
		 1.OOP:Object Oriented Programming(객체지향프로그래밍)
		 
		 2.객체지향언어
		 -기존의 프로그래밍 언어에 수 천, 수 만가지 새로운 규칙을 추가한 보다 발전된 형태이다.
		 -규칙들을 이용해서 코드 간에 서로 관계를 맺어줌으로써(7장) 보다 유기적으로 프로그램을 구성한다.
		 -객체지향 언어의 특징
		  : 코드의 재사용성이 높다.
		  : 코드의 관리가 용이하다(하나만 고치면 되서).
		  : 신뢰성이 높은 프로그래밍이 가능하다(하나의 메소드로 묶여져 있기 때문에).
		 
		 3.클래스(레서피)와 객체(인스턴스)
		 1)클래스란?
		 -객체를 정의해 놓은 것이다.
		 -객체의 설계도 또는 틀이다.
		 (Tv설계도를 보고 조립하면 tv가 되고 된장찌개 레서피를 보고 만들면 된장찌개(=인스턴스)가 되듯)
		 
		 2)클래스의 선언
		 :[접근제어자][지정예약어] class 클래스명 [extends 클래스명] [implements 인터페이스]
		  						6장			7장				7장
		   public abstract  class child  extends parents  implements Serializable{}
		 
		 3)객체란?
		 : 설계도를 통해 만들어낸 결과물, 실재하는 것, 사물 또는 개념
		 ex)Tv, 다리미, 책상,
		 - 객체의 구성요소
		  :속성(*멤버변수*, 특성, 필드, 상태)
		   	ex)크기, 길이, 높이, 색상, 볼륨,...
		  :기능(메소드, 함수, 행위)
		  	ex)켬, 끔, 높임, 내림
		  	
		 4)파일을 따로 가지고 있어야 하는 이유
		 클래스 파일은 컴파일이 되면 각각의 클래스 별로 파일이 생긴다.
		 한 클래스 파일 안에 몇 개의 클래스가 들어 있는지 모르기 때문에 보통은 하나의 파일안에 하나의 클래스(해당 클래스가 사용할 클래스 정도는 만들기도 한다)만을 가진다.
		 
		 5)메인메소드를 가진 클래스가 먼저 실행되는 이유
		 컴파일러가 컴파일시 모든 클래스를 개별적으로 생성.
		 하지만 어떤 클래스들이 존재하는지 아직 모르기 때문에 클래스명과 이름이 같은 클래스에 제 1순위로 접근하기 때문이다.
		 
		 		 
		 4.인스턴스란?
		 - 클래스로부터 객체를 만드는 과정을 '인스턴스화'라고 한다.
		 - tv클래스로부터 만들어진 객체를 tv클래스의 인스턴스 라고 한다.
		 - 인스턴스 생성방법
		 	: 클래스명(변수타입) 변수명; => 클래스의 객체를 참조하기 위한 참조변수를 선언한다.
		 	: 변수명(참조변수) : new 클래스명()(클래스의 객체를 생성); => 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장한다.
		 	: 인스턴스는 참조변수를 통해서만 다룰 수 있다. 참조변수의 타입은 인스턴스의 타입과 일치해야 한다. 
		 		
		 5.선언위치에 따른 변수의 종료
		 -지역변수, (전역변수(클래스변수, 인스턴스변수) -> 멤버변수)
		 -클래스변수(static)
		 :모든 인스턴스가 공통된 저장공간(변수)을 공유한다.
		 :한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야 하는 경우 클래스변수로 선언한다.(
		 			(색깔,문양,숫자)					(길이,높이,재질)
		 :인스턴스변수 앞에 static만 붙이면 된다.
		 
		 -인스턴스변수
		 :인스턴스화(클래스의 인스턴스를 생성)해서 인스턴스가 만들어질 때 생성이 된다.
		 :인스턴스 변수의 값을 읽어 오거나 저장하기 위해서는 먼저 인스턴스화를 해야한다. 
		 :인스턴스는 독립적인 저장공간을 가지므로 서로다른 값을 가질 수 있다.
		 :인스턴스마다 고유한 상태를 유지해야 하는 경우 인스턴스 변수로 선언된다.
		 
		 -지역변수
		 :메소드내에 선언되며 메서드 내에서만 사용가능하다.
		 :메소드 종료시 소멸된다.
		 
		 6.메소드
		 -어떠한 작업을 수행하기 위한 명령문의 집합
		 -주로 어떤 값을 입력받아서 처리하고 그 결과를 돌려준다.
		 -입력값이 없을수도 결과를 반환하지 않을수도 있다.
		 -반복적으로 사용되는 코드를 줄이기 위해서 사용한다.
		  =>유지보수가 용이하다.
		 -작성방법
		 //~~~~~~~~~~~~~~~~~~~~~~메소드의 선언부~~~~~~~~~~~~~~~~~~~~~~~~~~~//~~~메서드의 구현부~~~
		 반환타입(void) 메소드명(변수타입 변수명,)or(변수타입 변수명,......,변수타입 변수명){
		 	return;//리턴 뒤에 아무것도 없으면 void, 있으면 리턴 값에 맞는 반환타입을 적는다. 
		 }
		 
		 7.return(값이 있을 수도 없을 수도 있는 'break'와 비슷함)
		 -메소드가 정상적으로 종료되는 경우
		 :메소드의 블럭'{}'내의 마지막 문장까지 수행하였을 때
		 :메소드의 블럭'{}'내에서 return문을 만났을 때
		 
		 -반환값
		 :없는 경우에는
		 (1)공란으로 두기
		 (2)return; <- 생략가능 // 대신 반환타입은 'void'로 명시해주어야 함.
		 :있는 경우에는
		 (1)return 반환값;
		 (2)반환타입과 반환값의 타입이 같아야 한다.
		 
		 8.클래스멤버와 인스턴스멤버간의 참조와 호출
		 -같은 클래스의 멤버간에는 객체 생성이나 참조변수 없이 참조할 수 있다.
		 -클래스 멤버들은 인스턴스 멤버들을 참조할 수 없다.
		 -인스턴스 멤버가 존재하는 시점에서는 클래스 멤버가 존재한다.
		 -클래스 멤버가 존재하는 시점에서는 인스턴스 멤버가 존재하지 않는다.(선언과 동시에 인스턴스화를 하면 존재한다고 하지만 and 연산자로 생각하기 때문에 false)
		 
		 9.메소드 오버로딩(overloading)
		 -한 클래스 내에 같은 이름의 메소드를 여러개 정의하는 것이다.
		 -대표적인 예)println(). 메소드의 이름은 같되 
		 -매개변수의 갯수나 or 데이터타입이 다르면 된다.
		 -리턴타입은 관련이 없다.
		 -같은 행위를 하는 메소드를 하나의 메소드로 묶어 여러 의미를 부여할 수 있다.
		 -많은 메소드를 만들지 않아도 되서 힘들지 않고 부를때도 기억하기도 용이하다
		  (메소드의 이름으로 구분되면, 한 클래스의 모든 메소드의 명은 달라야한다)
		  (근본적으로 같은 기능을 하는 것인데 다른 이름으로 써야하면 기억하기가 어렵다)
		  (메소드의 이름을 짓는 고민을 덜 수 있다)
		  
		 10.매개변수
		 -메소드를 호출할 때 매개변수로 지정한 값을 메소드의 매개변수에 복사하여 넘겨준다.
		 기본형 매개변수
		 :단순히 저장된 값만 복사한다.
		 :변수의 값을 읽기만 할 수 있다.
		 참조형 매개변수
		 :인스턴스의 주소가 복사된다.
		 :변수의 값을 읽고 변경할 수 있다.
		 
		 11.메소드의 종류
		 -클래스 메소드
		 :클래스명.메소드명() // 객체생성이 필요하지 않다.
		 :인스턴스멤버와 관련없는 작업을 수행한다.
		 :메소드 내에서 인스턴스 멤버를 사용할 수 없다.
		 :메소드 내에서 인스턴스 멤버를 사용하지 않는다면 static을 붙이는 것을 고려한다.
		 -인스턴스 메소드
		 :인스턴스를 생성 후 참조변수.메소드명();으로 호출한다.
		 :메소드 내에서 클래스멤버나 인스턴스멤버를 호출이 가능하다.
		 
		 12.JVM메모리 구조
		 -Method Area
		 :프로그램 사용 중 class가 사용되면 클래스의 정보(9장)를 저장한다.
		 :클래스변수, 클래스메소드도 같이 저장된다.
		 -Call stack
		 :메소드의 작업에 필요한 메모리공간을 제공한다.
		 :메소드가 호출되면 호출스택에 호출된 메소드를 위한 메모리가 할당되며
		   메소드가 작업을 수행하는 동안 지역변수들과 연산의 중간결과 등을 저장한다.
		 -Heap Area
		 :인스턴스가 생성되는 공간이다.
		 :인스턴스 변수와 인스턴스 메소드가 같이 저장(생성)된다.
		 
		 13.재귀호출
		 -메소드 내부에서 메소드 자기 자신을 다시 호출하는 것.
		 
		 14.생성자(Tv t = new Tv();)
		 					생성자
		 -인스턴스가 생성될 때 호출되는 인스턴스 초기화 메소드이다.
		 -생성자가 없으면 컴파일러가 기본생성자를 넣어준다.
		 -초기값을 null 또는 0으로 초기화 하기 싫어서. 기본값을 정해주고 싶을 때
		 -이름을 같을 때에는 지역변수를 찾은 뒤에 전역변수에서 찾는다.
		 -특징
		 :메소드처럼 클래스 내에 선언된다.
		 :리턴값이 없다.
		  (생성자도 메소드이기 때문에 리턴되는 값이 없으면 void를 반환타입에 적어 줘야 하지만)
		  (모든 생성자는 리턴값이 없기 때문에 void를 생략한다.)
		 :생성자의 명칭은 클래스의 명칭과 동일해야 한다.
		 -정의방법
		 :기본생성자
		 	(void) 클래스명(){
		 	
		 	}
		 :매개변수가 없는 생성자
		 	클래스명(){
		 		
		 	}
		 :매개변수가 있는 생성자
		  	클래스명(변수타입 변수명,){
		  	
		  	}
		  
		 
		 
		 
		 
		 
		 */	
	}

}
