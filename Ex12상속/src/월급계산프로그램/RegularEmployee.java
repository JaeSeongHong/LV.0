package 월급계산프로그램;

public class RegularEmployee extends Employee {
	///////////////////////필드
	
	public int bonus;
	///////////////////////메서드
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno,name,pay); // 부모클래스의 생성자
		// 상속관계에서 부모클래스에 생성자가 만들어져있으면
		// 반드시 자식클래스도 생성자를 가지고 있어야한다.
		this.bonus=bonus;
	}

	@Override
	public int getMoneyPay() {
		return (pay+bonus)/12;
	}

	
	
	
	

}
