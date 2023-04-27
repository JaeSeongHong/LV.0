package Final_자바페스티벌;

import java.util.Scanner;

public class _08반올림 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 :");
		int n = sc.nextInt();

		int remain = n%10 ;
		
		if (remain >= 5) {
			System.out.println(n-remain+10);
		} else {
			System.out.println(n-remain);
		}
		
		
}
	
}
