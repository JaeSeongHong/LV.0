import java.util.Arrays;
import java.util.Scanner;

public class Ex07배열실습 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr= {1,4,3,2,1};
		int[] arr2 = new int[5];
		
		System.out.println("===채점하기===");
		System.out.println("답을 입력하세요");
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print((i+1)+"번 답>>");
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("입력한 답은 : "+Arrays.toString(arr));
		System.out.println("정답확인");
		
		int score=0;
		for(int j=0;j<arr2.length;j++) {
			if(arr[j]==arr2[j]) {
				score += 20;
				System.out.print("O ");
			}else if(arr[j]!=arr2[j]){
				System.out.print("X ");
			}
		}
		
			System.out.print("총점 : "+ score);
			
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
