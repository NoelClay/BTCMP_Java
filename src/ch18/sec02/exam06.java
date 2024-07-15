package ch18.sec02;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//import java.util.stream.*;

public class exam06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		OutputStream os = null;
		InputStream is = null;
		
		try {
			os = new FileOutputStream("C:\\Temp\\java2.png");
			is = new FileInputStream("C:\\Temp\\java.png");
			
			
//		//	byte a=10, b=20, c=30;
//			byte[] barr = {10, 20, 30, 40, 50};
//	//		os.write(a);			os.write(b);			os.write(c);
//			os.write(barr, 1, 3);
//			os.flush();	os.close();
//			
			//데이터를 읽어올 사이즈 단위를 배열로 정의
			byte[] data = new byte[1024];
			
			while(true) {
				int chek = is.read(data);
				if(chek == -1) {
					System.out.println("===End===");
					break;
				}
				System.out.println(chek);
				
				os.write(data);

			}
			is.close();
			os.flush();
			os.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(is != null){
				is.close();
			}


			if(!os.equals(null)) {
				os.flush();
				os.close();
			}

		}
	}

}
