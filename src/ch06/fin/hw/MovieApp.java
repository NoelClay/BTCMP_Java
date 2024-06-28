package ch06.fin.hw;

//public class MovieApp {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		System.out.println("===========Movie Info=============");
//		
//		String title = "탑건";
//		String category = "액션";
//		String director = "조셉";
//		int runtime = 130;
//		String actor = "톰";
//		
//		Movie m = new Movie(title, category, director, runtime, actor);
//		m.PrintInfo();
//		
////		Movie m1 = new Movie();
////		m1.setTitle("탑건:매버릭");
////		m1.setDirector("조셉 코신스키");
////		m1.setCategory("액션");
////		m1.setRunningTime(110);
////		m1.PrintInfo();
////		
////		Movie m2 = new Movie("아바타 물의 길", "SF");
////		m2.setDirector("제임스카메론");
////		m2.setRunningTime(192);
////		m2.PrintInfo();
////		
////	}
////	static void PrintClass(Movie m) {
////		System.out.println("title: "  + m.title);
////		System.out.println("category: "  + m.category);
////		System.out.println("director: "  + m.director);
////		System.out.println("runningTime: "  + m.runningTime);
////	}
//
//	}
//}

public class MovieApp {

    public static void main(String[] args) {

        System.out.println("===== Actor Info =====");
        String name = "톰 크루즈";
        String sex = "남자";
        String birthdate = "1962.07.03";
        String nationality = "미국";
        Actor actor = new Actor(name, sex, birthdate, nationality);
        actor.printInfo();

        System.out.println("\n===== Movie Info =====");
        String title = "탑건 매버릭";
        String category = "액션";
        String director = "조셉 코신스키";
        int runningTime = 130;

        Movie m = new Movie(title, category, director, runningTime, actor);
        m.printInfo();
    }
}
