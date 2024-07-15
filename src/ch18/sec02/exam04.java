package ch18.sec02;

import java.io.InputStream;
import java.io.FileInputStream;

public class exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//OutputStream os = new FileOutputStream("C:\\Temp\\test2.db");
			InputStream is = new FileInputStream("C:\\Temp\\test1.db");
			
			
//		//	byte a=10, b=20, c=30;
//			byte[] barr = {10, 20, 30, 40, 50};
//	//		os.write(a);			os.write(b);			os.write(c);
//			os.write(barr, 1, 3);
//			os.flush();	os.close();
//			
			while(is.available() != 0) {
				int data = is.read();
				if(data == -1) break;
				System.out.println(data);

			}
			is.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
