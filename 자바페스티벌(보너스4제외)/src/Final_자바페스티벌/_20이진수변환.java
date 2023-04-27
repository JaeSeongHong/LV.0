package Final_자바페스티벌;

import java.util.Scanner;

public class _20이진수변환 {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				
				int[] arr = new int[10];

				System.out.print("숫자입력 >> ");
				int num = sc.nextInt();

				int i = 0;
				while (num >= 2) {
					arr[i] = num % 2;
					num = num / 2; 
					i++;
				}
				arr[i] = num;

				for (int j = i; j >= 0; j--) {
					System.out.print(arr[j] + " ");
				}


	}

}
