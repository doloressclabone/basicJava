package E_OOP;

public class RecursiveCall {
	public static void main(String[] args) {
	
		int sum=1;
		for(int i=4; i>1; i--){
			sum *= i;
		} System.out.println(sum);
		
		long result = factorial(4);
		System.out.println(result);
		
			
			
		
			
			
			
			
			
			
			
			
			
			
}
	static long factorial(int num){
		long result = 0L;
		if(num==1){
			result = 1;
		} else{
			result = num * factorial(num-1);
		}
		return result;
		
		
		
	}
}
