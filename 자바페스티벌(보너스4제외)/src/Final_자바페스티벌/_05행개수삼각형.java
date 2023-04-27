package Final_자바페스티벌;

import java.util.Scanner;

public class _05행개수삼각형 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 별을 입력한 수의 열과 행만큼 반복출력 
		
		System.out.print("행 개수 : ");
		int row = sc.nextInt(); //3
		
		for (int i=1; i<=row; i++) { 
			for (int j=i; j>=1; j--) { // 처음에 조건식을 i<=1 로 반대로 해버려서 무한으로 별 생성됐네.. 0되면 멈춰야 되는데~
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("행 개수 : ");
//		int row = sc.nextInt(); //3
//		
//		for (int i=1; i<=row; i++) { //1
//			for (int j=1; j<=row; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("마지막 줄");	// 별을 입력한 수의 열과 행만큼 반복출력 
		
		
		
		
	}
}
		
//		for (i=1; i<10; i++) {
//			for (j=1; j<10; j++)
//			{System.out.print(i+"*"+j+"="+i*j);
//			System.out.print('\t');
//			}
//			System.out.println();
//		}
//		}
//		

//				
//		while ()
		
		//행개수(8) 입력 
		//하나씩 늘어나며 "*" 인쇄됨 -> 이걸 어떻게 표현하지?
		//
		//행 개수(8)보다 크면 인쇄 종료 = 행개수 까지만 인쇄
		
	


