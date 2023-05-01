import java.util.ArrayList;
import java.util.Scanner;

public class Ex03플레이리스트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();
		
		int choice;
		int choice2;
		while(true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >>");
			choice = sc.nextInt();
			if(choice==1) {//노래추가
				if(musiclist.size()==0) {
					System.out.println("======현재 재생 목록======");
					System.out.println("재생 목록이 없습니다.");
					System.out.println("======================");
				}else {
					System.out.println("======현재 재생 목록======");
					for(int i=0; i<musiclist.size() ; i++) {
						System.out.println(musiclist.get(i));
					}
					System.out.println("======================");
				}	
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >>");
				
				choice2 = sc.nextInt();
				if(choice2==1) {
						System.out.print("추가할 노래 입력 : ");
						String name = sc.next();
						musiclist.add(name);
						System.out.println("추가가 완료되었습니다.");
					}else {
						for(int i=0;i<musiclist.size();i++) {
						System.out.print("추가할 노래 입력 : ");
						String name = sc.next();
						System.out.print("추가할 위치 입력>>");
						i = sc.nextInt();
						musiclist.add(i-1,name);
						System.out.println("추가가 완료되었습니다.");
						break;
						}
					  }
			}
			
			
			
			
			else if(choice==2) {//노래 삭제
				System.out.println("======현재 재생 목록======");
				for(int i=0; i<musiclist.size() ; i++) {
					System.out.println(musiclist.get(i));
				}
				System.out.println("======================");
				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				int choice4= sc.nextInt();
				if(choice4==1) {
					System.out.print("삭제할 노래 선택>>");
					int choice5 = sc.nextInt();
					String a = musiclist.remove(choice5);
					System.out.println("노래가 삭제되었습니다.");
				}else if(choice==2){
					musiclist.clear();
					System.out.println("전체 List가 삭제되었습니다.");
				}
			}else if(musiclist.size()==0){
				System.out.println("======현재 재생 목록======");
				System.out.println("재생 목록이 없습니다.");
				System.out.println("======================");
			
			}
			
			else {//프로그램 종료
				System.out.println("프로그램이 종료되었습니다.");
			}
			break;
				}	
			
	}

}
