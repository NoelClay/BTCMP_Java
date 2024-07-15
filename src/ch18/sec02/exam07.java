package ch18.sec02;

import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Reader r = new FileReader("C:\\Temp\\reader_writer.txt");
			Writer w = new FileWriter("C:\\Temp\\reader_writer.txt");
			
			char a = 'A', b = 'B';
			char[] carr = {'C', 'D', 'E'};
			String s = "FGH";
			
			w.write(a);
			w.write(b);
			w.write(carr);
			w.write(s);
			
			w.flush();
			w.close();
			r.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
