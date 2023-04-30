package 메서드;

public class Ex11메서드 {

	public static void main(String[] args) {
		
		int num1= 10;
		int num2= 2 ;
		boolean result = isDivide(num1,num2);
		//리턴타입 : boolean 매개변수 : 2개(int)
		System.out.println("결과 확인 : " + result);

	}
	
	public static boolean isDivide(int num1, int num2) {
		//6. 알고리즘 작성
		//num2가 num1을 나누었을때 나누어 떨어지게 하는지 판단
		// true / false
		if(num1%num2==0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// 1.public(공공의) : 접근제한자 : 클래스 내/외에서 접근할수 있도록 해주는 제한자
			// 2.static (정적인) : 저장소
			// 3.리턴타입 : 메서드가 돌려주는 결과값의 데이터 타입
			// 있(자료형) : return / 없(void) : return X --> 기능자체
			// 4.메서드명(호출명)
			// 5. () : 모든 메서드들은 소괄호가 붙는다, print()도 메서드다
			// 소괄호 안쪽에 매개변수(메서드 안에서 사용되는 변수 , main에서 받아온 전달인자) 작성
			// +전달인자,매개변수는 개수, 자료형 같아야한다
	
	
	
	
	
	

}
