package Final_자바페스티벌;

import java.util.Scanner;

public class _24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("Y 입력 >> ");
		int x = sc.nextInt();
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			num[i] = sc.nextInt();
		}
		System.out.print("결과 >> ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] < x) {
				System.out.print(" " + num[i]);

			}
		}

	}

}
