package 숫자게임만들기;

import java.util.Random;
import java.util.Scanner;

public class PlusGame implements OperatorGame{
	
	//인터페이스 상속은 implements 인터페이스 이름
	
	
	//개발자1
	//자연쌤이 주신 인터페이스를 사용해서 구현하기
	//기능을 완성하기
	 Random rd = new Random();
	 Scanner sc = new Scanner(System.in);
	 int num1 = 0;
	 int num2 = 0;
	         
	   public int random() {
	      return rd.nextInt(50)+1;
	   }

	   @Override
	   public String getQuizMsg() {
	      //랜덤한 숫자 두개를 출력해서 문자열로 돌려주는 기능
		   num1 = random();
		   num2 = random();
		   
		   return num1+" + "+num2+" = "; //문제출제
	   }

	   @Override
	   public boolean checkAnswer(int ans) {
	     if(num1+num2==ans) {
	    	 return true;
	     }else {
	    	 return false;
	     }
	   }

}
