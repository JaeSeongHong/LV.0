package 물품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class productSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		productSystem ProductManager = new productSystem();
		
		int choice;
		String item;
		int money;
		int count;
		while(true) {
			System.out.print("[1]물건추가 [2]예상 판매량 조회 [3] 종료>> ");	
			choice = sc.nextInt();
			
			if(choice==1) {
				System.out.print("물건 이름 : ");
				item = sc.next();
				System.out.print("단 가 : ");
				money = sc.nextInt();
				System.out.print("수 량 : ");
				count = sc.nextInt();
				
				// 사용자한테 입력받은 name,price,amount를 product자료형으로 묶어주자
				ProductManager.addProduct(item, money, count);
			
			}else if(choice==2) {
				// 데이터들을 다 확인 출력
				System.out.println("제품명    단가    수량");
				String msg = ProductManager.getProductList();
				System.out.println(msg);
			}else {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		
		
	}

}
