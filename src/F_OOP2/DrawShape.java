package F_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame{
	public static void main(String[] args) {
		DrawShape ds = new DrawShape();
		DrawShape ds2 = new DrawShape("최고다");
//		ds.paint(new Graphics());
	}
	
	public void paint(Graphics g){
//		1.원 객체를 만드세요(매개변수 두개짜리 생성자를 이용해주세요)
		Point p1 = new Point(150,150);
		Circle c = new Circle(p1,50);
//		150,150 50
//		2.원을 그려주세요
//		g.drawOval(int,int,int,int)
		g.drawOval(p1.x,p1.y,c.r*2,c.r*2);
//		3.삼각형 개체를 만드세요
		Point p2 = new Point(100,100);
		Point p3 = new Point(200,200);
		Point p4 = new Point(200,100);
		Point[] pp = new Point[3];
		pp[0] = p2;
		pp[1] = p3;
		pp[2] = p4;
		Triangle t1 = new Triangle(pp);
//		매개변수 하나짜리 생성자를 이용해주세요
//		100,100 200,200 200,100(직각삼각형)
//		4.삼각형을 그려주세요
//		g.drawLine(int, int, int, int)
		g.drawLine(t1.p[0].x, t1.p[0].y, t1.p[1].x, t1.p[1].y);
		g.drawLine(t1.p[1].x, t1.p[1].y, t1.p[2].x, t1.p[2].y);
		g.drawLine(t1.p[2].x, t1.p[2].y, t1.p[0].x, t1.p[0].y);
		
	}
	
	DrawShape(){
		setTitle("그냥만들어봤어");
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.DARK_GRAY);
		setResizable(false);
	}
	
	DrawShape(String title){
		setTitle(title);
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.black);
		setResizable(false);
	
	}
}

class Point{
	int x; 
	int y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}

class Circle{
//	1.점 하나를 저장할 수 있는 변수 center를 선언하세요.
	Point center;
//	2.반지름(정수)을 저장할 수 있는 변수 r을 선언하세요.
	int r;
//	3.매개변수가 2개인 생성자를 만드세요.
//	(단 매개변수 2개로 center와 r을 초기화 해주세요)
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
//	4.기본생성자를 만들어주세요
//	(단 매개변수가 두개인 생성자를 이용하여 점(50,50)으로 반지름은 100으로 만들어주세요
	
	Circle(){
		this(new Point(50,50),100);
	}
	
	
	
	}

class Triangle{
//	1.점 세개를 저장할 수 있는 변수 p를 선언하세요.
	Point[] p;
//	2.매개변수가 하나인 생성자를 만드세요.
//	단 매개변수의 값으로 p를 초기화해주세요.
	Triangle(Point[] p){
		this.p=p;
	}
//	3.매개변수가 세개인 생성자를 만드세요.
//	단 매개변수 세개로 p를 초기화해주세요.
	Triangle(Point p1, Point p2, Point p3){
		this.p=new Point[]{p1,p2,p3};
	}
	
}





















