import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC회원관리 {

	public static void main(String[] args) {
		
		//(1)로그인 (2) 회원가입 (3) 닉네임조회 (4)종료
		//4번을 누르기 전까지 1,2,3 메뉴를 계속 선택할 수 있도록 만들어주세요
		
		Scanner sc = new Scanner(System.in);
		String InputId ="";
		String InputPw ="";		
		
		//객체 생성
		UserDAO dao = new UserDAO();
		
		
		while(true) {
			System.out.print("[1]로그인 [2]회원가입 [3]전체회원 조회 [4]종료 >> ");
			int select = sc.nextInt();
			
			if(select ==1) {
				System.out.println("======로그인=====");
				System.out.print("ID 입력 : ");
				InputId = sc.next();
				System.out.print("비밀번호 입력 : ");
				InputPw = sc.next();
				//사용자로부터 id,pw를 입력 받아서 모두 DB에 내용과 맞다면 // 'nick님 환영합니다.'
				
				//쿼리작성
				String nick = dao.login(InputId, InputPw);
				if(nick != null) {
					System.out.println(nick+"님 환영합니다!");
				}
				
			}else if(select == 2) {
				System.out.println("======회원가입=====");
				System.out.print("ID 입력 : ");
				String newId = sc.next();
				System.out.print("비밀번호 입력 : ");
				String newPw = sc.next();
				System.out.print("닉네임 입력 : ");
				String nick = sc.next();
				//회원가입
				int result = dao.join(newId, newPw, nick);
				if(result>0) {
					System.out.println("회원가입 성공!");
				}else {
					System.out.println("회원가입 실패!");
				}
				
				
			}else if(select == 3) {
				System.out.println("======전체회원 조회======");
				
				//'ID :  PW :  NICK : 출력'
				ArrayList<UserDTO> userList = dao.UserList();
				
				for(int i =0; i<userList.size();i++) {
					String id = userList.get(i).getId();
					String pw = userList.get(i).getPw();
					String nick = userList.get(i).getNick();
					System.out.println("ID : "+id+" PW : "+pw+" NICK : "+nick);
				}
				
			}else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	
		
		
		
		
	}
}
