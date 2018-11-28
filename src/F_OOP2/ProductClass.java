package F_OOP2;

import java.util.Vector;

public class ProductClass {
	public static void main(String[] args) {
		Tv2 t2 = new Tv2("LGTV", 700);
		System.out.println(t2);
		NoteBook nb = new NoteBook("Mac", 400);
		Microwave mw = new Microwave("LG전자렌지", 200);
		Product p = new Product("LG스타일러",200);
		Buyer b = new Buyer("이상엽", 10000);

		b.buy(nb); 
		b.buy(nb);
		b.buy(nb);
		b.buy(mw);
		
		b.summary();
		System.out.println("마지막으로 산 물품 : "+b.item.get(2));
		System.out.println("호갱님의 잔여금은 "+b.money+"만원이고, 보너스포인트는 "+ b.bonusPoint+"만원입니다");
		
		b.refund(nb);
		b.refund(mw);
		b.refund(t2);
		
		b.summary();
		
	}
}

class Product{
	String name;
	int price;
	int bonusPoint;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
		bonusPoint = price/10;
	}
}

class Tv2 extends Product{
	Tv2(String name, int price){
		super(name, price);
	}

	@Override
	public String toString() { //toString메소드가 기본적으로 주어짐(object의 13가지 메소드 중 하나.) 일반적으로 주소를 찍어주나 주소를 찍어주는게 마음에 들지 않아서 리턴을 name으로 지정을 해주기 때문에 LGTV가 나온 것임!
		return name; 
	}
}
	
class NoteBook extends Product{
	NoteBook(String name, int price){
		super(name, price);
	}

	@Override
	public String toString() { //toString메소드가 기본적으로 주어짐(object의 13가지 메소드 중 하나.) 일반적으로 주소를 찍어주나 주소를 찍어주는게 마음에 들지 않아서 리턴을 name으로 지정을 해주기 때문에 LGTV가 나온 것임!
		return name; 
	}
}

class Microwave extends Product{
	Microwave(String name, int price){
		super(name, price);
	}

	@Override
	public String toString() { //toString메소드가 기본적으로 주어짐(object의 13가지 메소드 중 하나.) 일반적으로 주소를 찍어주나 주소를 찍어주는게 마음에 들지 않아서 리턴을 name으로 지정을 해주기 때문에 LGTV가 나온 것임!
		return name; 
	}	
}

class Buyer{
	String name;
	int money;
	int bonusPoint;
	Vector<Product> item = new Vector<Product>();
	
	Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	void buy(Product p){
		if(money<p.price){
			System.out.println("손님 이건 신제품이라^^;;");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"를 구매하셨습니다^^");
		item.add(p);
	}
	
	void refund(Product p){
		if(item.isEmpty()){
			System.out.println("구매하신 물품이 없습니다");
		}
		
		for(int i=0; i<item.size(); i++){
//			if(item.get(i)==p){
//				Product p2 = (Product)item.remove(i);
//				// item.remove(p); // 하나만 반품해야 할 때는 가능하나 3개 중 1개 일땐 불가. 모두 다 지우기 때문에
//				money += p2.price;
//				bonusPoint -= p2.bonusPoint;
//				System.out.println(p2+"를 반품하셨습니다");
//				return;
//			}
			
			}
		if(item.remove(p)){
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다");
			return;
		} else {
			System.out.println("저희 매장 제품이 아니세요~");
		}
		
//		if(item.contains(p)){
//			item.remove(p);
//			money += p.price;
//			bonusPoint -= p.bonusPoint;
//			System.out.println(p+"를 반품하셨습니다");
//			return;
//		}
		
	}
//void buy(NoteBook nb){		
//	}
//void buy(Tv2 nb){
//}
//void buy(Microwave nb){
//}
	
	//1.반품 refund
	//	구매물품이 없으면 "구매하신 물품이 없습니다."
	//	구매물품은 있으나 우리 매장에서 산게 아니다.
//	int refundApple(Product p){
//		if(
//	} 
	
	//2.영수중 summary
	/*
	  	영 수 증
	  
	  구매물품 	LGTV 	700만원
	  		Mac	 	400만원
	  		LG전자렌지 200만원
	총 구매금액			1300만원
	고객님의 남은 돈		8700만원
		   포인트		130만원
	또 오십쇼 호갱님~
	*/
	//3.사람 여러명을 관리할 수 있는 클래스를 작성해주세요.
	//사람은 이름으로 구분
	
	//4.물품을 관리할 수 있는 클래스를 만드세요
	//재고관리

	void summary(){
		System.out.println("\t영\t수\t증");
		System.out.print("구매물품");
		int sum = 0;
		for (int i = 0; i < item.size(); i++) {
			System.out.println("\t"+item.get(i).name+"\t"+item.get(i).price+"\t");
			sum += ((Product)item.get(i)).price;
		}
		System.out.println("총 구매 금액 \t"+sum+"만원");
		System.out.println("\n고객님의 남은 돈 :"+"\t"+money+"만원");
		System.out.println("고객님의 포인트 :"+"\t"+bonusPoint+"만원");
		
	}
	
	
	

	
	
}
