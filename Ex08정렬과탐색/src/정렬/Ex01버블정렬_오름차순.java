package 정렬;

import java.util.Arrays;

public class Ex01버블정렬_오름차순 {

	public static void main(String[] args) {
		
		int[] arr= {10, 24, 7, 68, 42, 82, 3, 43};
		
		System.out.println("정렬 전 : "+ Arrays.toString(arr));
		int temp; // 치환을 위한 임시공간
		//0-1인덱스 비교 / 1-2인덱스 비교 / 2-3 / 3-4 / 4-5 / 5-6 / 6-7
		boolean sw = false; //n회차 정렬이 한번이라도 일어나면 true
		//결국 반복문
		for(int j=0; j<arr.length-1;j++) {//7회차
			sw= false;
			for(int i=0; i<arr.length-1-j; i++) {
				if(arr[i]>arr[i+1]) {//i번째 바로 옆 인덱스 i+1 비교
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sw=true;
				}
			}
			
			if(!sw) { //sw가 false일때만 수행 (n회차 한번도 바뀌지 않았을때)
				break;
			}
			System.out.println(j+1+"회차 : "+Arrays.toString(arr));
		}
		
		
		
		
		
		
	}

}
