package 돼지저금통프로그램;

public class PiggyBank {
	//객체 설계할 떄는 static을 뺴도 된다. (static은 호출기능이기때문에 호출은 시뮬레이터에서 담당)
	
	//필드 : 금액(money)
	private int account;
	// private : 클래스 내부의 메서드를 통해서만 접근이 가능한 제한자
	// 필드에 접근할 수 있또록 내부에 메서드를  만들어주자 --> getter / setter
	
	// getter 만들기  -> 다른 클래스에서 account에 있는 값을 확인
	public int getMoney() {
		return account;
	}
	
	// setter 만들기 -> 다른 클래스에서 account에 있는 값을 수정할 수 있도록
	public void setMoney(int money) {
		account = money;  // 변수이름이 같을때는 필드변수 지역변수 구분해서 필드변수에 this 붙여놓을것.
		// this : 현재클래스를 지칭하는 키워드
	}
	
	// 객체를 생성함과 동시에 필드를 초기화시켜주는 생성자를 하나 만들기
	// 생성자의 특징
	// 1) 생성자도 메서드다 왜냐하면 소괄호가 붙어있기때문에
	// 2) 생성자는 이름이 클래스의 이름과 동일해야한다.
	// 3) 리턴타입을 지정하지 않는다 -> void도 x
	// 4) 매개변수로 아무것도 받지않는 생성자를 기본생성자
	// ---> 기본생성자는 생략( 클래스 만들때 이미 생략되어있음)
	// 5) 내가 새로운 생성자를 하나 만들어버리면 기본생성자는 기능을 잃는다.
	// ---> 오버로딩 하면 가능
	public PiggyBank() {
		//기본생성자도 사용하고싶으면 오버로딩 만들어줄것
		//오버로딩 : 같은 클래스 내에서 동일한 이름으로 메서드
		// 단, 매개변수의 형태가 달라야한다.!!!
		
	}
	
	
	
	public PiggyBank(int money) {
		// main에서 보내준 20000이라는 값을 현재 필드에 저장
		this.account = money;
	}
	
	//메소드 : 입금(deposit) 출금(withdraw) 확인(showMoney)
//	public PiggyBank() {
//		System.out.println("돼지저금통 생성!!");
//	}  ->위를 생성자라고 하는데 생략해도 컴파일러가 자동으로 입력해준다 반환타입도 없다. 클래스 이름과 같아야한다.
	
	public void depoist(int money) {
		account+=money;
	}
	public void withdraw(int money) {
		if(account>=money ) {
			account-=money;
		}
	}
	public int showMoney() {
		return  account; 
	}

}
