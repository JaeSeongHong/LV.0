
public class Ex02이차원배열 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if(i%2==0) {
					//순차적 - 0,2,4
					arr[i][j] = num++;
				}else {
					//역방향 - 1,3
					arr[i][4-j] = num++;
						//0,4 -->인덱스번호 역행
						//0,3
						//0,2
						//0,1
				}
				
				}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
