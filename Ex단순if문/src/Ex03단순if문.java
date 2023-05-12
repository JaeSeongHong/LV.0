import java.util.Scanner;

public class Ex03단순if문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("JAVA 점수 입력 : ");
		int s1 = sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int s2 = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int s3 = sc.nextInt();
		
		int score = (s1+s2+s3)/ 3;
		
		if(score > 80) {
			System.out.println("합격");
		}



	}

}
