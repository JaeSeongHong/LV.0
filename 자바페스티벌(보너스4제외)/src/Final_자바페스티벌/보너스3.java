package Final_자바페스티벌;

public class 보너스3 {
	public static void main(String[] args) {
		
		int num1 = 50; // int
		int num2 = 15; // int
		char op = '-' ; // char
		
		System.out.println(cal(op, num1, num2));
		

	}
	
	public static int cal(char op, int num1, int num2) {
		
		int result = 0;
		
		if (op=='+') {
			result = num1+num2;
		}
		else if (op=='-') {
			result = num1-num2;
		}
		else if (op=='*') {
			result = num1*num2;
		}
		else if (op=='/') {
			result = num1/num2;
		}
		
		return result ;
		
	}
	

}
