import java.util.Arrays;

public class Ex02배열 {

	public static void main(String[] args) {
		
		//1. 정수형 데이터 저장하는 배열의 참조값을 가지는 레퍼런스 변수 선언
		int[] array;
		
		//2.크기가 10인 배열 생성 후 참조값을 변수에 저장
		array = new int [10];
		
		//3. 0~9 인덱스에 값 초기화(할당)
		array[0] = 20;
		array[1] = 23;
		array[2] = 12;
		array[3] = 34;
		array[4] = 13;
		array[5] = 46;
		array[6] = 42;
		array[7] = 26;
		array[8] = 19;
		array[9] = 23;
		
		//4. 배열의 모든값 출력
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		   //도구 -> 객체(인스턴스)
		   //toString(객체가 가지고 있는 공통기능)
		   // : 객체가 가지고 있는 값을 문자열로 바꿔주는 기능
		   //Arrays 도구(객체)가 가지고 있는 toString 메서드 호출
		   //toString 반환타입 ? -> String (모를땐 메서드에 마우스 올려두면 맨 첫번째 단어)
		System.out.println(Arrays.toString(array));

		//5. 1번 인덱스에 저장된 값과 4번 인덱스에 저장된 값의 합을 출력하기
		System.out.println(array[1]+array[4]);
		
		//6. 각 인데스에 저장된 모든 값을 더하여 출력
		   //System.out.println(); --사용가능하지만 너무 길어짐
		   //누적합
		int sum  = 0; //누적합을 저장하고 있을 변수
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		System.out.println(sum);
		
		//7. 배열안에 있는 수의 평균 구하여 출력하기
		System.out.println(sum/(double)array.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
