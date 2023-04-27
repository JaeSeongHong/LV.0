package Final_자바페스티벌;

import java.util.Arrays;
import java.util.Scanner;

public class _25대시문자 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = 0; 
		int b = 0; 
		int c = 0; 
		int d = 0; 
		int e = 0; 
		int f = 0; 
		int g = 0; 
		int h = 0; 
		int i = 0; 
		int j = 0; 
		
		// 1. 숫자 입력받기
		// 2. 배열에 배정하기

		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");

		String[] arr = sc.nextLine().split("");
		System.out.println(Arrays.toString(arr));
			
		for (int i1 = 0; i1 < arr.length ; i1++) {
			
			switch (arr[i1]) {
			case "0" : a++;
			break;
			case "1" : b++;
			break;
			case "2" : c++;
			break;
			case "3" : d++;
			break;
			case "4" : e++;
			break;
			case "5" : f++;
			break;
			case "6" : g++;
			break;
			case "7" : h++;
			break;
			case "8" : i++;
			break;
			case "9" : j++;
			break;
		}
		
		}
		
		System.out.println(a*6+b*2+c*5+d*5+e*4+f*5+g*6+h*3+i*7+j*6);
		
		// 0:6a
		// 1:2b
		// 2:5c
		// 3:5d
		// 4:4e
		// 5:5f
		// 6:6g
		// 7:3h
		// 8:7i
		// 9:6j
		
		// switch
		// split""
		
		
		//배열에 배정하기
		
		


		
	}

}
