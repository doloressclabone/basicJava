package Y_exam;

public class Exam_02 {
	public static void main(String[] args){
		
		/* 
		[2-1]다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
				1byte		2byte		4byte		8byte
		논리형	boolean	
		---------------------------------------------------
		문자형				char
		---------------------------------------------------
		정수형	byte		short		int			long
		---------------------------------------------------
		실수형							float		double
		---------------------------------------------------
		
		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
		(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
		초기화 하는 한 줄의 코드를 적으시오.
		
		long을 선택해야 한다. **float이나 double 역시 선택은 가능하지만 메모리 사용 효율을
		최대로 끌어올리기 위해서** 정수형에서 최대치 표현이 가능한 long 타입을 사용한다. 
		**~~~**부분은 오류!
		
		long regNo = 9201171000000L;
		
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
		int i = 100;
		long l =100L;
		final float PI = 3.14f;
		
		-리터럴 : 100, 100L, 3.14f
		-변수   : i, l
		-키워드 : int, long, float, final
		-상수   : PI
		
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은? - b.Byte
		a. int
		b. Byte
		c. double
		d. boolean
		
		전부 다 기본형이지만 b.의 byte가 Byte로 표기가 되어있는데 자바에서는 대소문자를 구별하기 때문에
		아닌 것이 된다. 
		
		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우,
		 괄호 안에 ‘오류’라고 적으시오.
		System.out.println(“1” + “2”) → (12) => String + String => string "12"
		System.out.println(true + “”) → (true) => boolean + String => String + String => String "true"
		System.out.println(‘A' + 'B') → (131) => char + char => int + int => int 131 
		*JVM은 기본 연산이 4바이트며 모든 연산값들이 4바이트 미만일 경우 4바이트로 변환한 후 연산을 진행한다.		
		System.out.println('1' + 2) → (51) => char + int => int + int => int 51
		System.out.println('1' + '2') → (99) => char + char => int + int => int 99
		System.out.println('J' + “ava”) → (Java) => char + String => String + String => String "Java"
		System.out.println(true + null) → (오류) =>  => null(주소가 만들어지지 않은 상태)이며 '주소' 그 자체이고, 참조형 전체의 기본값이기 때문에 주소에 값을 더할 수 없기 때문에.
		기본형끼리만 연산이 가능하며 스트링만 예외임.
		
		The operator + is undefined for the argument type(s) boolean, null와 같은 이유로 (오류)
		
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오) - b.True, C.NULL, d.Class e.System
		a. if
		b. True
		c. NULL
		d. Class
		e. System
		
		*자바에서는 대소문자를 구별하기 때문에 true, null, class 라고 써야 맞다. 
		*System은 명령어지 키워드는 아니다.
		
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오) - a, d, e, g
		a. $ystem
		b. channel#5
		c. 7eleven
		d. If
		e. 자바
		f. new
		g. $MAX_NUM
		h. hello@com
		
		a는 규칙과 약속에 모두 부합
		d, e, g는 약속에는 어긋나지만 규칙에 부합하기 때문에 사용 자체는 가능하다.
		
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은?
		 (모두 고르시오) - a, d
		a. int
		b. long
		c. short
		d. float
		e. double
		
		*참조형은 객체의 4바이트를 주소로 저장하기 때문에 4바이트 크기를 가진 기본형을 찾는다.
		
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오) - d, e
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		a. b = (byte)i; int타입에서 byte타입으로의 변환이기 때문에 캐스트 생략 불가
		b. ch = (char)b; byte&short, char간의 변환에서는 캐스트 생략 불가
		c. short s = (short)ch; 위와 같은 이유로 생략 불가
		d. float f = (float)l; long타입에서 float타입으로의 변환이기 때문에 생략 가능!
		e. i = (int)ch; char에서 int로의 변환이기 때문에 생략 가능!
		
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		char는 2바이트 타입의 문자형으로 음수를 표현하지 않기 때문에
		+, - 부호를 나타내기 위해 공백으로 두는 칸(비트)이 없다.
		때문에 16칸(16비트) 모두를 사용하기 때문에 2^16이며 그 범위는 영을 포함하기 때문에 결과값에서 -1을 해준다  
		2^16 = 65,536 -> 0~2^16-1 -> 0~65,535;
		
		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오) - a, b, c, d
		a. byte b = 256;
		b. char c = '';
		c. char answer = 'no';
		d. float f = 3.14
		e. double d = 1.4e3f;
		
		*e는 (double) 캐스트 연산자가 생략된 것.
		
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오) - c, e, f
		a. boolean - false
		b. char - '\u0000'
		c. float - 0.0 -> 0.0f를 기본 값으로 한다.
		d. int - 0
		e. long - 0 -> 0L을 기본값으로 한다.
		f. String - "" -> 공백은 공백이라는 데이터의 주소가 저장된 것이기 때문에.
		 */
		System.out.println('J' + "ava");
		long regNo = 9201171000000L;
		System.out.println(regNo);
		char b = 'j';
		int d = b;
		
		String asd;
		
		
		
	}
}
