package 메서드;

public class Ex01메서드 {

	public static void main(String[] args) {
		
		// 매개변수와 전달인자의 갯수/데이터타입은 항상 일치
		System.out.println(sum(10,20,500));
		System.out.println(sum(20,25,500));
		System.out.println(sum(20,25,500));
		System.out.println(sum(25,25,500));
		System.out.println(sum(27,25,500));
		
		

	}
	// 메서드 작성은 main 밖에서 이루어진다.
	// +하는 기능을 그냥 만들어놓고 필요할때마다 가져다가 사용해야지..
	// public : 접근제한자 (공공의 : 클래스 내/외부에서 마음대로 접근이 가능하도록 해줌)
	// static : 저장소
	// 리턴타입 : 돌려받는 결과값의 데이터 타입
	// 메서드명(호출명) : 실행시킬때 부를 이름
	// (매개변수) : 메서드 안에서 사용될 수있는 변수, 선언만 가능
	// int a; //선언
	// a= 3; //초기화
	// a= 5; //재할당
	public static int sum(int a, int b, int c) {
		// 리턴타입에 자료형이 명시되어있으면 return이라는 키워드가 따라온다.
		// cf) 모든 경우에 대해서 꼭 return값이 있어야 한다.
		
		//int result = a+b+c;
		return a+b+c+365;
	}
	
	
	
	
	
	
	
	
	
	
	
}
