package E_OOP;

class Data{
	int x;
}

public class InterVari {
	public static void main(String[] args) {
	//1.Data의 객체를 만들어주세요 d1
		Data d1 = new Data();
		
	//2.d1의 x값을 10으로 변경해주세요
		d1.x = 10;
	//3.출력 => main()기본형 : d1의 x값
		System.out.println("main()기본형 :"+d1.x);
	//4.change(d1의 x값)
		InterVari ch = new InterVari();
		ch.change(d1);
	//4.5 출력 => after main()기본형 : d1의 x값
		System.out.println("after main()기본형 :"+d1.x);
	//5.Data의 객체를 만들어주세요 d2
		Data d2 = new Data();
	//6.d2의 x값을 10으로 변경해주세요
			d2.x = 10;
	//7.출력 => main()참조형 : d2의 x값
			System.out.println(d2.x);
		ch.change(d2);
	//8.출력 => change(d2)
		System.out.println("after main()기본형 :"+d1.x);
		
}

	void change(int x){
		x=1000;
		System.out.println("change()기본형 :"+x);
	}

	void change(Data d1){
		d1.x=1000;
		System.out.println("change()참조형 :" + d1.x);
	}



}