package Final_자바페스티벌;
import java.util.Random;
import java.util.Scanner;

public class _18 {

	public static void main(String[] args) {
		// 중복 없이 숫자 뽑는 로또 프로그램
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length;i++) {
			lotto[i]=rd.nextInt(45)+1;
			for(int j=0; j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<lotto.length;i++) {
		System.out.printf("행운의 숫자 : %d\n",lotto[i]);
		}
	}
}
