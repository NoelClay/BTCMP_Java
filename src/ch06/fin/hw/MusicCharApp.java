package ch06.fin.hw;

public class MusicCharApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song[] songArray = new Song[3];
		songArray[0] = new Song("불타오르네", "BTS", "20160502");
		songArray[1] = new Song("밤편지", "아이유", "20190324");
		songArray[2] = new Song("낮 밤", "이영지", "20211029");
		
		MusicChart mc = new MusicChart(songArray);
		mc.printMusicChart();
	}
}
