package Final_자바페스티벌;

public class _03합과차 {

	public static void main(String[] args) {

		// 1.
		int n = 1;
		int sum = 0;
	
//		while (n<=100) {
//			if (n%2==1) {
//				sum += n;
//				System.out.print(n+" ");
//			} else {
//				sum -= n;
//				System.out.print(-n+" ");
//			}
//			++n;
//		}
//		
//		System.out.println("결과 : "+ sum);
		
		// 2.	
		while (n<=100) {
			switch (n%2) {
                case 0:
                	System.out.print(-n+" ");
                    sum-=n;
                    break;
                case 1: // default
                    sum+=n;
                    System.out.print(n+" ");
                    break;                    
			}
            ++n;
		}
		System.out.println();
		System.out.println("결과 : "+ sum);

		
//		while (n<=10) {
//			switch (n%2) {
//              case 0://2
//                    n=-n; // -> 여기서 n이 마이너스값이 되면서 n%2==0을 충족시키며, 이 안에서 무한루프가 돌아감
//                    break; // 음수를 2로 나눠도 나머지는 0이래!! 그래서 break가 안먹힘
//				case 1:
//                    n=n;
//                    break;                    
//			}
//			sum += n; //1 -2 = -1
//        	Math.abs(n);//1 //2
//          ++n;//2
//		}
//		System.out.println("결과 : "+ sum);
		
	}
}