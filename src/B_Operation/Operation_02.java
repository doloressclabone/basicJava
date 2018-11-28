package B_Operation;

//public class Operation_02 {
//	public static void main(String [] args){
		
	/*	int i1 = 50;
		System.out.println(i1);
		i1++;
		System.out.println(i1);
		++i1;
		System.out.println(i1);
		
		int i2 = 10;
		int i3 = ++i2 + 5;
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i2+" : "+i3);
		/*
		 		   i2=11
		 		   11 + 5
		 */
	/*	int i4 = 11;
		int i5 = 6 + i4++;
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i4 + " : " + i5);
		
		int i6 = 20;
		int i7 = 30;
		int i8 = ++i6 + 5 + i7++ + i6++;
		
		byte b1 = 10;
		int i10 = ~b1;
		System.out.println(i10);
		
		boolean power = true;
		power = !power;
		System.out.println(power);
		
		int a=5/1;
		
		byte aa1 = 10;
		short aa2 = 250;
		int result = aa1+aa2;
		System.out.println(result);
		
		float aa3 = 3.141592f;
		float result2 = aa3 + result;
		System.out.println(result2);
		
//		'초'글자와 '연'글자의 합계를 구해주세요
		
		char aa = '초';
		char bb = '연';
		int as1 = aa;
		int as2 = bb;
		
		int result3 = as1 + as2;
		System.out.println(result3);
		
		int ab2 = 10;
		int ab1 = 8;
		int share = ab1/ab2;
		int remain = ab1%ab2;
		System.out.println(share);
		System.out.println(remain);
		
//		위의 변수 4개를 전부 활용하세요
//		10을 8로 나눈 몫은 1이고 나머지는 2이다
		System.out.println(ab1+"을 "+ab2+"로 나눈 몫은 "+share+"이고"+" 나머지는 "+remain+"이다");
				
		System.out.println(5>40);
		
		System.out.println("3^5 =>" + (3^5));
		System.out.println("3|5 =>" + (3|5));
		System.out.println("3&5 =>" + (3&5));
		
//		1.'J'를 저장할 수 있는 변수 ab4를 선언 및 초기화 해주세요.
		
		char ab4 = 'J';
				
//		2.ab4의 값이 대문자 일때 true의 결과를 얻는 조건식을 만드세요.
		System.out.println('A'<=ab4 && ab4 <= 'Z');
		
//		3.ab4의 값이 소문자 일때 false의 결과를 얻는 조건식을 만드세요.
		System.out.println('a'<=ab4 && ab4 <= 'z');
		
//		4.ab4의 값이 영어인지 아닌지 알아내!.
		System.out.println('A'<=ab4 && ab4 <= 'Z'||'a'<=ab4 && ab4 <= 'z');
		
//		6.ab4의 값이 숫자인가?
		System.out.println('0'<=ab4 && ab4 <= '9');
		
//		7.
		
		int x = 10;
		int absx = x>0?x:-x;
		System.out.println(absx);
		
		float x2 = 37.65f;
		int result5 = (int)(x2+0.5);
		System.out.println(result5);
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		float x3 = 37.1547f;
		float result6 = (float)(x3+0.0005);
		System.out.println(result6);
		
		
		
//		Math.random()
		/*
		 1~6
		 포함-미포함 : 1~7
		 뒤-앞 : 6
		 시작 : 1
		 */
		
		/*int result8=(int)(Math.random()*6+1);
		System.out.println(result8);
	
		
//		Exercise 3_1
//		int x = 2;
//		int y = 5;
//		char c = 'A'; // 'A'의 문자코드는 65
//		System.out.println(1 + x << 33);
//		System.out.println(y >= 5 || x < 0 && x > 2);
//		System.out.println(y += 10 - x++);
//		System.out.println(x+=2);
//		System.out.println( !('A' <= c && c <='Z') );
//		System.out.println('C'-c);
//		System.out.println('5'-'0');
//		System.out.println(c+1);
//		System.out.println(++c);
//		System.out.println(c++);
//		System.out.println(c);
		
		
//		class Exercise 3_2 {
//		[3-2] 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
//		사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
//		가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
//		[연습문제]/ch3/Exercise3_2.java
//		class Exercise3_2 {
//		public static void main(String[] args) {
//		int numOfApples = 123; // 사과의 개수
//		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
//		int numOfBucket = ( /* (1) */ ); // 모든 사과를 담는데 필요한 바구니의 수
//		System.out.println("필요한 바구니의 수 :"+numOfBucket);
//		}
//		}
		
	/*  char ch = 'z';
		boolean b = ('a'<=ch&&ch>='z'&&'A'<=ch&&ch>='Z');
		System.out.println(b);
		
//		class Exercise3_10 {
//			public static void main(String[] args) {
//			char ch = 'A';
//			char lowerCase = ( /* (1) */ ) ? ( /* (2) */ ) : ch;
//			System.out.println("ch:"+ch);
//			System.out.println("ch to lowerCase:"+lowerCase);
//			}
//			}
//			[실행결과]
//			ch:A
//			ch to lowerCase:a
		
		
		
		//charlowerCase = 'a'<=ch&&ch>='z'
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
