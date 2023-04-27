package Final_자바페스티벌;

import java.util.Scanner;

public class _07행개수역삼각형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int row = sc.nextInt(); //3
		
		for (int i=row; i>=1; i--) { 
			for (int j=i; j>=1; j--) { 
				System.out.print("*");
			}
			System.out.println();

	}

	}
}
