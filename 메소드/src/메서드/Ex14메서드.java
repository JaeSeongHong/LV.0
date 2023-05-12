package 메서드;

public class Ex14메서드 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("안녕하십니까"));
		System.out.println(getMiddle("안녕하십니까롱롱"));
		System.out.println(getMiddle("abcdefg"));
		
		
		// 전달인자 : String 1개
		// 매개변수 : String 1개
		// 리턴타입 : String 
		// index --> 0
		// String --> 0 char[] --> 0

	}
	
	public static String getMiddle(String data) {
		// 글자수가 짝수개면 2개 리턴
		// a.legnth() : 문자열의 길이를 알 수 있음
		// 글자의 위치는 만약에 6글자면 3,4,위치해 있는 글자가 return
		// 글자수가 홀수이면 1개 리턴
		// 글자의 위치가 만약에 5글자면 3번에 위치해있는 글자가 return
		// "" + int/char : 뒤에 있는 데이터타입이 자동으로 string 형변환
		String result ="";
		if(data.length()%2==0) {
			result += data.charAt(data.length()/2);
			result += data.charAt(data.length()/2-1);
			//-1을 안해주면 짝수여도 가운데 글자만 나옴
			// 안녕하십니까 '십'만 나오고 하는 안나옴 -1까지 해주어야 하까지 나옴.
		}else {
			result += data.charAt(data.length()/2);
		}
		return result;
		
	}
	
}
