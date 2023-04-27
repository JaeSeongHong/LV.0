package Final_자바페스티벌;

import java.util.Arrays;
import java.util.Scanner;

public class _27특이한채점 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 채점하기 ====");
		String input = sc.nextLine().toLowerCase();
		String[] arr = input.split("");
//		System.out.println(Arrays.toString(arr));
		
		int o = 0;
		int sum = 0; // o의 값을 합해주는 변수
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("o")) {
				o++;
				sum+=o;
			}
				if (arr[i].equals("x")) {
					o=0;	
				}
			
		}
		System.out.println("합 : " + sum);
		
		
	}

}
