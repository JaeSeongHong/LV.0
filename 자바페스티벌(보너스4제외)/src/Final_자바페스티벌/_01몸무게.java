package Final_자바페스티벌;

import java.util.Scanner;

public class _01몸무게 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        
	      int b ;  //beginning weight
	      int g ;  //goal weight
	      int w = 1 ; //week
	      
	      System.out.print("현재 몸무게 : ");
	      b = sc.nextInt();	
	      System.out.print("목표 몸무게 : ");
	      g = sc.nextInt();
	      
	      int l = 0;   //뺀 무게
	      int sum = 0; //감량몸무게(l)의 합

	      while ((b-sum)>g) {	//c<=g면 동작을 멈춘다 
		      System.out.print(w+"주차 감량 몸무게 : ");
		      l=sc.nextInt(); 
		      sum = sum+l;  
		      w++;
	      }
	      System.out.println("최종몸무게 : " + (b-sum));   //왜 c가 반영이 안되는 걸까?
	      System.out.println("축하합니다!");
	     
	}

	
}

