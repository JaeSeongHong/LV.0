package 동물;

public abstract class Animal {
	
	// 추상 키워드 : abstract
	// 추상메서드를 포함하려면 추상 클래스로 바뀌어야함
	// 추상메서드를 포함하고 있찌 않아도 추상클래스가 될 수 있음.
	// + 추상메서드는 설계만 되어있다 -> 선언만 되어있다. -> body가 없는 메서드를 보고 추상메서드라 한다.
	
	// 동물 Class
	// 먹고 eat()
	// 자고 sleep()
	// 움직이고 move()
	public abstract void eat(); // 추상메서드
	
	public abstract void sleep(); 
	//오버라이딩 
	// : 상속관계에서 메소드를 구현단{body}만 다르게 작성 ---재정의
	public abstract void move(); 

}
