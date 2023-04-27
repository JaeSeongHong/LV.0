package Final_자바페스티벌;

public class 보너스6 {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		System.out.println("결과 확인 : " + powerN(base,n));
	}

	public static int powerN(int base, int n) {
		
		for (int i=1; i <= n; i++) {
			base *= base;	
		}
		int result = base; 
		return result;

	}

}
