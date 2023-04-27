package Final_자바페스티벌;

import java.util.Scanner;

public class _02시급계산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int pay = 5000 ;
		System.out.print("일한 시간을 입력하세요 : ");
		double work = sc.nextDouble();
		
		System.out.print("총 임금은 ");
		
		if (work <= 8) {
			System.out.println((int)work*pay);
		} else {
			System.out.print((int)(8*pay + (work-8)*pay*1.5));
		} 
		System.out.println("원 입니다");
		
		
		
		
		
	}

}
