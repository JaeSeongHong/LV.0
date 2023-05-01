package 탐색;

import java.util.Arrays;

public class Ex03이진탐색 {

	public static void main(String[] args) {
		
		int[] arr= {10,24,7,68,42,82,3,43,22,84};
		
		//선택정렬_오름차순
		// 필요한 변수 2개 : 치환 , 가장 작은 값을 가진 인덱스의 값이 저장될 공간
		int temp;
		int index;
		
		for(int i=0; i<arr.length-1;i++) {
			index = i;
			for(int j=i; j<arr.length;j++) {
				if(arr[index] > arr[j]) {
					index = j;
				}
			}
			//치환
			//제일 작은 값을 0번 인덱스로 보내자 / 두번쨰 작은 값은 1번 인덱스
			if(i != index) {
				//원래 숫자의 자리와 제일 작은 숫자가 저장된 자리가 다를때만 치환
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp; //0번 인덱스에 가장 작은값이 들어온 상태
			}
			
		}
		
		/////////////////////////////////////////오름차순으로 정렬이 끝난상태
		// 이진탐색 : 배열에 있는 데이터가 꼭 정렬이 되어있어야 한다
		
		
		// lowIndex : 최소 Index값
		int lowIndex = 0;
		// highIndex : 배열이 가지는 최대 Index값
		int highIndex = arr.length-1;
		
		int num = 68;
		
		while(true) {
			int middleIndex = (lowIndex+highIndex)/2;
			if(arr[middleIndex]==num) {
				System.out.println(middleIndex);
				break;
			}else {
				if(arr[middleIndex]>num) {//high를 mid보다 -1 작게 재설정
					highIndex = middleIndex-1;
				}else {//low를 mid보다 +1한 값으로 재설정
					lowIndex = middleIndex+1;
				}
			}	
		}
		//1. middle에 있는 데이터랑 num이랑 같은지 판단
		//같지 않으면 mid에 있는 값보다 작은지? 큰지? 판단 해서 low,high 값을 재설정 해줄것
		
		
		

	}

}
