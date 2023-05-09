package 월급계산프로그램;

public class PartTimeEmployee extends Employee{
	////////////////////필드
	
	public int workDay;
	////////////////////메소드
	
	public PartTimeEmployee(String empno,String name, int pay, int workDay) {
		super(empno,name,pay);
		this.workDay=workDay;
	}

	@Override
	public int getMoneyPay() {
		
		return pay*workDay;
	}

	
//	public int getMoneyPay() {
//		return pay*workDay;
//	}
//	
//	public String print() {
//		return empno+" : "+name+" : "+pay;
//	}

}
