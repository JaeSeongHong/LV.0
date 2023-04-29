package 메서드;

public class Ex07메서드 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1,num2);
		System.out.println("큰 수 확인 : "+ result);

	}
	// lagerNumber 메서드
	// 메서드명 : lagerNumber
	// 전달인자 num1, num2 : int -> 매개변수 int 2개
	// 리턴타입이 int
	// int result = 출려하는 기능 x
	public static int largerNumber(int num1, int num2) {
		
		//a랑 b랑 누가 더 큰지 판단
		// 더큰수를 결과값으로 돌려주자!
		
		// 만약에 같은 수이면 0을 돌려주자@
		
		// 0/더 큰수
		// return 0;
		// return 더큰수;
		// cf) 모든 경우에 대해서 return 값이 있어야 한다.
		if(num1>num2) {
			return num1;
		}else if(num1<num2){
			return num2;
		}else {
			return 0;
		}
	}
	
	
	
	

}
