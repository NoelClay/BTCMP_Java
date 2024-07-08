package ch15.HW.MenuApp;

public class MenuService {

	public static Coffee MakeCoffee(String s, int i, String s2) {
		return new Coffee(s, i, s2);
	}

	public static Ade MakeAde(String s, int i, String s2) {
		// TODO Auto-generated method stub
		return new Ade(s, i, s2);
	}
}
