package ch11.HW.Throw;

public class App {

	public static void main(String args[]) throws Exception{
		System.out.println("App.main()::Start");
		
		Control c = new Control();
		try {
			c.method();
		}catch(Exception e) {		
			System.out.println("-----catch:Main.method()-------");
		}finally {
			System.out.println("-----finally:main.method()-------");
		}
		System.out.println("App.main()::End");	
	}
}