import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
	//DAO : Data Access Object
	//데이터에 접근하는 기능을 가지고 있다!
	
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	String InputId;
	String InputPw;
	String nick;
	
	public void getConn() {
		//DB연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "service";
			String pw = "12345";
			
			conn = DriverManager.getConnection(url,id,pw); //<- DB 로그인
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void close() {
		//DB연결 해제
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
	
	//회원로그인 할때 쓸 메소드
	public String login(String InputId, String InputPw) {
		
		getConn();
		
		try {
			
			String sql = "select nick from member where id = ? and pw = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,InputId);
			pstm.setString(2,InputPw);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				nick = rs.getString("nick");
			}
			
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		close();
		return nick;
	}
	
	//회원가입 join으로 만들어주세요!
	public int join(String newId,String newPw,String nick) {
		
		getConn();
		int result = 0;
		try {
			String sql = "insert into MEMBER values(?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,newId);
			pstm.setString(2,newPw);
			pstm.setString(3,nick);
			
			result = pstm.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		
		close();
		return result;
	}
	
	//전체 조회
	public ArrayList<UserDTO> UserList() {
		getConn();
		ArrayList<UserDTO> userList = new ArrayList<>();
		
		String sql = "select * from MEMBER";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery(); //쿼리 실행문
		
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String nick = rs.getString("nick");
				
				UserDTO dto = new UserDTO(id, pw, nick); 
				userList.add(dto);
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		close();
		return userList;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
