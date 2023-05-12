import java.util.Scanner;

public class Ex07while문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String id = sc.next();

		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		id="smhrd";
		pw="1234";

		while(true) {if (id!="smhrd" && pw!="1234") {
			System.out.println("로그인 실패");
		} else if(id == "smhrd" && (pw =="1234")) {
			System.out.println("로그인 성공");
		}break;
		}
		 
			
		

	}

}
