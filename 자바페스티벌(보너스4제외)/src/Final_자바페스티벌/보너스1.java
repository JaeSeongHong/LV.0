package Final_자바페스티벌;

import java.util.Scanner;

public class 보너스1 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		do {			
			System.out.print("A 입력>> ");
			a = sc.nextInt();
			System.out.print("B 입력>> ");
			b = sc.nextInt();
			
			int ab = a-b;	
			if(a!=0 || b!=0) {
			System.out.println("결과>> "+ ab);
			}
		} while (a!=0 || b!=0) ; 	// &&와 ||를 수학적으로 이해하는 문제! 
	
		

	}

}
