
public class Ex00 {
	//오버로딩(중복정의) : 같은 클래스 내에서 같은 이름으로 메서드를 사용 할 수 있다.
	//        		  단, 매개변수의 형태가 달라야한다
	
	// 추상 키워드 : abstract
	// 1. 추상 클래스 : public abstract class 클래스명(){}
	// 추상메서드를 하나라도 가지고있으면 일반클래스를 추상 클래스로 만들어줘야한다.
	// 추상클래스도 일반메소드(body가 있는 메소드) 포함 가능
	// 추상메소드가 하나도 가지고 있지않더라도 추상 클래스가 될 수 있다.
	
	// 2. 추상 메서드 : public abstract  void 메소드명 ();  -->body가 없음
	// -abstract 라는 키워드가 있고 , body {}가 없는 메소드
	// 메소드의 구조만 정의해놓은 메소드 (접근제한자, 리턴타입 , 메소드명,매개변수)만 정해져있는 메소드
	
	// casting~~(형변환)
	// 묵시적
	// 명시적
	
	//객체자료형 형변환 : 상속관계에서 가능
	// 업캐스팅 == 묵시적 : 자식클래스(자료형)이 부모클래스의 자료형으로 변환
	// 다운캐스팅 == 명시적 : 업캐스팅 되어있는 객체자료형을 다시 원래 자료형으로 돌리는 작업
}
