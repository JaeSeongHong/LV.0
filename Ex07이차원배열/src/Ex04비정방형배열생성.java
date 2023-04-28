
public class Ex04비정방형배열생성 {

	public static void main(String[] args) {
		
		//비정방형 배열생성
		//1. 이차원배열 레퍼런스 배열과 변수 먼저 생성 및 선언ㅇ
		int [][] arr = new int[5][];
		//각 일차원배열의 길이가 다르기때문에 레퍼런스 배열 생성 시 길이를 지정할수가 없다. -> 대괄호 안 비워둠
		
		arr[0]=new int[1]; //일차원배열 생성 후 레퍼런스 값을 레퍼런스 배열에 저장
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[2];
		arr[4]=new int[1];
		
		arr[0][0] = 10;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
