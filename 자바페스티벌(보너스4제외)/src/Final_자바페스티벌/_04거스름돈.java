package Final_자바페스티벌;

import java.util.Scanner;

public class _04거스름돈 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int m = sc.nextInt();
		
		System.out.println("잔돈 : " + m + "원");
		
		int tenT = m/10000 ;
		int fiveT = m%10000/5000 ;
		int t = m%10000%5000/1000 ;
		int fHun = m%10000%5000%1000/500 ;
		int hun = m%10000%5000%1000%500/100 ;
		
		System.out.printf(" 10000원: %d개\n 5000원 : %d개\n 1000원 : %d개\n 500원 : %d개\n 100원 : %d개 "
					, tenT, fiveT, t, fHun, hun );
		
		
	}

}
