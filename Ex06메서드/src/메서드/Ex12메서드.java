package 메서드;

public class Ex12메서드 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		System.out.println(cal(num1, num2, op));

	}
	
	public static int cal(int num1, int num2, char op ) {
		int temp = 0;
		
		switch(op) {
		case '-' :
			temp = num1-num2;
		}
		switch(op) {
		case '+' :
			temp = num1+num2;
		}
		switch(op) {
		case '*' :
			temp = num1*num2;
		}
		switch(op) {
		case '/' :
			temp = num1/num2;
		}
			return temp;
		// cal 메서드가 가진 기능
		// op :  + - * /
		// +가 오면 더한결과 값
		// 매개변수 (int, int, cal)
		// 결과값만 받아오는 상태 : int 
	}
	
	
	
	
	
	

}
