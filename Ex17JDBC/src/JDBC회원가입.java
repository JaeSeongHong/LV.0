import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC회원가입 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직원이름 입력 >> ");
		String InputName = sc.next();
		System.out.print("비밀번호 입력 >> ");
		String InputPw = sc.next();
		System.out.print("성별 입력 >> ");
		String InputGender = sc.next();
		System.out.print("나이 입력 >> ");
		int InputAge = sc.nextInt();
		System.out.print("연봉 입력 >> ");
		int InputMoney = sc.nextInt();
		
		/////////////////////////1.DB 연결 
		Connection conn = null;
		
		//쿼리문을 실행시키는 객체
		//JAVA에서 인식하고있는 문자열로된 쿼리문을 Oracle 의 쿼리문으로 바꿔서 실행시켜준다!
		PreparedStatement pstm = null;
		
		//쿼리문을 통해서 발생한 응답을 담을 수 있는 객체
		ResultSet rs = null;
		
		try {
			//DB 연결할 수 있는 외부 클래스 가져오기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//연결시 필요한 값 (url, id, pw)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "service";
			String pw = "12345";
			
			//DrvierManager --> DB랑 연결
			//--> JAVA 와 DB 통로 만들어준다!
			conn = DriverManager.getConnection(url,id,pw); //<- DB 로그인
			System.out.println("접속 성공");
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		
		////////////////////////2. 접속후 실행하고 싶은 쿼리문 실행!
		try {
			//ex1) 나이가 40살 이상인 직원의 이름만 출력시켜주세요!
				// 1.where절 사용!
				// 2.if절 사용!
			//String sql = "select * from 직원 where 나이 >=40";
			//ex2)위에서 입력받은 name,pw를 이용해서 해당하는 직원의 나이를 출력 시켜주세요!
				// 1.where절 사용!
				// 2.if절 사용!
			//String sql = "select * from 직원";
			
			//ex2)
//			String sql2 = "select * from 직원 where 이름 = ? and 비밀번호 = ?";
//			pstm = conn.prepareStatement(sql2);
//			pstm.setString(1,InputName);
//			pstm.setString(2,InputPw);
//			
//			rs = pstm.executeQuery(); //쿼리 실행문
			
			//ex3) 이름, 비밀번호, 성별, 나이, 연봉 입력 받아서 데이터를 추가 하고싶습니다!
			String sql = "insert into 직원 values('A0011',?,?,?,?,null,'123-123',?,'D006')";
			//insert into 직원 values (직원id_seq.nextval,'1234','승환','남',20,null,'123-123',3000,'D006')
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,InputPw);
			pstm.setString(2,InputName);
			pstm.setString(3, InputGender);
			pstm.setInt(4,InputAge);
			pstm.setInt(5, InputMoney);
			
			//pstm.executeQuery(); --> select 같은 데이터 변경이 없을때, 데이터조회 시 사용됨
			//rs=pstm.executeQuery();//-->//-->insert, update, delete 같이 데이터변경이 있을 때 사용
			//변경된 행의 갯수를 반환!
			int result = pstm.executeUpdate();
			if(result>0) {
				System.out.println("회원가입 성공!");
			}
			
			
//			//ex2)
//			if(rs.getString("이름").equals(InputName)&&rs.getString("비밀번호").equals(InputPw)) {
//				System.out.println(rs.getString("나이"));
//			}
			
//			if(rs.next()) {
//				int age = rs.getInt("나이");
//				System.out.println("입력한 직원의 나이>> "+age);
//			}
			
			//rs.next() : boolean type이다
//			while(rs.next()) {//rs.next() : rs가 주소값의 모든데이터를 가지고 있고 처음부터 마지막 주소값까지 
//							  // 돌아가면서 그 데이터를 가지고 있는지 확인 ->True/false로 판단 false면 while문 종료
////				String name = rs.getString(1);
////				System.out.println(name);
//				
//				
//				
//				
//				
////				if(rs.getInt(5)>=40) { ex1)
////					//getString("이름") 이름 컬럼에서 문자열데이터(이름)을 가져오겠습니다!
////					//getString(인덱스) 도 가능 but DB는 인덱스번호 1부터 시작 고로 3 써도 이름출력함
////					String name = rs.getString(3);
////					System.out.println(name);
////				}
//				
//			}

		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		
		/////////////////////////////////3. DB 연결제거
		//DB 연결 제거 --> 역순!
	
			try{
				if (rs != null){
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		

	}

}
