import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		
		
		//기본타입은 <> 안에 지정할 수 없다.
		//<Reference Type> 만 가능
		//int -> Integer
		//boolean -> Boolean
		//char -> Character
		ArrayList<Integer> al = new ArrayList<Integer>(7);
		
		al.add(2); // 0번인덱스에 2라는 값을 넣겠다
		System.out.println("al");
		System.out.println();
	}

}
