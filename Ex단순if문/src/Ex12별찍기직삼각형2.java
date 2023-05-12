
public class Ex12별찍기직삼각형2 {

	public static void main(String[] args) {
		
		for(int i=0; i<5;i++) {
			//i 0 1 2 3 4
			for(int j=0; j<4-i ;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
