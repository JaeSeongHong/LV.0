package Final_자바페스티벌;

public class _14 {

	public static void main(String[] args) {
		
		int[][] arr=new int[5][5];
		
		int num=1;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i%2==0) {
					arr[i][j] = num++;
				}else {
					arr[i][4-j] = num++;
				}
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
