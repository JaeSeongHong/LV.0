import java.util.ArrayList;

import javazoom.jl.player.MP3Player;



public class Controller {
	// controller는 사용자가 쓸수없다, 사용자는 뷰를 통해서만 가능
	// controller 역할 : 비즈니스 로직
	// View로부터 데이터를 받아서 가공 or 처리 역할
	// Model의 데이터를 수정하거나 가지고오는 역할 수행
	// View에 결과를 전달
	// jar = Library
	
	// 곡 5개를 저장할 수있는 ArrayList 생성
	ArrayList<Model> musicList = new ArrayList<Model>(5);
	
	//노래를 재생 / 정지할 수 있는 기능을 가진 객체 생성하기 -> player.jar(Mp3Player 활용)
	MP3Player mp3 = new MP3Player();
	
	//musicList에 있는 노래 순서를 관리 할 수 있는 변수 생성하기
	int index = 0; //전역변수 : 모든 메소드들이 공유할 수 있도록!
	
	/////////////////////////생성자
	public Controller() {
		//Controller 객체가 생성이 되자마자 음악을 미리 세팅! ->바로재생 가능하도록!
		//Model 객체 생성하기
		//Model m = new Model();
		//musiclist.add(m);
		// / : 폴더안에 들어감
		musicList.add(new Model("attention","뉴진스",5,"music/attention.mp3")); //위에 두줄을 한줄로 합친것
		musicList.add(new Model("cookie","뉴진스",50,"music/cookie.mp3")); 
		musicList.add(new Model("ditto","뉴진스",100,"music/ditto.mp3")); 
		musicList.add(new Model("hypeboy","뉴진스",120,"music/hypeboy.mp3")); 
		musicList.add(new Model("OMG","뉴진스",118,"music/OMG.mp3")); 
	}
	
	// 재생 기능 만들기
	public void play() {
		
		//현재 재생중인 음악이 있는지 확인하기
		if(mp3.isPlaying()) {
			//현재 재생중인 음악 정지하기
			mp3.stop();
		}
		
		//index가 가리키고있는 위치에 음악을 재생
		mp3.play(musicList.get(index).getMusicPath());
		show();
		
		System.out.println();
		System.out.println();
	}
	
	//정지 만들기
	public void stop() {
		mp3.stop(); //현재 음악재생정지
	}
	
	//다음곡 만들기
	public void next() {
		
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		if(index < musicList.size()-1) {//index가 0~3
			index++; //인덱스 1 증가
		}else {//index4
			index=0;
		}
		mp3.play(musicList.get(index).getMusicPath());
		show();
	}
	
	//이전곡 만들기
	public void previous() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		if(index > 0) {//index가 0~3
			index--; //인덱스 1 감소
		}else if (index <= 0){//index4
			index = musicList.size()-1;
		}
		mp3.play(musicList.get(index).getMusicPath());
		show();
	}
	
	//현재 재생중인 곡 정보 출력
	public void show() {
		System.out.println(musicList.get(index).getSongName()+" - "
				+musicList.get(index).getSinger());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
