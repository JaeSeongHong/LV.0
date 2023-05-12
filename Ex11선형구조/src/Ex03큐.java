import java.util.LinkedList;
import java.util.Queue;

public class Ex03큐 {

	public static void main(String[] args) {
		
		//Stack -> (Vector-ArrayList) -> Collection
		//연속된 공간 할당
		
		//Queue (LinkedList)
		// -> 공간이 연속적이지 않음 //선입선출 스택은 후입선출
		
		//메모리 공간을 효율적으로 활용하기 위해 큐는 링크드리스트를 활용한다.
		Queue<Integer> q = new LinkedList<Integer>();
		
		// 2. 큐에 요소 삽입
		q.add(1);
		q.add(2);
		q.add(3);
		
		//3. 가장 먼저나갈 데이터를 반환
		System.out.println(q.peek());
		
		//4. 요소 삭제
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		//큐의 활용 : 프린터출력 , 운영체제의 테스크 스케줄링 , 유튜브 3시간짜리 데이터를 조금씩 가져오는것
		
		//링크드리스트 활용 : 배열보다 메모리를 자유롭게 사용가능 , 삽입 삭제가 빈번한 경우
	}

}
