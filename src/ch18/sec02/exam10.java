package ch18.sec02;

import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.Reader;
import java.io.Writer;
import java.time.LocalTime;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class exam10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//showcopytime() 매서드를 만든다.
		//파일 인풋 시스템과 아웃풋 시스템을 매개변수로 받은 뒤에 인풋이 아웃풋으로 복사하는데 까지 걸리는 시간을 반환
		
		String originfilepath = "C:\\Temp\\곰.jpeg";
		String copyfilepath1 = "C:\\Temp\\곰1.jpeg";
		String copyfilepath2 = "C:\\Temp\\곰2.jpeg";
		
		InputStream is = new FileInputStream(originfilepath);
		OutputStream os = new FileOutputStream(copyfilepath1);		
		
		System.out.println(	showcopytime(is, os));
		
		InputStream is2 = new FileInputStream(originfilepath);
		BufferedInputStream bi = new BufferedInputStream(is2);
		
		OutputStream os2 = new FileOutputStream(copyfilepath2);		
		BufferedOutputStream bo = new BufferedOutputStream(os2);
		
		System.out.println(	showcopytime(bi, bo));

	}

	private static int showcopytime(InputStream is, OutputStream os) throws Exception {

		LocalTime now = LocalTime.now();
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		is.close();
		os.close();
		
		LocalTime end = LocalTime.now();
		
		return end.getNano()-now.getNano() ;
	}
	
	private static String read(String filepath) throws Exception{
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream(filepath);
		Reader r = new InputStreamReader(is, "UTF-8");
		
		String result = "";
		char[] cbuffer = new char[100];
		int limit = r.read(cbuffer);
		for(int i=0; i<limit; i++) {
			result = result+ cbuffer[i];
		}
		
		r.close();
		
		return result;
	}

	private static void write(String filepath, String string) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream(filepath);
		Writer w = new OutputStreamWriter(os, "UTF-8");
		w.write(string);
		w.flush();
		w.close();
	}
	
}
