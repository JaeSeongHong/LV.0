package 월급계산프로그램;

public abstract class Employee {
	////////////////////필드
	protected String empno;
	protected String name;
	protected int pay;
	
	//protected(접근제한자) : 상속관계에 있는 클래스들은 접근이 가능하도록 도와주는 접근제한자
	// ------> 상속관계가 아닌 클래스는 접근이 불가능하도록 하는 제한자
	
	
	////////////////////메소드
	// 생성자 : 매개변수가 있는타입 만들어주기 --> 자식클래스 super()로 묶을것
	public Employee(String empno, String name, int pay) {
		this.empno=empno;
		this.name=name;
		this.pay=pay;
	}
	//상속관계에서 부모클래스가 생성자를 가지고 있으면 자식클래스에 super(매개변수);가 있어야 한다
	
	
	//getMoneyPay , 리턴타입 같다
	//return 값이 다르다 --> {body}가 다르다.
	
	
	//public abstract int getMoneyPay(); <--추상메소드 
	
	public abstract int getMoneyPay();
	public String print() {
		return empno+" : "+name+" : "+ pay;
	}
	
	
}
