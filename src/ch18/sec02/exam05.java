package ch18.sec02;

import java.io.InputStream;
import java.io.FileInputStream;

public class exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//OutputStream os = new FileOutputStream("C:\\Temp\\test2.db");
			InputStream is = new FileInputStream("C:\\Temp\\test2.db");
			
			
//		//	byte a=10, b=20, c=30;
//			byte[] barr = {10, 20, 30, 40, 50};
//	//		os.write(a);			os.write(b);			os.write(c);
//			os.write(barr, 1, 3);
//			os.flush();	os.close();
//			
			//데이터를 읽어올 사이즈 단위를 배열로 정의
			byte[] data = new byte[100];
			
			while(true) {
				int chek = is.read(data);
				if(chek == -1) {
					System.out.println("===End===");
					break;
				}
				System.out.println(chek);

				for(int i =0; i<chek; i++) {
					System.out.println(data[i]);

				}

			}
			is.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
