package TV클래스설계;

public class TVSimulator {

	public static void main(String[] args) {
		// TV객체(object) 생성
		
		// 데이터타입 변수명 = new 데이터타입(); //레퍼런스타입 : 사용자정의
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		tv1.브랜드이름 = "삼성";
		tv2.브랜드이름 = "LG";
		
		tv1.채널변경하기(30);
		tv1.채널내리기();
		
		System.out.println(tv1.채널);
		//추상화 : 객체에서 공통된 속성과 행위를 추출하는 기법
		//캡슐화 : 실제 구현내용을 외부로부터 감추는 기법(은닉)
	}

}
