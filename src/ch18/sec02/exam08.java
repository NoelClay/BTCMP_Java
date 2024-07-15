package ch18.sec02;

import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;

public class exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Reader r = new FileReader("C:\\Temp\\reader_writer.txt");
	//		Writer w = new FileWriter("C:\\Temp\\reader_writer.txt");
			
//			char a = 'A', b = 'B';
//			char[] carr = {'C', 'D', 'E'};
//			String s = "FGH";
			
//			w.write(a);
//			w.write(b);
//			w.write(carr);
//			w.write(s);
//			
//			w.flush();
//			w.close();
			
//			while(true) {
//				int a = r.read();
//				if(a == -1) break;
//				System.out.println((char)a);
//			}
//			
			for(int a = r.read() ; a != -1; a=r.read())
				System.out.println((char)a);
			
			r.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
