package ch06.fin.hw;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=====Singer Info=======");
		String name = "아이유";
		char sex = 'F';
		String birthDate = "1993.05.16";
		String company = "이담 엔터테인먼트";
		Singer singer = new Singer(name, sex, birthDate, company);
		singer.printInfo();
		
		System.out.println("\n=========Song========");
		String title = "밤편지";
		String releaseDate = "2019.03.24";
		Song song = new Song(title, singer, releaseDate);
		song.printInfo();
	}

}
