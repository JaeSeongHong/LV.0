package 메서드;

public class Ex06메서드 {

	public static void main(String[] args) {
		
		// main 안에 코드는 손대지 않기
		add(3,5); //더하기
		sub(3,5); //빼기
		mul(3,5); //곱하기
		div(3,5); //나누기
		

	}
	// 매개변수가 2 : int
	// add : 메서드명이 add다
	// 출력하는 기능을 가지고 있다 -> 리턴타입이 없다, 즉 void 사용
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void sub(int a, int b) {
		System.out.println(a-b);
	}
	public static void mul(int a, int b) {
		System.out.println(a*b);
	}
	public static void div(int a, int b) {
		System.out.println(a/b);
	}
	
	
	
	
	
	

}
