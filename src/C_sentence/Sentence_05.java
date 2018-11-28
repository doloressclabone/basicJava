package C_sentence;

import java.util.Scanner;

public class Sentence_05 {
	public static void main(String[] args) {
		/*
		 1.while문
		 -반복횟수를 모를 때 사용된다.
		 -조건식과 수행해야될 블럭{}으로 구성되어 있다.
		 -for문은 while문으로 while문은 for문으로 변환이 가능하다. 
		 -구조
		  while(조건식){
		  
		  }
		 
		
		int sum = 0;
		for(int i = 5; i<16; i++){
			sum += 1;
		}
		System.out.println(sum);
		
		for(int i = 0; i<11; i++){
			System.out.println(i);
		}
		
		int i = 0;
		while(i<11){
			System.out.println(i);
			i++;
		}
		*/
		//1.3~33까지의 합계를 구하세요.
//		int i = 3;
//		int sum = 0;
//		while(i<34){
//			if(i%2==0){
//			sum += i; 
//			}
//			i++;
//		} System.out.println(sum);
		
		//2. for문으로 구구단 찍기
	
//	for(int i=2;i<10;i++){
//		for(int i2=1;i2<=i;i2++){
//			System.out.println(i+"*"+i2+"="+(i*i2));
//		}
//	}

/*	int i = 1;
	int i3 = 1;
	while(i<9){
		i++;
		while(i3<10){
			System.out.println(i+"*"+i3+"="+i*i3);
			i3++;
			}if(i3==10){//i3=1;만 해도 됨.
				i3=1;
			}
		}
	}*/
//		int x = 2;
//		while (x < 10) {
//			int y = 1;
//			if (x % 2 == 0) {
//				while (y < 10) {
//					if (y % 2 == 1) {
//						System.out.println(x + "*" + y + "=" + x * y);
//						y++;
//					}
//					x++;
//				}
//			}
//
//		}
		
//		int x = 2;
//		while(x < 10){
//			int y = 1;
//			while(y < 10){
//				if(x%2==0 && y%2==1){
//					System.out.println(x+"*"+y+"="+x*y);
//				}
//				y++;
//			}
//			x++;
//		}
		
		//3.1~100 더했을 때 합계가 100 이상이 되는가?
		int b = 0;
		int b1 = 0;
		while(b1<101){
			b++;
			b1 += b;
		} System.out.println(b);
		
		int aa = 0;
		int sum = 0;
		
		while(sum<100){
			aa++;
			sum += aa;
			}
		System.out.println(aa);
		
//		9404-1845 영만쌤 깨떡~
		
//		//4. 사용자로부터 시작하는 숫자와 끝나는 숫자를 입력받으세요.
//		Scanner sc = new Scanner(System.in);
//		//5. 시작하는 숫자부터 끝나는 숫자 중 5의 배수의 합계를 구하세요.
//		//단 while문을 이용하세요
//		System.out.println("시작하는 숫자");
//		int x = sc.nextInt();
//		System.out.println("끝나는 숫자");
//		int y = sc.nextInt();
//		
//		while(x<y){
//			if(x<y&&x%5==0){
//				System.out.println(x+"+"+y+x+y);
//			} else if (x%5==0||y%5==0){
//				break;
//			}
//		}
//		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작하는 숫자를 입력하세요");
		int startNum = sc.nextInt();
		System.out.println("끝나는 숫자를 입력하세요");
		int endNum = sc.nextInt();
		int sum2 = 0;
		
		while(startNum<endNum+1){
			if(startNum%5==0){
				sum2 += startNum;
			}
			startNum++;
		}
		
		System.out.println(sum2);
		
		
		
		
		

}
}