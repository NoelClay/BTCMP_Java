package ch06.Homework;

public class PrintMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie m1 = new Movie();
		m1.setTitle("탑건:매버릭");
		m1.setDirector("조셉 코신스키");
		m1.setCategory("액션");
		m1.setRunningTime(110);
		m1.PrintInfo();
		
		Movie m2 = new Movie("아바타 물의 길", "SF");
		m2.setDirector("제임스카메론");
		m2.setRunningTime(192);
		m2.PrintInfo();
		
		Movie m3 = new Movie("인사이드아웃", "애니메", "켈시 맨", 96);
		m3.PrintInfo();
	}
	static void PrintClass(Movie m) {
		System.out.println("title: "  + m.title);
		System.out.println("category: "  + m.category);
		System.out.println("director: "  + m.director);
		System.out.println("runningTime: "  + m.runningTime);
	}

}
