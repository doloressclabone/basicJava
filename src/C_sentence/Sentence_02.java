package C_sentence;

import java.util.Scanner;

public class Sentence_02 {
	public static void main(String[] args) {
	/*
	1.반복문(for, while, do-while)
	-어떤 작업이 반복적으로 수행되도록 할 때 사용된다.
	-반복문은 주어진 조건이 만족되는 동안 반복적으로 수행함으로 조건식을 포함한다.
	-for문은 주로 반복횟수를 알고 있을 때 while문은 반복횟수를 모를 때 사용된다.
	*/
	/*System.out.println(0);
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	System.out.println(4);
	System.out.println(5);
	System.out.println(6);
	System.out.println(7);
	System.out.println(8);
	System.out.println(9);
	System.out.println(10);
	
	System.out.println(11);
	System.out.println(12);
	System.out.println(13);
	System.out.println(14);
	System.out.println(15);
	System.out.println(16);
	System.out.println(17);
	System.out.println(18);
	System.out.println(19);
	System.out.println(20);
	
	System.out.println(21);
	System.out.println(22);
	System.out.println(23);
	System.out.println(24);
	System.out.println(25);
	System.out.println(26);
	System.out.println(27);
	System.out.println(28);
	System.out.println(29);
	System.out.println(30);
	
	System.out.println(31);
	System.out.println(32);
	System.out.println(33);
	System.out.println(34);
	System.out.println(35);
	System.out.println(36);
	System.out.println(37);
	System.out.println(38);
	System.out.println(39);
	System.out.println(40);
	
	System.out.println(41);
	System.out.println(42);
	System.out.println(43);
	System.out.println(44);
	System.out.println(45);
	System.out.println(46);
	System.out.println(47);
	System.out.println(48);
	System.out.println(49);
	System.out.println(50);
	
	System.out.println(51);
	System.out.println(52);
	System.out.println(53);
	System.out.println(54);
	System.out.println(55);
	System.out.println(56);
	System.out.println(57);
	System.out.println(58);
	System.out.println(59);
	System.out.println(60);
	
	System.out.println(61);
	System.out.println(66);
	System.out.println(63);
	System.out.println(64);
	System.out.println(65);
	System.out.println(66);
	System.out.println(67);
	System.out.println(68);
	System.out.println(69);
	System.out.println(70);
	
	System.out.println(71);
	System.out.println(72);
	System.out.println(73);
	System.out.println(74);
	System.out.println(75);
	System.out.println(76);
	System.out.println(77);
	System.out.println(78);
	System.out.println(79);
	System.out.println(80);
	
	System.out.println(81);
	System.out.println(82);
	System.out.println(83);
	System.out.println(84);
	System.out.println(85);
	System.out.println(86);
	System.out.println(87);
	System.out.println(88);
	System.out.println(89);
	System.out.println(90);
	
	System.out.println(91);
	System.out.println(92);
	System.out.println(93);
	System.out.println(94);
	System.out.println(95);
	System.out.println(96);
	System.out.println(97);
	System.out.println(98);
	System.out.println(99);
	System.out.println(100);*/
		
	/*2. for문
	  -기본구조
	  for(1:초기화(시작점);2:조건식(끝);3:증감식)<-3개의 조건식이 들어감{
		  수행될 문장
	  }
	초기 -> 조건식 -> 수행 -> 증감식 -> 조건식 -> 수행 -> 증감식 -> 조건식 -> 수행*/
	
	//초기화 : 출력되는 가장 작은 수 / int x=0
	//조건식 : 출력되는 가장 큰 수 + 1 / 11>x
	//증감식 : x++
	//수행될문장 : System.out.println(x);
	
	/*for(int i=0; i<11; i++){
		System.out.println(i);
	}
	
	for(int i=0; i<11; i++){
		if(i%2!=0&&i!=0){//i%2=1
			System.out.println(i);
		}
	}
		
//3.스캐너
//	Scanner sc = new Scanner(System.in);
//	System.out.println("숫자를 입력해주세요");
// 	String str = sc.next();
//	System.out.println(str);
//	int result = sc.nextInt();
//	System.out.println(result);

		
	//1.사용자로부터 숫자를 입력받아서 0~입력받은수까지 출력해주세요.
//	for(int i=0; i<result+1; i++){
//		System.out.println(i);
//	}
//	
	//2.5~15까지의 합계를 구하세요.
//	sum += 5;
//	sum += 6; 
//	sum += 7;
//	sum += 8;
//	sum += 9;
//	sum += 10;
//	sum += 11;
//	sum += 12;
//	sum += 13;
//	sum += 14;
//	sum += 15;
	
	/*int sum = 0;
	초기값 : 0
	조건식 16>
	공통좀 sum+=
	for(int i=5; i<16; i++){
		sum += i;
		System.out.println(sum);
	}
	
	//2.6에서 사용자가 입력한 수까지의 홀수의 합을 구하세요.*/
	
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력해주세요");
	int result = sc.nextInt();
	System.out.println(result);
	
	int sum = 0;
	for(int i=6; i<result+1; i++){
		if(i%2==1){
			sum += i;
		}
	}
	System.out.println(sum);
	
	//Scanner sc = new Scanner(System.in);
	//System.out.print("숫자를 입력하시오")
	//int result = sc.nextInt();
	//System.out.print(result);

	//Scanner sc = new Scanner(System.in);
	//System.out.print("숫자를 입력해주시오");
	//int result = sc.nextInt();
	//System.out.println(result);
	
	//Scanner sc = new Scanner(System.in);
	//System.out.println("숫자를 입력하시오");
	//int result = sc.nextInt();
	//System.out.println(result);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
