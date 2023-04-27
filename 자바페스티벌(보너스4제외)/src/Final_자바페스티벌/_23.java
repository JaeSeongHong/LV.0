package Final_자바페스티벌;

public class _23 {

	public static void main(String[] args) {
	      // 2차원 배열 왼쪽으로 90도 회전하여 출력
	      
	      int[][] arr = new int[5][5];
	      
	      int num=1;
	      System.out.println("원본");
	      for(int i=0; i<arr.length;i++) {
	         for(int j=0;j<arr[i].length;j++) {
	            arr[i][j]=num++;
	         }
	      }
	      
	      for(int i=0;i<arr.length;i++) {
	         for(int j=0;j<arr[i].length;j++) {
	            System.out.printf("%d\t",arr[i][j]);
	         }
	      System.out.println();
	      }
	      
	      num = 5;
	      System.out.println("\n90도 회전");
	      for(int i=0; i<arr.length;i++) {
	         for(int j=0;j<arr[i].length;j++) {
	            arr[i][j]=num--;
	         }
	         num+=10;
	      }
	      
	      for(int i=0;i<arr.length;i++) {
	         for(int j=0;j<arr[i].length;j++) {
	            System.out.printf("%d\t",arr[j][i]);
	         }
	         System.out.println();
	      }

	      
	      
	      
	      
	      
	      
	      
	      }
	   


	

}
