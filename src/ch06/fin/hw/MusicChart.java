package ch06.fin.hw;

public class MusicChart {
	Song[] songArray;
	Song[] getSongArray() {
		return songArray;
	}
	void setSongArray(Song[] songArray) {
		this.songArray = songArray;
	}
	
	MusicChart(Song[] songArray) {
		
		this.songArray = songArray;
	}
	
	void printMusicChart() {
		for( int i=0; i<songArray.length; i++ ) {
			System.out.print(i+".");
			songArray[i].printInfo();
			System.out.println();
		}
	}
}
