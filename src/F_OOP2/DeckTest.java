package F_OOP2;

public class DeckTest {
	public static void main(String[] args) {
		//Deck 객체를 만들어주세요.
		Deck d = new Deck();
		//4,5,6,7번에서 만들어진 메소드를 호출해주세요.
//		System.out.println(Arrays.toStirng(d.c));
		System.out.println(d.pick());
	}	
}

class Card{
	static final int KIND_MAX=4; // 카드 무늬수
	static final int NUM_MAX=13; // 무늬별 카드 수
	static final int NUM_MIN=1;
	static final int SPADE=1;
	static final int DIAMOND=2;
	static final int HEART=3;
	static final int CLOVER=4;
	
	int kind;
	int number;
	
	//1.매개변수가 2개인 생성자를 만들어주세요.
	Card(int kind, int number){
		this.kind=kind;
		this.number=number;
	}
	//2.기본생성자를 만들어주세요.
	//단 매개변수가 두개인 생성자를 이용하여 1,1로 만들어주세요.
	Card(){
		this(SPADE,1);
//	}Object
	//3.
	//4.
	//5.
	@Override
	public String toString(){
		String kind="";
		String number ="";
		
		switch(this.kind){
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "DIAMONT";
			break;
		case 3:
			kind = "HEART";
			break;
		default:
			kind = "CLOVER";
			break;
		}
		
		switch(this.number){
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default:
			number += this.number;
			break;
		}
		
		return kind + ","+number;
	}	
}

class Deck{
//	1.카드 수량을 저장할 수 있는 변수 CARD_NUM 선언 및 초기화 해주세요.
//	단 초기화시 Card클래스의 상수를 이용해주세요.
	static final int CARD_NUM = Card.KIND_MAX*Card.NUM_MAX;
//	2.카드 52장을 저장할 수 있는 변수 c를 선언 및 생성해주세요.
//	단 CARD_NUM을 이용해주세요.
	Card[] c = new Card[CARD_NUM];
//	3.기본생성자를 만들어주세요.
//	c의 각 방을 카드로 채워주세요.
	Deck(){
		int k=0;
		for(int i=0; i<Card.KIND_MAX; i++){
			for(int j=0; j<Card.NUM_MAX; j++){
				c[k] = new Card(i,j);
				k++;
			}
		}
	}
//	Triangle(Point p1, Point p2, Point p3){
//	this.p=new Point[]{p1,p2,p3};
//	}
//	Deck(){
//		for(int i=0; i<=Card.KIND_MAX; i++){
//			for(int j=0; j<=Card.NUM_MAX; j++){
//				c[i]=i+","+j;
//				System.out.println(c[i]);
//			}
//		}
//	}
//	4.입력받은 방번호의 카드를 반환하는 메소드 pick을 만들어주세요.
	Card pick(int a){
        return c[a];
     }
//	5.랜덤한 방의 카드 한장을 반환하는 메소드 pick을 만들어주세요.
//	단 4번에서 만든 pick 메소드를 이용하세요.
	Card pick() {
        int a = (int) (Math.random() * 52);
        return c[a];
	}
//	6.카드를 섞는 메소드 shuffle을 만들어주세요.
//	단 연습문제 5-8의 형태로 섞어주세요.
    void shuffle(){
        for(int i=0; i<CARD_NUM; i++){
    	int j = (int)(Math.random()*CARD_NUM);
    	Card tmp = null;
    	tmp = c[i];
    	c[i] = c[j];
    	c[j] = tmp;
        }
    }
//	7.메소드 shuffle을 이용해 카드를 섞어주세요.    
//	단 랜덤방 두개를 교환하는 방식으로 사용자로부터 입력받은 수만큼 반복해주세요.
    void shuffle(int a){
    	for(int i=0; i<=a; i++){
        	int j = (int)(Math.random()*CARD_NUM);
        	int k = (int)(Math.random()*CARD_NUM);
        	Card tmp = c[k];
        	c[k] = c[j];
        	c[j] = tmp;
    		}
    	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	