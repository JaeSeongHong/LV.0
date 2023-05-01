import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_01플레이리스트 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//재생목록
		ArrayList<String> musiclist= new ArrayList<String>();
		int menu; //사용자가 선택한 메뉴를 저장하고 있을 변수(1,2,3)
		// 노래제목에 띄어쓰기가 있으면 버퍼에  뒷부분이 남아있고 메뉴는 정수형 반환타입이라 에러뜸
		//
		
		
		while(true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
			menu = sc.nextInt();
			
			if(menu==1) {
				PrintList(musiclist);
				
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				menu = sc.nextInt(); //1~2
				if(menu==1) {
					System.out.print("추가할 노래 입력 : ");
					sc.nextLine(); // 메뉴 입력후 엔터키(공백문자) 누르면 버퍼에 남아있기때문에 엔터처리작업
					musiclist.add(sc.nextLine());
				}else {//menu==2
					System.out.print("추가할 노래 입력 : ");
					sc.nextLine();
					String music = sc.nextLine();
					System.out.print("추가할 위치 입력 : ");
					int index = sc.nextInt();
					musiclist.add(index-1,music);
				}
				System.out.println("추가가 완료되었습니다.");
			}else if(menu==2) {
				System.out.println("[1]선택삭제 [2]전체삭제 >> ");
				PrintList(musiclist);
					System.out.print("삭제할 노래 선택 >> ");
					musiclist.remove(sc.nextInt()-1);
					System.out.println("노래가 삭제되었습니다.");
				}if (menu==2){//menu==2
					musiclist.clear();
					System.out.println("전체 list가 삭제되었습니다.");
				}else {
				System.out.println("================");
				}
				{//menu==3
					System.out.println("프로그램이 종료되었습니다.");
					break;
				}
			}

	} // main 끝

	public static void PrintList(ArrayList<String> musiclist) {
		System.out.println("===현재 재생 목록===");
		if (musiclist.size() == 0) {
			System.out.println("재생목록이 없습니다.");
		} else {
			for (int i = 0; i < musiclist.size(); i++) {
				System.out.println((i + 1) + ". " + musiclist.get(i));
			}
		}
		System.out.println("================");
	}

}
