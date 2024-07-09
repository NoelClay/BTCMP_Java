package ch11.HW.Throw;

public class Service {
	
	public void method() throws Exception {		
		System.out.println("\t\tService.method()::Start");
		
		String[] stringArray = new String[3];
		stringArray[0] = "A";
		stringArray[1] = "B";
		stringArray[2] = "C";
//		try {
//			for(int i=0; i<4; i++) {
//				System.out.printf("\t\tstringArray[%d]=%s\n", i, stringArray[i]);
//			}
//		}catch(Exception e) {
//			System.out.println("\t\t-----catch:Service.method()-------");
//		}
//		finally {
//			System.out.println("\t\t-----finally:Service.method()-------");
//		}

		for(int i=0; i<4; i++) {
			System.out.printf("\t\tstringArray[%d]=%s\n", i, stringArray[i]);
		}

		
		System.out.println("\t\tService.method()::End");
	}

}
