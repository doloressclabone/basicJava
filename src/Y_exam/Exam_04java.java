package Y_exam;

import java.util.Scanner;

public class Exam_04java {
	public static void main(String[] args) {
////	1. 1~5 사이의 랜덤한 정수값을 a4변수에 저장해주세요.
////	int a4 = (int)(Math.random()*5+1);
////	System.out.println(a4);
////	2.a4의 값이 5이면 "한남동 유엔빌리지 최대면적 당첨"
////	if(a4==5){
////		System.out.println("한남동 유엔빌리지 최대면적 당첨");
////	} else if(a4==4){
////		System.out.println("용산 아이파크 최대면적 당첨");
////	} else if(a4==3){
////		System.out.println("벤틀리 최고가 모델 풀옵션 당첨");
////	} else if(a4==2){
////		System.out.println("가로수길 커피스미스 당첨");
////	} else if(a4==1){
////		System.out.println("영민빌딩 당첨");
////	}
////	switch((int)(Math.random()*5+1)){
////	case 5 :
////		System.out.println("한남동 유엔빌리지 최대면적 당첨");
////		break;
////	case 4 :
////		System.out.println("용산 아이파크 최대면적 당첨");
////		break;
////	case 3 :
////		System.out.println("벤틀리 최고가 모델 풀옵션 당첨");
////		break;
////	case 2 :
////		System.out.println("가로수길 커피스미스 당첨");
////		break;
////	default:System.out.println("영민빌딩 당첨");
////		
//	}
//	
////	a4의 값이 4이면 "용산 아이파크 최대면적 당첨"
////	a4의 값이 3이면 "벤틀리 최고가 모델 풀옵션 당첨"
////	a4의 값이 2이면 "가로수길 커피스미스 당첨"
////	a4의 값이 1이면 "영민빌딩 당첨"
//	
//	int a2 = (int)(Math.random()*101+0);
//	System.out.println(a2);
////	if(a2>=90){
////		System.out.print("A");
////	} else if(a2>=80){
////		System.out.println("B");
////	} else if(a2>=70){
////		System.out.println("C");
////	} else if(a2>=60){
////		System.out.println("D");
////	} else if(a2>=50){
////		System.out.println("다음이 있으면 다음에 잘보면 되지");
////	} else {
////		System.out.println("아 다음이 없구나");
////	}
////	
//	switch(a2/10){
//	case 10: case 9:
//		System.out.println("A");
//		break;
////	case 9:
////		System.out.println("A");
////		break;
//	case 8:
//		System.out.println("B");
//		break;
//	case 7:
//		System.out.println("C");
//		break;
//	case 6:
//		System.out.println("D");
//		break;
//	case 5:
//		System.out.println("다음이 있으면 다음에 잘보면 되지");
//	default:
//		System.out.println("아 다음이 없구나");
//	}
//	
//	
//
//	//4-1 다음의 문장들을 조건식으로 표현하라.
////	1.int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
////	
////	2.char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
////	
////	3.char형 변수 ch가 'x'또는 'X'일 때 true인 조건식
////	
////	4.char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
////	
////	5.char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
////	
////	6.int형 변수 year가 400으로 나눠 떨어지거나 또는 4로 나눠 떨어지고 100으로 나눠 떨어지지 않을 때
////	  true인 조건식
////	  
////	7.boolean형 변수 powerOn가 false일 때 true인 조건식
////	
////	8.문자열 참조변수 str이 "yes"일 때 true인 조건식
//	
////	[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
//		int sum = 0;
//		for(int i = 1; i<21; i++){
//			if(i%2!=0&&i%3!=0){
//			sum += i;
//			}
//		} System.out.println(sum);
//	}
//	}



//		[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
//
//		int sum = 0;
//		int sum2 = 0;
//		for(int i=1; i<11; i++){
//			sum += i;
//			sum2 += i +;
//			}System.out.println(sum2);
//			}
//			}
////		
//		
//		[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
//				100이상이 되는지 구하시오.
//		int x = 1;
//		//int y = 0;
//		int sum = 0;
//		int cnt=0;
//		while(sum<=100){
//			 if(x%2==0){
//				 sum=sum-x;
//				 cnt++;
//			  }else{
//			  	sum+=x;
//			 cnt++;;
//			  }
//			 x++;	 
//	}
//		System.out.println(cnt);
//		
//		int x1 = 0;
//		int y1 = 0;
//		int sum1 = 0;
//		while(sum1<=100){ 
//			x1++;
//			sum1 += x1 - y1;
//			y1++;
//			y1++;
//			System.out.println(x1);
//			if(sum1==100){
//				break;
//			}
//			x1++;
//			
//			
//		}
//		
//		
//		
//		
//		
//		}
//}
//		

//		[4-5] 다음의 for문을 while문으로 변경하시오.
//		[연습문제]/ch4/Exercise4_5.java
//		public class Exercise4_5 {
//		public static void main(String[] args) {
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
//				System.out.print("*");
//				System.out.println();
//		}
//	}
//}
//		int i = 0;
//		while(i<=11){
//			i++;
//			int j=1; 
//			while(j<=i){
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//		}
//	}
//} i의 값이 '0'으로 시작할 경우 증가 연산자에 의해 '1'이 되고 이어 int j=1을 선언한다. 왜냐면 j가 i와 같은 수로 연산을 하면 j는 i와 같아질 때 까지
  // 연산을 하기 때문에 '*'이 2개부터 찍히기 때문이다.
//			} // end of main
//		} // end of class

//		[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를
//			  출력하는 프로그램을 작성하시오.
//		for(int i=0; i<7; i++){
//			for(int i2=0; i2<7; i2++){
//				if(i==1&&i2==5){
//					System.out.println(i+"+"+i2+"="+(i+i2));
//				} else if(i==2&&i2==4){
//					System.out.println(i+"+"+i2+"="+(i+i2));
//				} else if((i==3&&i2==3)){
//					System.out.println(i+"+"+i2+"="+(i+i2));
//				} else if((i==4&&i2==2)){
//					System.out.println(i+"+"+i2+"="+(i+i2));
//				} else if((i==5&&i2==1))
//				System.out.println(i+"+"+i2+"="+(i+i2));
//			}
//		}
//	}
//}
//		for(int i=1; i<7; i++){
//			for(int i2=1; i2<7; i2++){
//				if(i+i2==6){
//			System.out.println(i+"+"+i2+"="+(i+i2));
//		}
//	}
//		}
//	}
//}

//		[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
//			   코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
//		[연습문제]/ch4/Exercise4_7.java
//				class Exercise4_7 {
//					public static void main(String[] args) {
//				int value = ( /* (1) */ );
//				System.out.println("value:"+value);
//					}
//				}
//				int value = (int)(Math.random()*6+1);
//				System.out.println(value);
//	}//Math.random()의 범위는  0<x<1인 double타입의 소수점이다.
//}				
//		[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
//			  0<=x<=10, 0<=y<=10 이다.
//		int x;
//		int y;
//		for(x=0; x<10; x++){
//			if(2*x==6||2*x==2||2*x==10){
//				for(y=0; y<10; y++){
//					if(2*x+4*y==10){
//					System.out.println("x="+x + "  y="+y);
//					}
//				}
//			}
//		}
//		}
//		}
//

//		[4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는
//			   코드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인
//            15를 출력이 출력되어야 한다. (1)에 알맞은 코드를 넣으시오.
//			  [Hint] String클래스의 charAt(int i)을 사용
//		[연습문제]/ch4/Exercise4_9.java
//				class Exercise4_9 {
//				public static void main(String[] args) {
//				String str = "12345";
//				int sum = 0;
//				for(int i=0; i < str.length(); i++) {
//
//				(1) 알맞은 코드를 넣어 완성하시오.
//		String str = "12345";
//		int sum = 0;
//		for(int i=0; i<str.length(); i++){
//			char ch = (char)(str.charAt(i)-'0');
//			sum += ch;
//			System.out.println("sum="+sum);
//		}
//		
//				System.out.println("sum="+sum);
//		
//				[실행결과]
//				15
//				
//				[4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
//					    완성하라. 만일 변수 num의 값이 12345라면,
//					   ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)에 알맞은 코드를 넣으시오.
//				[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
//				[연습문제]/ch4/Exercise4_10.java
//				class Exercise4_10 {
//				public static void main(String[] args) {
//				int num = 12345;
//				int sum = 0;
///*
//				(1) 알맞은 코드를 넣어 완성하시오.
//		int num = 12345;
//		int sum = 0;
//		int b;
//		
//		for(int i=0; i<5; i++){
//			sum += num%10;
//			num=num/10;
//			
//		}
//		
//		System.out.println(sum);
//}
//*/
//				System.out.println("sum="+sum);
//}
//}
//[4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
//는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
//1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터
//시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
//[연습문제]/ch4/Exercise4_11.java
//public class Exercise4_11 {
//public static void main(String[] args) {
//// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
//int num1 = 1;
//int num2 = 1;
//int num3 = 0; // 세번째 값
//System.out.print(num1+","+num2);
//for (int i = 0 ; i < 8 ; i++ ) {
///*
//(1) 알맞은 코드를 넣어 완성하시오.
//*/
//}
//} // end of main
//} // end of class
//[실행결과]
//15
//[실행결과]
//1,1,2,3,5,8,13,21,34,55
//18 Java의 정석定石 3판 - 연습문제 풀이
//[4-12] 구구단의 일부분을 다음과 같이 출력하시오.
//		int k = 1;
//		while(k<9){
//			k++;
//			int g = 1;
//			while(g<4){
//				System.out.println(k+"*"+g+"="+k*g);
//				g++;
//			}
//		}
//		}
//		}

//[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
//은 코드를 넣어서 프로그램을 완성하시오.
//[연습문제]/ch4/Exercise4_13.java
//class Exercise4_13
//{
//public static void main(String[] args)
//{
String value = "12o34";
char ch = ' ';
boolean isNumber = true;
//// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
//// 하나씩 읽어서 검사한다.
for(int i=0; i < value.length() ;i++) {
	ch = (char)(value.charAt(i)-'0');
	if(isNumber){
		System.out.println(value+"숫자입니다");
	} else {
		System.out.println(value+":숫자가 아닙니다");
		break;
	}
	
}

//(1) 알맞은 코드를 넣어 완성하시오.
//*/
//}
//if (isNumber) {
//System.out.println(value+"는 숫자입니다.");
//} else {
//System.out.println(value+"는 숫자가 아닙니다.");
//}
//} // end of main
//} // end of class
//[실행결과]
//2*1=2 3*1=3 4*1=4
//2*2=4 3*2=6 4*2=8
//2*3=6 3*3=9 4*3=12
//5*1=5 6*1=6 7*1=7
//5*2=10 6*2=12 7*2=14
//5*3=15 6*3=18 7*3=21
//8*1=8 9*1=9
//8*2=16 9*2=18
//8*3=24 9*3=27
//[실행결과]
//12o34는 숫자가 아닙니다.
//Java의 정석定石 3판 - 연습문제 풀이 19
//[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력
//해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자
//신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면
//게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프
//로그램을 완성하시오.
		int answer = (int)(Math.random()*100+1);
		int input = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		do { System.out.println("숫자를 입력해주세요");
			 input = sc.nextInt();
			 count++;
			 if(input<answer){
				 System.out.println("더 큰 값을 입력해주세요");
			 } else if(input>answer){
				 System.out.println("더 작은 값을 입력해주세요");
			 } else {
				 System.out.println("정답입니다");
				 System.out.println(count+"번째 성공");
				 break;
			 }
		} while(true);
//[연습문제]/ch4/Exercise4_14.java
//class Exercise4_14
//{
//public static void main(String[] args)
//{
//// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
//int answer = /* (1) */;
//int input = 0; // 사용자입력을 저장할 공간
//int count = 0; // 시도횟수를 세기위한 변수
//// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
//java.util.Scanner s = new java.util.Scanner(System.in);
//do {
//count++;
//System.out.print("1과 100사이의 값을 입력하세요 :");
//input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
///*
//(2) 알맞은 코드를 넣어 완성하시오.
//*/
//} while(true); // 무한반복문
//} // end of main
//} // end of class HighLow
//[실행결과]
//1과 100사이의 값을 입력하세요 :50
//더 큰 수를 입력하세요.
//1과 100사이의 값을 입력하세요 :75
//더 큰 수를 입력하세요.
//1과 100사이의 값을 입력하세요 :87
//더 작은 수를 입력하세요.
//1과 100사이의 값을 입력하세요 :80
//더 작은 수를 입력하세요.
//1과 100사이의 값을 입력하세요 :77
//더 작은 수를 입력하세요.
//1과 100사이의 값을 입력하세요 :76
//맞췄습니다.
//시도횟수는 6번입니다.	
//		
//		int x = 0;
//		int x2 = 0;
//		int y = 0;
//		int sum = 0;
//		while(sum<=100){ 
//			x++;
//			sum += x - y;
//			y+=2;
//			if(sum==100){
//				x2 = x;
//				break;
//			}
//			x++;
//		}System.out.println(x2);
//		int x = 1;
//		int y = 2;
//		for(int i=1; i<7; i++){
//				System.out.println(x+","+i + "\t" + y+","+i);
//			}
//		System.out.println();
//		for(int j=1; j<7; j++){
//			for(int j2=1; j2<7; j2++){
//				if(j+j2==6){
//					System.out.println(j+","+j2);	
//				}
//			}
//		}
//			
		
		}
}
		//[실행결과]
		//1과 100사이의 값을 입력하세요 :50
		//더 큰 수를 입력하세요.
		//1과 100사이의 값을 입력하세요 :75
		//더 큰 수를 입력하세요.
		//1과 100사이의 값을 입력하세요 :87
		//더 작은 수를 입력하세요.
		//1과 100사이의 값을 입력하세요 :80
		//더 작은 수를 입력하세요.
		//1과 100사이의 값을 입력하세요 :77
		//더 작은 수를 입력하세요.
		//1과 100사이의 값을 입력하세요 :76
		//맞췄습니다.
		//시도횟수는 6번입니다.	
//				
		
//		System.out.println("sum="+sum);
//		}
//	}
//		int sum = 0;
//		int sum2 = 0;
//			for(int i=1; i<11; i++){
//			sum = sum+ i;
//			sum2 += sum;
//			}System.out.println(sum2);
//			}
//			}
