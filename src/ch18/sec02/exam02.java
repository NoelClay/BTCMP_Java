package ch18.sec02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			OutputStream os = new FileOutputStream("C:\\Temp\\test2.db");
		//	byte a=10, b=20, c=30;
			byte[] barr = {10, 20, 30};
	//		os.write(a);			os.write(b);			os.write(c);
			os.write(barr);
			os.flush();	os.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
