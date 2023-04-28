import java.util.Arrays;
import java.util.Scanner;

public class Ex05비정방형배열생성 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int [][] arr = new int[4][]; //전체성적
		
		arr[0]=new int[3]; //1반
		arr[1]=new int[5]; //2반
		arr[2]=new int[4]; //3반
		arr[3]=new int[6]; //4반
		
		//점수입력
		for(int i=0; i<arr.length;i++) {
			System.out.println((i+1)+"반 점수 입력");
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(i+1+"반 "+(j+1)+"번째 학생 점수 >> ");
				arr[i][j]=sc.nextInt(); //i,j번에 각각 점수 입력
			}
		}
		//점수출력
		int sum; //반 총점
		for(int i=0; i<arr.length;i++) {
			System.out.print(i+1+"반 >> ");
			sum=0; //0으로 초기화(반이 돌때마다 초기화시켜줘야 함)
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				sum += arr[i][j]; //총점 변수에 누적
			}
			System.out.println();
			System.out.println("총점 : "+sum +" "+"평균 : "+(sum/(double)arr[i].length));
		}
		
		
		
		
		
		
		//System.out.print(arr[i][j]+"\t");
		
	}

}
