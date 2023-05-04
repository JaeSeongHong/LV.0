package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		System.out.println("===돼지 저금통===");
		
		PiggyBank pb = new PiggyBank();
		// 입금기능 메소드 호출
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입금할 금액 입력 : ");
		int inputMoney  = sc.nextInt();
		pb.depoist(inputMoney);
		
		System.out.print("출금할 금액 입력 : ");
		int outputMoney  = sc.nextInt();
		pb.withdraw(outputMoney);
		
		System.out.println(pb.showMoney()+"원 남았습니다.");
		
		//SOLID 중 S
		//단일책임원칙 : 한 클래스가 하나의 역할만 할수 있게
		
		// . : 참조한다
		
	}

}
