package D_array;

public class Arrary_03java {

	public static void main(String[] args) {
		/*
		 1.다차원배열
		 -자바에서는 1차원 배열뿐만아니라 2차원 이상의 다차원 배열도 허용한다.
		 -2차원 배열의 선언
		  선언방법
		  변수타입[] 변수명; / 변수타입 변수명[] <- 1차
		  변수타입[][] 변수명; / 변수타입[] 변수명[]; / 변수타입 변수명[][] <- 2차원		  
		 -2차원 배열의 생성
		 new 변수타입[?][?];
		 */

//		int[][] a = new int[3][4];
		//큰 배열안에 작은 배열이 3개 들었다. 각각의 작은 배열안에는 4개씩 들어있다.
//		int[][] b = new int[3][];
//		a[0] = new int[2];
//		a[1] = new int[3];
//		a[2] = new int[4];
		//큰 배열안에 작은 배열이 3개 들었다. 각각의 작은 배열의 크기는 정해져 있지 않았다. 이때 null로 선언되었다고 한다.
		//2차원 배열 'a'를 선언한다.
		int[][] a = new int[3][];
//		System.out.print(c[0][0]);
//		System.out.println(c[0][1]);
//		System.out.print(c[1][0]);
//		System.out.print(c[1][1]);
//		System.out.println(c[1][2]);
//		System.out.print(c[2][0]);
//		System.out.print(c[2][1]);
//		System.out.print(c[2][2]);
//		System.out.println(c[2][3]);
//		
//		for(int i=0; i<c[0].length; i++){
//			System.out.println(c[0][i]);
//		}
//		for(int i=0; i<c[1].length; i++){
//			System.out.println(c[1][i]);
//		}
//		for(int j=0; j<c.length; j++){
//			for(int i=0; i<c[j].length; i++){
//				System.out.println(c[j][i]);
//			}
//		}
		
		//변수 a의 각 방에 10,20,30,40,...90까지 입력해주세요.
//		new int[][]{{10,20},{30,40,50},{60,70,80,90}};
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];
		
//		a[0][0] = 10;
//		a[0][1] = 20;
//		a[1][0] = 30;
//		a[1][1] = 40;
//		a[1][2] = 50;
//		a[2][0] = 60;
//		a[2][1] = 70;
//		a[2][2] = 80;
//		a[2][3] = 90;
		int k = 10;
//		System.out.println(a[0][0]);
//		System.out.println(a[0][1]);
//		System.out.println(a[1][0]);
//		System.out.println(a[1][1]);
//		System.out.println(a[1][2]);
//		System.out.println(a[2][0]);
//		System.out.println(a[2][1]);
//		System.out.println(a[2][2]);
//		System.out.println(a[2][3]);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=k;
				k+=10;
				System.out.println(a[i][j]);
			}
		}
	}		
}