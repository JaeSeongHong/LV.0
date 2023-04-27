package Final_자바페스티벌;

public class _06곱의합 {

	public static void main(String[] args) {
		//(77*1)+(76*2) ...(2*76)+(1*77)
		
		int i = 77;
		int j = 1;
		int sum = 0;

		while (i>=1) {
			int ij = i*j; 
			sum += ij; 
			i--; 
			j++; 
		}
		System.out.println(sum);
		
	
			
			
		}
				
	}

