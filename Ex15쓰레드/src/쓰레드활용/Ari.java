package 쓰레드활용;

//여러개 스킬을 동시 사용가능 -> 멀티쓰레딩 사용
// 1. Thread 클래스를 확장(상속)
public class Ari extends Thread{
	
	private String skill;
	
	public Ari(String key) {
		this.skill = key;
	}
	
	//Thread 클래스 => run 메소드 오버라이딩(run : 기본은 빈깡통 오버라이딩으로 재정의)
	//run -> 실제 실행할 기능 정의 , 하나의 쓰레드가 수행할 한가지 작업
	//	  -> 쓰레드 시작, 		run이 종료되면-> 쓰레드도 종료
	public void run() {
		System.out.println("입력 키 : "+skill);
		
		for(int i=1; i<=3 ; i++) {
			System.out.println(skill+" 사용 중 : "+i+"s");
		}
		
		System.out.println(skill+" 스킬 사용 종료");
	}

}
