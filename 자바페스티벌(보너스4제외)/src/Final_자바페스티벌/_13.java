package Final_자바페스티벌;

public class _13 {

	public static void main(String[] args) {
		
		String grade = "A,A,B,C,D,A,C,D,D,D,F";
		
		String [] arr = grade.split(",");
		
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int f=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i].equals("A")) {
				a++;
			}else if(arr[i].equals("B")) {
				b++;
			}else if(arr[i].equals("C")) {
				c++;
			}else if(arr[i].equals("D")) {
				d++;
			}else {
				f++;
			}
		}
		
		System.out.println("A : "+a+"명\nB : "+b+"명\nC : "+c+"명\nD : "+d+"명\nF : "+f+"명");

	}

}
