import java.util.Scanner;

public class Ex01단순if문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int num = sc.nextInt();
		
		if(num>=20) {
			System.out.println("성인입니다.");
		}
	}

}
