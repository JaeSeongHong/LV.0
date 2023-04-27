package Final_자바페스티벌;

public class _28 {

	public static void main(String[] args) {
		
		String str = "01001101";
		
		String[] arr= str.split("");
		
		int answer=0;
		int multi=1;
		for(int i=arr.length-1 ; i>=0 ; i--) {
			if(arr[i].equals("1")) {
				answer+= multi;
			}
			multi *= 2;
		}
		
		System.out.print(str + " (2) = "+answer+" (10)");

	}

}
