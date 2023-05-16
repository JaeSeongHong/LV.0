package 숫자게임만들기;

public class Member {
	///////////////////////필드
	private String nick;
	private String pw;
	
	///////////////////////생성자
	public Member(String nick, String pw) {
		this.nick=nick;
		this.pw=pw;
	}

	/////////////////////getter, setter
	public String getNick() {
		return nick;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setNick(String nick) {
		this.nick=nick;
	}
	
	public void setPw(String pw) {
		this.pw=pw;
	}
	
	

}
