import java.util.Scanner;

public class Ex05배열실습 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr= new int[5]; //크기가 5인 정수형 데이터를 저장할 수 있는 배열생성
							   //-> 그 배열의 참조값을 저장할 레퍼런스 변수 선언
		int num=0;	
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+"번째 입력>>");
			arr[i]=sc.nextInt();
		}
		
		//확장 for문(for~each문)
		// : 배열, List 구조에서 쓰일 수 있는 반복문
		//for(배열의 0번인덱스에 있는 값부터 임시로 저장할 변수 : 배열이름, 즉 레퍼런스 변수이름)
		for(int a : arr) {
			System.out.print(a+" ");
		}
		
		int max = arr[0]; //내가 지금까지 본 점수중에 최고점수
		int min = arr[0]; //내가 지금까지 본 점수중에 최저점수
		int sum = 0; //누적합을 저장하고 있을 변수
		
		System.out.print("입력된 점수 : ");
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.print(arr[i]+" ");	
			if(arr[i]>max) {
				max= arr[i];
			}else if(arr[i]<min) {
				min= arr[i];
				
			}
		}
		
//		for(int a : arr) {
//			if(max<a) {
//				max=a;
//			}
//			if(min>a) {
//				min=a;
//			}
//			}
		System.out.println("\n최고 점수 : " + max);
		System.out.println("최저 점수 : "+min);
		System.out.println("총 합 : "+sum);
		System.out.printf("평균 : %f",sum/arr.length);
	
	}

}
