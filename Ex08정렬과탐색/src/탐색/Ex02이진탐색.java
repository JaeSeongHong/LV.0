<<<<<<< HEAD
package 탐색;

public class Ex02이진탐색 {

	public static void main(String[] args) {
		
		//이진탐색 
		// 변수 3개를 사용해서 데이터를 탐색
		//lowIndex, HighIndex , middleIndex
		// 장점 : 시간복잡도가 1/2로 빠른탐색 속도를 가지고 있음
		// 단점 : 검색알고리즘상 정렬된 리스트에서만 사용 가능
		
		//정렬된 배열 선언 및 초기화
		int[] arr= {1,7,16,25,30,33,41,66,78,90};
		
		// lowIndex : 최소 Index값
		int lowIndex = 0;
		// highIndex : 배열이 가지는 최대 Index값
		int highIndex = arr.length-1;
		
		// 내가 찾고싶은 숫자를 하나 정해준다
		int num=66;
		
		while(true) {
			// middleIndex 초기화
			int middleIndex = (lowIndex + highIndex)/2;
			// 현재 보고있는 배열 구역의 센터인덱스 값을 초기화
			
			if(arr[middleIndex]==num) {
				System.out.println(middleIndex);
				break;
			}else {
				//arr[m] != num
				//arr[m]보다 작은지, 큰지를 판단한 다음 lowIndex값과 , highIndex값을 다시 설정
				if(arr[middleIndex]>num) {
					highIndex = middleIndex-1;
				}else {
					//arr[m]<num
					lowIndex = middleIndex+1;
				}
			}
				
		}
		
		
		
		
		
		
		
		
		

	}

}
=======
package 탐색;

public class Ex02이진탐색 {

	public static void main(String[] args) {
		
		//이진탐색 
		// 변수 3개를 사용해서 데이터를 탐색
		//lowIndex, HighIndex , middleIndex
		// 장점 : 시간복잡도가 1/2로 빠른탐색 속도를 가지고 있음
		// 단점 : 검색알고리즘상 정렬된 리스트에서만 사용 가능
		
		//정렬된 배열 선언 및 초기화
		int[] arr= {1,7,16,25,30,33,41,66,78,90};
		
		// lowIndex : 최소 Index값
		int lowIndex = 0;
		// highIndex : 배열이 가지는 최대 Index값
		int highIndex = arr.length-1;
		
		// 내가 찾고싶은 숫자를 하나 정해준다
		int num=66;
		
		while(true) {
			// middleIndex 초기화
			int middleIndex = (lowIndex + highIndex)/2;
			// 현재 보고있는 배열 구역의 센터인덱스 값을 초기화
			
			if(arr[middleIndex]==num) {
				System.out.println(middleIndex);
				break;
			}else {
				//arr[m] != num
				//arr[m]보다 작은지, 큰지를 판단한 다음 lowIndex값과 , highIndex값을 다시 설정
				if(arr[middleIndex]>num) {
					highIndex = middleIndex-1;
				}else {
					//arr[m]<num
					lowIndex = middleIndex+1;
				}
			}
				
		}
		
		
		
		
		
		
		
		
		

	}

}
>>>>>>> branch 'master' of https://github.com/JaeSeongHong/LV.0
