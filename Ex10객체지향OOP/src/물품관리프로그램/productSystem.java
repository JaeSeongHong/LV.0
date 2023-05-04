package 물품관리프로그램;

import java.util.ArrayList;

public class productSystem {
	//////////////////필드
	private ArrayList<Product> list = new ArrayList<Product>();
	
	/////////////////물품 등록가능
	public void addProduct(String name, int unitPrice , int amount) {
		Product pd = new Product(name,unitPrice,amount);
		list.add(pd);
	}
	
	///////////////예상판매량 조회
	public String getProductList() {
		String msg = "";
		for (int i=0; i<list.size(); i++) {
			Product temp = list.get(i); // 제품을 하나씩 꺼내는 코드
			msg += temp.getName(); // 제품 이름을 누적
			msg += "\n";
		}	
		return msg;
	}
	
	public int getProductPrice() {
		int msg2 = 0;
		for (int i=0; i<list.size(); i++) {
			Product temp2 = list.get(i); // 제품당 가격
			msg2 += temp2.getUnitPirce(); // 제품 가격 누적
			msg2 += '\n';
		}	
		return msg2;
	}
	
	public int getProductAmount() {
		int msg3 = 0;
		for (int i=0; i<list.size(); i++) {
			Product temp3 = list.get(i); // 제품을 하나씩 꺼내는 코드
			msg3 += temp3.getAmount(); // 제품 가격 누적
			msg3 += '\n';
		}	
		return msg3;
	}
	
	
	
	
	
	
	
}
