package Final_자바페스티벌;

public class 보너스2 {

	public static void main(String[] args) {
	      System.out.println(getMiddle("power"));
	      System.out.println(getMiddle("abcdef"));
	      System.out.println(getMiddle("abcde"));

	   }
	   
	   public static String getMiddle(String data) {
	      String result ="";
	      if(data.length()%2==0) {
	         result += data.charAt(data.length()/2-1);
	         result += data.charAt(data.length()/2);
	      }else {
	         result += data.charAt(data.length()/2);
	      }
	      return result;


	}

}
