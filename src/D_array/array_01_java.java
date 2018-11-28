package D_array;

import java.util.Arrays;
import java.util.Scanner;

public class array_01_java {
	public static void main(String[] args) {
//		
//		  1.배열(Array)이란? -같은 타입의 여러 변수를 하나의 묶음으로 다루는 것.
//			ex)5명의 점수 int score = 100; int score = 90; int score = 50; int score = 67; int score = 88;
//		 	 같은 라면 타입을 묶어주는 역할.
//		  
//		  2.배열의 선언 총 2가지 -원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 []를 붙여준다. int[]
//		 	 a1;
//		  
//		  3.배열의 생성 -배열을선언한 다음에는 배열을 생성해야 한다. -배열생성을 위해서는 'new'연산자와 함께 배열의 타입과
//		 	크기를 지정해 주면 된다.
//		 
//		// int[] a1; //타입에 붙이는 형태로 많이 쓰임
//		// int a2[];
//		// int[] a = new int[3]; //int를 3개 넣을 수 있다는 의미.
//		// int[] a3 = new int[]{3,4,5}; //초기값을 넣어 생성할 때는 대괄호를 공란으로 둔다.
//		// int[] a5;
//		// a5 = new int[]{3,4,5};
//		// int[] a4 = new int[]
//		// int[] a6 = {3,4,5};
//		//
//		// int[] score = new int[7];
//		// System.out.println(score[0]);
//		// System.out.println(score[1]);
//		// System.out.println(score[2]);
//		// System.out.println(score[3]);
//		//
//		// System.out.println();
//		//
//		// for(int i = 0; i <score.length; i++){
//		// System.out.println(score[i]);
//		// }
//		//
//		// //1. score의 0번째 방에 10을 저장해주세요.
//		// score[0]=10;
//		// //2. score의 1번째 방에 20을 저장해주세요.
//		// score[1]=20;
//		// //3. score의 2번째 방에 30을 저장해주세요.
//		// score[2]=30;
//		// //4. score의 3번째 방에 40을 저장해주세요.
//		// score[3]=40;
//		//
//		// for(int j=0; j<score.length; j++){
//		// score[j]=(j+1)*10;
//		// }
//		//
//		// 1.207호의 자바초급 점수를 저장할 수 있는 변수를 선언 및 생성해주세요.
//		// int[] score = new int[17];
//		// 2.각 사람의 점수를 0~100점 사이의 랜덤한 정수값으로 저장해주세요.
//		// 랜덤하게 만들어서 점수, 랜덤하게 만들어서 점수(매스랜덤.필요없음)
//		// score[0]=1;
//		// score[1]=2;
//		// score[2]=3;
//		// score[3]=4;
//		// score[4]=5;
//		// score[5]=6;
//		// score[6]=7;
//		// score[7]=8;
//		// score[8]=9;
//		// score[9]=10;
//		// int sum = 0;
//		// for(int i=0;i<score.length;i++){
//		// score[i]=(int)(Math.random()*100+1);
//		// sum += score[i];
//		// 2-2 각 사람의 점수를 출력해주세요.
//		// System.out.println((i+1)+"번 사람의 점수는 "+score[i]+"입니다");
//		// 3.모든 사람의 합계를 구해주세요.
//		// int sum = 0;
//		// sum+=b1[0];
//		// sum+=b1[1];
//		// sum+=b1[2];
//		// sum+=b1[3];
//		// sum+=b1[4];
//		// sum+=b1[5];
//		// sum+=b1[6];
//		// sum+=b1[7];
//		// sum+=b1[8];
//		// sum+=b1[9];
//		// sum+=b1[10];
//		// sum+=b1[11];
//		// sum+=b1[12];
//		// sum+=b1[13];
//		// sum+=b1[14];
//		// sum+=b1[15];
//		// sum+=b1[16];
//		// System.out.println(sum);
//
//		// 1.사용자로부터 7개의 숫자를 입력받아서 저장할 수 있는 변수 input을 선언 및 생성해주세요
//		int[] input = new int[7];
//		int sum = 0;
//		int i;
//		// 2.input변수의 각각의 방을 사용자로부터 입력받아 저장해주세요
//		Scanner sc = new Scanner(System.in);
//		for (i = 0; i < input.length; i++) {
//			System.out.println((i) + "번째 방에 값을 입력해주세요");
//			int result = sc.nextInt();
//			input[i] = result;
//		}
//		
//		//3.입력값을 출력해주세요.
//		for (i = 0; i < input.length; i++) {
//			System.out.println((i)+"번째 방에 저장된 값 : "+input[i]);
//		}
////		
////		//4.입력값들의 합계를 구해주세요.
////		for (int i=0; i<input.length; i++){
////			sum += input[i];
////		} System.out.println(sum);
////		
//		//5.평균값을 구해주세요.
//		for(i=0; i<input.length; i++){
//			sum += input[i];
//		} 
//		System.out.println(sum);
//		
//		float avg = (int)((float)sum/input.length*100+0.5)/100f;
//		System.out.println(avg);
//		
//		//6.최대값을 구하시오.
//		int max = input[0];
//		if(max < input[1]){
//			max = input[1];
//		}
//		if(max < input[2]){
//			max = input[2];
//		}
//		if(max < input[3]){
//			max = input[3];
//		}
//		if(max < input[4]){
//			max = input[4];
//		}
//		if(max < input[5]){
//			max = input[5];
//		}
//		if(max < input[6]){
//			max = input[6];
//		}
//		for(i =0;i<input.length;i++){
//			if(max < input[i]){
//				max = input[i];
//			}
//		}System.out.println(max);
//		
//		int min = input[0];
//		for(i=0;i<input.length;i++){
//			if(min > input[i]){
//				min = input[i];
//			}
//		}System.out.println(min);
//		
//		int[] lotto = new int[6];
//		for(int i = 0; i<lotto.length; i++){
//			int lottoNum = (int)(Math.random()*45+1);
//			lotto[0] = lottoNum;
//			for(int j=0; j<lotto.length; j++){
//				
//			}
//		int max;
//		int min;
//		int tem;
//		int i;
//		System.out.println("최댓값 최솟값 구하기");
//		int[] a = {5,2,3,1,4};
//		max = a[0];
//		for(i=0;i<a.length-1; i++){
//			if(max < a[i]){
//				max = a[i];
//			}//System.out.println(max);
//		}
//		min = a[0];
//		for(i=0;i<a.length-1; i++){
//			if(min > a[i]){
//				min = a[i];
//			}
//		
//		}
//		for(i=0;i<a.length-1;i++){	
//			if(min!=max){
//				tem=max;
//				a[i]=min;
//				min=max;
//				System.out.println(a[i]);
//			}
//		}
		
//		int[] arr = {5,2,3,1,4};
//		
//		int min = arr[0];
//		int minBang = 0;
//
//			for(int j = 1; j<arr.length; j++){
//				if(min>arr[j]){
//					min = arr[j];
//					minBang = j;
//	
//					int tem = arr[0];
//					arr[0] = arr[minBang];
//					arr[minBang] = tem;
//					System.out.println(Arrays.toString(arr));// for(int i=0; i
//					}
//			}
//			
//			min = arr[1];
//			minBang = 1;
//			for(int j = 1; j<arr.length; j++){
//				if(min>arr[j]){
//					min = arr[j];
//					minBang = j;
//	
//					int tem = arr[1];
//					arr[1] = arr[minBang];
//					arr[minBang] = tem;
//					System.out.println(Arrays.toString(arr));
//					}
//			}
//			min = arr[2];
//			minBang = 2;
//			for(int j = 2; j<arr.length; j++){
//				if(min>arr[j]){
//					min = arr[j];
//					minBang = j;
//	
//					int tem = arr[2];
//					arr[2] = arr[minBang];
//					arr[minBang] = tem;
//					System.out.println(Arrays.toString(arr));
//					}
//			}
//			min = arr[3];
//			minBang = 3;
//			for(int j = 3; j<arr.length; j++){
//				if(min>arr[j]){
//					min = arr[j];
//					minBang = j;
//	
//					int tem = arr[3];
//					arr[3] = arr[minBang];
//					arr[minBang] = tem;
//					System.out.println(Arrays.toString(arr));
//					}
//			}
			for(int j = 3; j<arr.length; j++){
//				if(min>arr[j]){
//					min = arr[j];
//					minBang = j;
//
//				int tem = arr[3];
//				arr[3] = arr[minBang];
//				arr[minBang] = tem;
//				System.out.println(Arrays.toString(arr));
//				}
//		}
	}			
}
	