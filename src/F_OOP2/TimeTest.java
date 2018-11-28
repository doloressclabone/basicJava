package F_OOP2;

public class TimeTest{
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(19);
		int hour = t.getHour();
		System.out.println(hour);
		
		t.setMinute(150);
		int minute = t.getMinute();
		System.out.println(" : "+minute);
		
		t.setSecond(10000);
		int second = t.getSecond();
		System.out.println(" : "+second);
	}
}

class Time{
	private int hour;
	private int minute;
	private int second;
	
	void setHour(int hour){
			this.hour = hour%24;
	}
	
	int getHour(){
		return hour;
	}
	
	void setMinute(int minute){
		this.minute = minute%60;
		setMinute(hour+minute/60);
	}
	
	int getMinute(){
		return minute;
	}
	
	void setSecond(int minute){
		this.second = second%60;
		setMinute(minute+second/60);
	}
	
	int getSecond(){
		return second;
	}
}
//		if(minute > 59){
//			this.minute = minute%60;
//			this.hour += minute/60;
//			if(hour > 23){
//				this.hour = hour%24;
//			}
//		}else{
//			this.minute=minute;
////		}
//	}
//	
//	int getMinute(){
//		System.out.print(getHour());
//		return minute;
//	}
//	
//	void setSecond(int second){
//		if(second > 59){
//			this.second = second%60;
//			this.minute += second/60;
//			if(minute > 59){
//				this.hour += minute/60;
//				this.minute = minute%60;
//			}
//			
//			}else {
//				this.second=second;
//		}
//	}
//	
//	int getSecond(){
//		System.out.print(this.hour+" : " );
//		System.out.print(this.minute);
//		return second;
//	}
//}

