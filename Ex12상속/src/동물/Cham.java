package 동물;

public class Cham extends Bird{
	
	// + 추상메서드/클래스의 특징
	// 설계되어있는 추상메서드의 구현을 강제화
	// 동물이라면 당연하게 가지고 있어야되는 기능들을 개발자가 잊어버리지 않도록 강제화 시켜줌
	
	
	
	// eat sleep move(짹짹)
	
	public void cry() {
		System.out.println("짹쨱거린다");
	}

	@Override
	public void eat() {
		
		System.out.println("먹는다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("쿨쿨 잔다");
		
	}

	@Override
	public void move() {
		System.out.println("파닥파닥 날라다닌다.");
		
	}
	

}
