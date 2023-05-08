
public class Ex00비선형구조 {

	public static void main(String[] args) {
/////////////////////////////////신장트리 (Spanning Tree)
		// 연결그래프의 모든 정점을 포함하는 트리
		// -> 최소 연결부분 그래프(간선이 최소화) 정점-> 5개 ,n개  / 간선 ->정점 1개 , n-1개
		// 최소비용신장트리 : 가중치가 가장 적으면서 모든 정점을 포함하고 간선이 n-1개인 신장트리
		// 1) 크루스칼 알고리즘 : 각 간선의 가중치를 기준으로 오름차순으로 정렬
		// 					-> 가중치 값 : 각 가중치 값+
		// 2) 프림 알고리즘 : 처음에는 노드를 임의로 지정해놓고 조금씩 확장해나가는 개념
		//                  -> 가중치 값: 각 가중치 값 (프림이랑 크루스칼 가중치 값은 똑같다.)
/////////////////////////////////트리 (Tree)
		// 노드 : 기본요소
		// 근노드(Root) : 처음 시작 노드
		// 차수 : 각 노드의 가지 수(트리의 차수 : 가장 큰 차수)
		// 단말노드 : 자식이 하나도 없는 노드 , 차수가 0인 노드
		// 자식노드 : 어떤 노드에 연결된 노드
		// 부모노드 : 어떤 노드에 연결된 이전 레벨 노드 보통 1개
		// 형제노드 : 동일한 부모를 가지는 노드
		// 레벨, 깊이 : 근노드로부터 레벨1부터 1씩 증가
////////////////////////////////트리 순위 방법
		// 전위순회 : 중간 왼쪽 오른쪽 : 0 1 3 7 8 4 9 10 2 5 11 6
		// 중위순회 : 왼쪽 중간 오른쪽 : 7 3 8 1 9 4 10 0 11 5 2 6 
		// 후위순회 : 왼쪽 오른쪽 중간 : 7 8 3 9 10 4 1 11 5 6 2 0
		// 층별순회 : 층별로 왼쪽부터 : 0 1 2 3 4 5 6 7 8 9 10 11

	}

}
