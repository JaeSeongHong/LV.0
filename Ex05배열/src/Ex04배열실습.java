import java.util.Arrays;
import java.util.Random;

public class Ex04배열실습 {

	public static void main(String[] args) {
		//랜덤 객체
		//rd -> 레퍼런스 변수
		Random rd = new Random();
		
		//배열을 랜덤값 초기화
		int[] arr = new int[10];//정수배열을 선언하면 기본값은 0
		
		       //arr[0]= rd.nextInt(20)+1; //0~19까지 나오기때문에 +1 써줌
		       //arr[1]= rd.nextInt(20)+1; //10번까지 만들기 
		
		//배열초기화
		for(int i=0;i<arr.length;i++) {//10번까지 쓰면 너무 길어서 반복문으로 단축
			arr[i]=rd.nextInt(20)+1;
		}
		
		int max = arr[0]; //반복문에서 지금까지 본 값중에 제일 큰 값을 저장
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i]; //제일 큰값 저장
			}else if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.print("가장 큰 값 : "+max);
		System.out.println();
		System.out.println("가장 작은 값 : "+min);
		System.out.println(Arrays.toString(arr));//어떤값이 출력되었는지 확인.
	}

}
