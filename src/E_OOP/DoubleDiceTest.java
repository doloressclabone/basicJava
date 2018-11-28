package E_OOP;

import java.util.*;

public class DoubleDiceTest {
	public static void main(String[] args) {
	//throwDice 메소드를 호출하여라
		DoubleDice td = new DoubleDice();
		td.print();
		int result = td.throwDice();
		System.out.println(result+"만큼 이동하세요");
	}
}





class DoubleDice{
	
	Scanner sc = new Scanner(System.in);
	void print(){
		System.out.println("던지겠습니까?  준비되면 Yes 입력해");
		String str = sc.next();
	}
	
	int result = 0;
	
	int throwDice(){
	int c = (int)(Math.random()*6+1);
	System.out.println("첫번째 주사위 :"+c);
	int d = (int)(Math.random()*6+1);
	System.out.println("두번째 주사위 :"+d);
		if(c==d){
			result += c+d+throwDice();
		} else{
			result = c+d;
		}
		return result;
	}
	
	//인스턴스메소드 throwDice
	//주사위를 두개를 던진다(랜덤필요)
	//던진 수의 합을 리턴한다
	//같은 수가 나오면 한번 더 던진다
	
}