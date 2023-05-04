package 주소록관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> list = new ArrayList<Address>();
		
		String msg="";
		
		while(true) {
			
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int select = sc.nextInt();
			
			if(select==1) {//추가
				System.out.print("이름 : ");
				String name1 = sc.next();
				System.out.print("나이 : ");
				int age1 = sc.nextInt();
				System.out.print("전화번호 : ");
				String cellNumber1 = sc.next();
				Address a = new Address(name1, age1, cellNumber1);
				list.add(a);
			}else if(select==2) {//전체조회
				
				if(list.size()==0) {
					System.out.println("등록된 연락처가 없습니다.");
				}
				for(int i =0; i<list.size();i++) {
					System.out.println(i+1+"."+list.get(i).getName()+"("+list.get(i).getAge()+"세) :"+" "+list.get(i).getPhoneNumber());
				}
				
			}else if(select==3) {//삭제
				
				if(list.size()==0) {
					System.out.println("등록된 연락처가 없습니다.");
				}else {
					System.out.print("삭제할 번호 입력 : ");
					int num = sc.nextInt();
					//실제 삭제할 데이터의 위치(인덱스 값은) 사용자가 입력한 값에 -1
					list.remove(num-1);
					}
			}else if(select==4) {//검색
				System.out.print("검색할 이름 입력 : ");
				String name = sc.next();
				
				//검색하고자 하는 데이터의 위치를 저장하는 변수하나만들기
				int index = -1;
				// list에 사용자가 입력한 name이 있는 없는지 판단
				for(int i=0;i<list.size();i++) {
					if(name.equals(list.get(i).getName())) {
						index = i;
					}
				}
				if(index== -1) {
					System.out.println("검색한 이름의 정보가 없습니다.");
				}else {
					System.out.println(index+1+"."+list.get(index).getName()+"("+list.get(index).getAge()+"세) :"+" "+list.get(index).getPhoneNumber());
				}
				
			}else if(select==5) {//종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
			
			
			
			
		}
		
		

	}

}
