package 게임캐릭터;

public class Main {

	public static void main(String[] args) {
		
		//Charac c1 = new Charac();
		// 추상 클래스는 객체 생성이 불가능 합니다!!
		
		Wizard harry = new Wizard();
		harry.atk();
		harry.run();
		harry.jump();
		
		System.out.println();
		
		Warrior wi = new Warrior();
		wi.atk();
		wi.run();
		wi.jump();

	}

}
