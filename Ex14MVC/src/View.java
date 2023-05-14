import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		//View 역할 수행 : 사용자 인터페이스 (화면, 선택할 수 있게 하는 기능)
		
		//재생 , 정지 , 다음곡 , 이전곡 , 종료
		
		Scanner sc = new Scanner(System.in);
		
		//Controller의 기능에 접근할 수 있도록 객체 생성!
		Controller c = new Controller();
		
		
		int menu; //사용자가 선택한 메뉴
		


	System.out.println("       __       _______.       __  .______    __    __    ______   .__   __.  _______ ");
	System.out.println("      |  |     /       |      |  | |   _  \\  |  |  |  |  /  __  \\  |  \\ |  | |   ____|");
	System.out.println("      |  |    |   (----`      |  | |  |_)  | |  |__|  | |  |  |  | |   \\|  | |  |__   ");
	System.out.println(".--.  |  |     \\   \\          |  | |   ___/  |   __   | |  |  |  | |  . `  | |   __|  ");
	System.out.println("|  `--'  | .----)   |         |  | |  |      |  |  |  | |  `--'  | |  |\\   | |  |____ ");
	System.out.println(" \\______/  |_______/          |__| | _|      |__|  |__|  \\______/  |__| \\__| |_______|");
	                                                                                      

	                                                                                 
		while(true) {
			System.out.print("[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5]종료 >> ");
			menu =sc.nextInt();
			
			if(menu==1) {
				c.play();
			}else if(menu==2) {
				c.stop();
			}else if(menu==3) {
				c.next();
			}else if(menu==4) {
				c.previous();
			}else {//menu==5
				System.out.println("프로그램을 종료합니다.");
				c.stop();
				break;
			}
		}

	}

}