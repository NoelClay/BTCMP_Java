package ch06.fin.hw;

import java.time.*;
import java.time.format.*;

public class Song {
	String title;
	String releaseDate;
	Singer singer;
	String singername;
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
	
	public Song(String title2, String string, String releaseDate2) {
		// TODO Auto-generated constructor stub
		this.title = title2;
		//this.singername = string;
		singer = new Singer(string);
		
		this.releaseDate = releaseDate2;
	}
	void printInfo() {
		System.out.printf(" 제목: %s | ", getTitle());
		System.out.printf(" 가수: %s | ", singer.getName());
		
		LocalDate localDate2 = LocalDate.parse(getReleaseDate(), DateTimeFormatter.ofPattern("yyyyMMdd"));
		String s = localDate2.format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
		System.out.printf(" 발매일: %s ", s);
		
		String year = getReleaseDate().substring(0, 4);
		String month = getReleaseDate().substring(4, 6);
		String day = getReleaseDate().substring(6);
		
		String convertdate = year + "." + month +"."+day;
		System.out.printf(" 발매일: %s ", convertdate);
		
		System.out.println();
		//singer.printInfo();
	}
	

}
