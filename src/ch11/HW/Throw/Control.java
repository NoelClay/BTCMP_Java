package ch11.HW.Throw;

public class Control {

	public void method() throws Exception {
		System.out.println("\tControl.method()::Start");
		
		Service s = new Service();
//		try {
//			s.method();
//		}catch(Exception e) {
//			System.out.println("\t\t-----catch:Control.method()-------");
//		}
//		finally {
//			System.out.println("\t\t-----finally:Control.method()-------");
//		}
		s.method();

		
		System.out.println("\tControl.method()::End");
	}

}
