package ch18.sec02;

import java.io.Reader;
import java.io.Writer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class exam09 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//exam09 클래스는 함수 write()로 파일을 쓰고 와 read()로 파일을 출력할거야.
		
		// write() 매서드는 파일 output 스트림으로 파일을 읽어오고, Writer() 클래스로 변환해서 사용
		
		//read() 매서드는 파일 InputStream으로 파일을 읽어오고, Reader 클래스로 변환해서 사용한다.
		String filepath = "C:\\Temp\\reader_writer.txt";
		
		write(filepath, "가나다라마바사");
		String result = read(filepath);
		System.out.println(result);
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
