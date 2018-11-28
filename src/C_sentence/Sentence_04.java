package C_sentence;

import java.util.Scanner;

public class Sentence_04 {
	public static void main(String[] args) {
		
		for(;;){
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요");
			int str = sc.nextInt();
			System.out.println("사칙연산을 입력해주세요");
			String result = sc.next();
			System.out.println("숫자를 입력해주세요");
			int str2 = sc.nextInt();
			if(result.equals("x")||(result.equals("X"))){
				break;
			} else if(result.equals("+")){
				System.out.println(str + str2);
			} else if(result.equals("-")){
				System.out.println(str - str2);
			} else if(result.equals("*")){
				System.out.println(str * str2);
			} else if(result.equals("/")){
				System.out.println(str / str2);
			} 
			
		}
		
		
		Scanner sc = new Scanner(System.in);
		for (String buho = ""; !buho.equals("x");){
			System.out.println("첫번째 숫자 입력 : ");
			int numberOne = sc.nextInt();
			
			System.out.println("부호 +, -, *, / 중 하나를 입력하세요");
		}
		
		
		
		
		
		
		
		
	
	}
}