package Y_exam;

public class Exam_05java {

	public static void main(String[] args) {
		//5-1
//		a.int[] arr[]; 2차원 배열선언 중에 1가지에 해당함. 오류는 아님.
//		int[][] / arr[][] / int[] arr[]
//		b.int[] arr={1,2,3,}; ,뒤에 공란으로 둬도 컴파일 오류 없음. 널값도 아님.
//		c.int[] arr=new int[5]; 선언과 생성을 동시에 한 것. 각 방엔 int의 기본 값인 '0'이 저장되어 있음
//		d.int[] arr=new int[5]{1,2,3,4,5}; c번과 똑같이 선언과 생성을 같이 한 것인데, 크기를 정하는 부분에서 int[크기]와 int{값} 둘 중 하나만 선택가능.
//		e.int arr[5]; 생성을 하려면 new를 무조건 해줘야 한다. 선언이라고 하기엔 [크기]가 입력되어 있기 때문에 안됨. 
//		f.int[] arr[]=new int[3][]; 
				
				
				

		//5-2. 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가? - 4.
//		int[][] arr={
//				{5,5,5,5,5},
//				{10,10,10},
//				{20,20,20,20},
//				{30,30}
//		};
		
		//5-3 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오. sum = 150
//		int[] arr={10,20,30,40,50};
//		int sum=0;
//		
//		for(int i=0; i<arr.length; i++){
//			sum+=arr[i];
//		}
//		System.out.println("sum="+sum);
		
		//5-4 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오. total=325/
//		int[][] arr={
//				{5,5,5,5,5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//		};
//		
//		int total=0;
//		float average=0;
//		
//		for(int i=0; i<arr.length; i++){
//			for(int j=0; j<arr[i].length; j++){
//				total+=arr[i][j];
//			}
//		}
//		
//		average = (float)total/(arr[0].length*arr.length);
//
//		
//		System.out.println("total="+total);
//		System.out.println("average="+average);
//		
		
		

		
		//5-5
//		int[] ballArr = {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
//		for(int i=0; i< ballArr.length;i++) {
//			int j = (int)(Math.random() * ballArr.length);
//			int tmp = 0;
//			tmp = ballArr[i];
//			ballArr[i] = ballArr[j];
//			ballArr[j] = tmp;
//		}
//		 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
//		for(int i=0;i<ball3.length;i++) {
//				ball3[i]=ballArr[i];
//				System.out.print(ball3[i]);
//		}
		
//		[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변
//		수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하
//		라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서
//		프로그램을 완성하시오.
//		[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
//		[연습문제]/ch5/Exercise5_6.java
//		class Exercise5_6 {
//		public static void main(String args[]) {
//		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		System.out.println("money="+money);
//		for(int i=0;i<coinUnit.length;i++) {
//			int count = money/coinUnit[i];
//			money = money%coinUnit[i];	
//			System.out.println(coinUnit[i]+"원:"+count);
//			}
//		
//		*/ }
//		} 
//		}
//		[실행결과]
//		money=2680
//		500원: 5
//		100원: 1
//		50원: 1
//		10원: 3
		
		//5-7
//		if(args.length!=1) {
//			System.out.println("USAGE: java Exercise5_7 3120");
//			System.exit(0);
//			}
//			// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
//			int money = Integer.parseInt(args[0]);
//			System.out.println("money="+money);
//			int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
//			int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
//			for(int i=0;i<coinUnit.length;i++) {
//			int coinNum = 0;
////			 (1) 아래의 로직에 맞게 코드를 작성하시오.
////			1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
//			coinNum = money/coinUnit
////			2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
////			(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
////			3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
//			
//			System.out.println(coinUnit[i]+"원: "+coinNum);
//			}
//			if(money > 0) {
//			System.out.println("거스름돈이 부족합니다.");
//			System.exit(0); // 프로그램을 종료한다.
//			}
//			System.out.println("=남은 동전의 개수 =");
//			for(int i=0;i<coinUnit.length;i++) {
//			System.out.println(coinUnit[i]+"원:"+coin[i]);
//			}
		
		//5-11
//				int[][] score = {
//				{100, 100, 100}
//				, {20, 20, 20}
//				, {30, 30, 30}
//				, {40, 40, 40}
//				, {50, 50, 50}
//				};								//+1은 합계값			+1은 합계값
//				int[][] result = new int[score.length+1][score[0].length+1];
//				for(int i=0; i < score.length;i++) {
//					for(int j=0; j < score[i].length;j++) {
//						score[i][j]+=score[j][i];
//						System.out.println(score[i][j]);
//				
//				
//				
//				 }
//				}
//				for(int i=0; i < result.length;i++) {
//					for(int j=0; j < result[i].length;j++) {
//						System.out.printf("%4d",result[i][j]);
//					}
//					System.out.println();
//				}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		
//		int a = Integer.parseInt(args[0]);
		
		
		
	}

}
