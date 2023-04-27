package Final_자바페스티벌;

import java.util.Scanner;

public class _31팩토리얼 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int a = sc.nextInt(); 
		int sum = 1;
		
		while (a>=1) { 
			sum *= a;
			a--; 
		}
		System.out.print("출력 : "+ sum);	//변수 좀 제대로 잘 넣자~~ 
	

	}

}
