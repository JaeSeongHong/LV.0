package 메서드;

public class Ex13메서드 {

	public static void main(String[] args) {
		
		int base = 10;
		int n = 2;
		int result = powerN(base, n);
		System.out.println("결과 확인 : "+ result);
		
		//매개변수 : 2개 int
		//리턴타입 : int
		//base의 n승
		//base를 n번 곱한 결과값
		
		double result2 = Math.pow(5,2);
		System.out.println(result2);

	}

	public static int powerN(int base, int n) {
		int num = 1;		
		for(int i=1; i<=n ;i++) {
			num *= base;
		}
		return num;
	}
	
	
	
	

}
