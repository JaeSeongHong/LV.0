package 도서관리프로그램;

//책을 표현하는 클래스(책 정보를 가지고있음.)
public class BookData {
	////////////////////////////필드
	private String title;
	private int price;
	private String writer;
	
	///////////////////////////메소드
	
	//생성자 (반환타입x)
	public BookData(String title, int price, String writer) {
		super(); // super() : 상속
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	// getter 메소드
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public String getWriter() {
		return writer;
	}
	
	

}
