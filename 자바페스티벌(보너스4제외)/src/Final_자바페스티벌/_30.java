package Final_자바페스티벌;

import java.util.Scanner;

public class _30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] alphabet = new int[26];
		
		System.out.print("입력 >> ");
		String s = sc.nextLine();	
		s = s.replace(" ","").toLowerCase();
		System.out.println("처리값 : "+s);
		
		for (int i=0; i < s.length(); i++) { 
			char c = s.charAt(i);	
			alphabet[c - 97]++; 
		}
		
		
		for (int i = 0; i < alphabet.length; i++) {	
			System.out.println((char)(i+97) + " : " +alphabet[i]); 
		}
		
		
	
		

	}

}
