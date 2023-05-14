
public class Model {
	//Music에 대한 정보,데이터  설계도 작성
	
	//설계도 = VO(value object)
	
	////////////////////////////////필드
	private String songName; //음악제목
	private String singer; // 가수이름
	private int playTime; // 플레이타임
	private String musicPath; // 음악파일 경로
	
	////////////////////////////////생성자(메소드)
	public Model(String songName, String singer, int playTime, String musicPath) {
		//매개인자로 넣어준 값으로 필드초기화
		this.songName=songName;
		this.singer=singer;
		this.playTime=playTime;
		this.musicPath=musicPath;
	}
	
	////////////////////////////////getter,setter

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public String getMusicPath() {
		return musicPath;
	}

	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
	}
	
	
	
	
	
	
	
}
