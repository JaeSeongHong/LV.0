package Final_자바페스티벌;

import java.util.Arrays;
import java.util.Random;

public class _10 {

	public static void main(String[] args) {
		
		Random rd=new Random();
		
		int[] arr= new int[8];

		System.out.print("배열에 있는 모든 값 : ");
		for(int i=0; i<arr.length;i++) {
			arr[i] = rd.nextInt(100);
			System.out.print(arr[i]+" ");
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			// min
			if(min > arr[i]) {
				min = arr[i];
			}
			// max
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		
		
		System.out.println();
		System.out.println("가장 큰 값 :"+max);
		System.out.println("가장 작은 값 : "+min);
		System.out.println(Arrays.toString(arr));
		

	}

}
