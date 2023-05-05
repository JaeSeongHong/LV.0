import java.util.Scanner;

public class Ex02e단순if문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();
		
		int num2 = num1%3;
		int num3 = num1%5;
		
		if(num2==0 || num3==0) {
			System.out.println("3또는 5의 배수입니다.");
		}

	}

}
