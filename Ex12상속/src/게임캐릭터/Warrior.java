package 게임캐릭터;

public class Warrior extends Charac{
	
	// 전진 , 점프 , 공격 --> Charac
	// 똑같은 메소드명에 {}가 달라져야 한다면 오버라이딩으로 할것
	// abstract 하면 에러남
	
	@Override
	public void run() {
		System.out.println("뚜벅뚜벅..");
		
	}

	@Override
	public void jump() {
		System.out.println("호잇쨔");
		
	}

	@Override
	public void atk() {
		System.out.println("스윽.../");
		
	}

}
