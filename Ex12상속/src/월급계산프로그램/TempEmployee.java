package 월급계산프로그램;

public class TempEmployee extends Employee{
	///////////필드
	
	///////////메소드
	
	public TempEmployee(String empno, String name, int pay) {
		super(empno,name,pay);
	}

	@Override
	public int getMoneyPay() {
		
		return pay/12;
	}

	
	
//	public int getMoneyPay() {
//		return pay/12;
//	}
//	
//	public String print() {
//		return empno+" : "+name+" : "+pay;
//	}
	
	
	

}
