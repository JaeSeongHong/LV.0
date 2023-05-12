import java.util.Scanner;

public class Ex05ifelse문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		
		System.out.print("목표 몸무게 : ");
		int obj = sc.nextInt();
		
		System.out.print("1주차 감량 몸무게 : ");
		int one = sc.nextInt();
		System.out.println("현재 몸무게 : "+ (now-one));
		
		System.out.print("2주차 감량 몸무게 : ");
		int two = sc.nextInt();
		System.out.println("현재 몸무게 : "+ (now-(one+two)));
		
		System.out.print("3주차 감량 몸무게 : ");
		int three = sc.nextInt();
		System.out.println("현재 몸무게 : "+ (now-(one+two+three)));
		
		System.out.print("4주차 감량 몸무게 : ");
		int four = sc.nextInt();
		System.out.println("현재 몸무게 : "+ (now-(one+two+three+four)));
		
		System.out.print("5주차 감량 몸무게 : ");
		int five = sc.nextInt();
		System.out.println("현재 몸무게 : "+ (now-(one+two+three+four+five)));
		
		


	}

}
