package Final_자바페스티벌;

import java.util.Scanner;

public class _26세자리수곱하기 {

	public static void main(String[] args) {
		// 입력하는 도구 가져오기
		// ctrl+A 로 전체선택 -> ctrl+shift+F
		Scanner sc = new Scanner(System.in);
		// 출력문 >> 입력 (1)
		// 출력문 >> 입력 (2)
		
		// (1) * (2)
		// 출력문1 : (1) * (2)의 일의자리 
		// 출력문2 : (1) * (2)의 십의자리 
		// 출력문3 : (1) * (2)의 백의자리 
		
//		int[] arr1 = new int[3];
//		int[] arr2 = new int[3];
//		
		
//		// 배열 초기화
		System.out.print("첫 번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 >> ");
		int num2 = sc.nextInt();
//		
//		arr2[0] = b/100;
//		arr2[1] = b/100/10;
//		arr2[2] = b%10;
//		
//		int sum = 0;
		// 출력문1 : (1) * (2)의 일의자리 
		int out1 = num1 * (num2%100%10);
		System.out.println(out1);
		// 출력문2 : (1) * (2)의 십의자리 
		int out2 = num1 * (num2%100/10);
		System.out.println(out2);
		// 출력문3 : (1) * (2)의 백의자리 
		int out3 = num1 * (num2/100);
		System.out.println(out3);
		// 최종결과 출력
		System.out.println(num1 * num2);
		
		
		
		
		
//		System.out.println(b*arr2[2]);
//		sum += b*arr2[2];
//		System.out.println(b*arr2[1]);
//		sum += b*arr2[1]*10;
//		System.out.println(b*arr2[0]);
//		sum += b*arr2[2]*100;
//		
//		System.out.println(sum);
		
		
		// 마지막 결과값 : (1) * (2) 결과
		
	}

}
