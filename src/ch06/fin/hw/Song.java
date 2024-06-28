package ch06.fin.hw;

public class Song {
	String title;
	String releaseDate;
	Singer singer;
	/**
	 * @return the title
	 */
	String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the releaseDate
	 */
	String getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	/**
	 * @return the singer
	 */
	Singer getSinger() {
		return singer;
	}
	/**
	 * @param singer the singer to set
	 */
	void setSinger(Singer singer) {
		this.singer = singer;
	}
	Song(String title, Singer singer, String releaseDate) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.singer = singer;
	}
	
	void printInfo() {
		System.out.printf(" 제목: %s | ", getTitle());
		System.out.printf(" 발매일: %s | ", getReleaseDate());
		System.out.println();
		singer.printInfo();
	}
	

}
