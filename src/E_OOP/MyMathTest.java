//package E_OOP;
//
//public class MyMathTest {
//	public static void main(String[] args) {
//	
//		MyMath.add();
//		
//		MyMath mm = new MyMath();
//		mm.add2(3); //인자값
//		
//		MyMath.add3(4,4.4547f); //인자값
//		
//		mm.add4(1,2,'A'); // 인자값
//		
//		int c = MyMath.add5(7);
//		System.out.println(MyMath.add5(7));
//		System.out.println(c);
//		
//		int z = mm.add6(10,5);
//		System.out.println(z);
//		
//		
//		long x = mm.multiply(300000000,3000);
//		System.out.println(x);
//		
//		float q = mm.divide(10, 7);
//		
//			System.out.println(q);
//			
//		
//	}
//}
//
//class MyMath{
//	static int number = 50;
//	
//	static void add(){
//		System.out.println(number*2);
//	}
//	
//	void add2(int a){ // 매개변수
//		System.out.println(number*a);//error or ???
//	}
//	
//	static void add3(int a, float c){//매개변수
//		System.out.println(a*c);
//	}
//	
//	void add4(int c, int d, char e){
//		System.out.println(c+d+e); // c=1, d=2, e=A ->68
//		
//	}
//	
//	//클래스 메소드명은 add5
//	static int add5(int i){
//		return number+3;
//	}
//	//매개변수는 int 하나
//	//수행내용:매개변수와 전역변수(number)의 합을 반환
//	
//	int add7(int a, int b){
//		int result = a+b;
//		return result;
//	}
//	
//	//메서드명 add6
//	//매개변수 int 두개
//	//앞에 받은 값에서 뒤에 받은 값을 뺀 결과를 반환하는 메서드를 만드세요
//	int add6(int z, int x){
//		int result = z-x;
//		return result;	
//	}
//	
//	//multiply
//	//int 값 2개
//	//두개의 수를 곱해서 반환해주세요.
//	//overflow를 고려해서 표현해주세요.
//	long multiply(int a, int b){
//		long result = (long)a*b;
//		return result;
//	}
//	//인스턴스 메소드 divide
//	//int 값 두개
//	//앞의 값을 뒤의 값으로 나눈 결과를 반환해주세요
//	//단. 소숫점 셋째자리에서 반올림하여 두번째 자리까지 표현해주세요
//	float divide(int a, int b){
//		float result = (int)((float)a/b*100+0.5f)/100f;
//		return result;
//	}
//	
//}