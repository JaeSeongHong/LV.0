package 큐;

public class IntQueue {
	/////////////////////////////////////필 드 
	private int[] que;
	private int capacity;
	private int front;
	private int rear;
	private int num;
	/////////////////////////////////////생성자
	public IntQueue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		que = new int[capacity];
	}
	
	
	/////////////////////////////////////메소드
	//인큐 -삽입
	public int enque(int x) {
		if(num>=capacity) {
			System.out.println("데이터가 가득찼습니다!");
			return -1;
		}
		que[rear++]=x;
		num++;
		if(rear == capacity) {
			rear = 0;
		}
		return x;
	}
	
	//디큐 -삭제
	public int deque(int x) {
		if(num<=0) {
			System.out.println("삭제할 데이터가 없습니다!");
			return -1;
		}
		x = que[front++];
		num--;
		if(front == capacity) {
			front = 0;
		}
		return x;
	}
	
	//peek : 맨 앞(첫번째)에 데이터 확인
	public int peek() {
		if(num <=0) {
			System.out.println("Queue가 비어있습니다!");
		}
		return que[front];
	}
	
	//clear : 큐 비우기
	public void clear() {
		num = front = rear = 0;
	}
	
	//indexOf : 특정값의 배열 상 인덱스 확인
	public int indexOf(int x) {
		for(int i=0;i<num;i++) {
			int idx = (i+front) % capacity;
			if(que[idx]==x) {
				return idx;
			}
		}
		return -1;
	}
	
	//size : 쌓여있는 데이터 개수
	public int size() {
		return num;
	}
	
	//isEmpty : 큐가 비어있는지 확인
	public boolean isEmpty() {
		return num<=0;
	}
	
	//isFull : 큐가 가득 차있는지 확인
	public boolean isFull() {
		return num >= capacity;
	}
	
	//dump : 큐 안에 데이터를 front ~ rear 순서로 출력
	public void dump() {
		if(num <=0) {
			System.out.println("Queue가 비어있습니다.");
		}else {
			for(int i=0;i<num;i++) {
				System.out.print(que[(i+front) % capacity]+" ");
				System.out.println();
			}
		}
	}

}
