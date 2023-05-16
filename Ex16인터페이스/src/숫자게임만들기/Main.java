package 숫자게임만들기;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//지금까지 사용한 데이터
		//재실행시키면 사라지는 데이터 --> 휘발성 데이터
		//재실행을 시켜도 남아있는 데이터 --> 비휘발성
		
		//휘발성 --> 비휘발성
		//1)문서(메모장,엑셀,한글)
		//2)서버에 저장 --> 앞으로 배울것
		//3)DB에 데이터 저장
		
		//JDBC --> 
		
		
		// 개발자2
		// : 사용자가 보여질 부분이 들어갈 곳
		// : 뷰~

		//GameDummy game = new GameDummy();
		PlusGame game = new PlusGame();
		Scanner sc = new Scanner(System.in);
		// Member자료형을 관리하는 ArrayList 선언/초기화
		ArrayList<Member> members = new ArrayList<>();

		int round = 1; // 게임 라운드 체크
		boolean check = false; // 로그인 성공 / 실패
		int cnt = 1; //기회 카운트
		boolean check2 = true; //로그인 실패를 판단하는 변수

		while(round <6) {
			//회원가입 , 로그인 했을 경우 게임이 실행도되록 만들자!
			//회원가입 ---> 로그인을 성공 했으면 
			
			if(check==false) {
				System.out.print("[1]회원가입 [2]로그인>> ");
				int select1 = sc.nextInt();
				if(select1==1) {
					//회원가입
					System.out.print("닉네임 : ");
					String nick = sc.next();
					System.out.print("비밀번호 : ");
					String pw = sc.next();
					//Member자료형으로 nick,pw를 묶어 주자
					Member mem = new Member(nick,pw);
					// ArrayList --> 회원정보들을 관리하는
					members.add(mem);
					System.out.println("회원가입 성공!");
					//while문 처음으로 돌아가는 키워드
					continue;
				}else {
					//로그인
					System.out.print("닉네임 : ");
					String nick = sc.next();
					System.out.print("비밀번호 : ");
					String pw = sc.next();
					
					for(int i=0;i<members.size();i++) {
						//사용자가 입력한 닉넴, 비번과 일치하는 데이터가 있는지!
						if(members.get(i).getNick().equals(nick)
								&& members.get(i).getPw().equals(pw)) {
							System.out.println("로그인 성공!");
							//더이상 로그인할 필요가 없기때문에
							check = true;
						}else {
							System.out.println("로그인 실패!");
							check2 = false;
							break;
						}
						
						
						
					}
					if (check2 == false) {
						//다시 화면 볼수 있도록
						continue;
					}
				}
			}
			//5라운드까지만 동작할 수 있도록 만들자
			//문제를 출제
			String quiz = game.getQuizMsg();
			//--> 문제정답을 틀렸을때 똑같은 문제를 다시 출제
			//몇라운드인지!
			System.out.print(round+"라운드 : "+quiz);
			//정답입력받기
			int ans = sc.nextInt();
			// 맞는지 틀린지 확인 : checkAnswer(int ans)
			boolean ck = game.checkAnswer(ans); // true/false 반환
			
			if(ck==false) {
				//틀렸다면
				//총 3번의 기회를 더 준다! --> 같은문제를 풀 수 있는
				while(cnt < 4) {
					//cnt가 4보다 작을동안 동작
					//만약 +1씩 증가시키면 총 3번까지 동작할 수 있는 while문
					System.out.println("틀렸습니다.");
					//위에 출제되었는 문제 그대로 출력
					System.out.print(round+"라운드 : "+quiz);
					ans = sc.nextInt();
					ck = game.checkAnswer(ans);
					if(ck==true) {
						break;
					}
					cnt++;
				}
				
			}else {
				//정답이면
				System.out.println("정답입니다.");
			}
			
			//라운드 종료
			round++;
			System.out.println();
			
			
			
			
		}

	}

}
