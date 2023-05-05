import java.util.Scanner;

public class Ex06while문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		
		System.out.print("목표 몸무게 : ");
		int obj = sc.nextInt();
		
		int week = 1;
		
		
		while(true) {
			System.out.print(week+"주차 감량 몸무게 : " );
			int minus = sc.nextInt();
			System.out.println("현재 몸무게 : "+(now-minus));
			week++;
			now -= minus;
			if(now <= obj) {
				System.out.println("최종몸무게 : " + obj);
				break;
			}
		}
		System.out.println("축하합니다!!!");

	}

}
