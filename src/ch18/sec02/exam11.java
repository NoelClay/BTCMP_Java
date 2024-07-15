package ch18.sec02;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
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

public class exam11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//파일 시스템 사용해보기 
		//c temp 에 image 디렉토리, file1.txt, 2, 3 만들기
		//이후 c temp 모든 내역 출력하기
		
		String originfilepath = "C:\\Temp";
		
		File of = new File(originfilepath);
		
		File dir = new File(originfilepath + "\\images");
		File f1 = new File(originfilepath + "\\file1.txt");
		File f2 = new File(originfilepath + "\\file2.txt");
		File f3 = new File(originfilepath + "\\file3.txt");
		File f4 = new File(originfilepath + "\\file4.txt");
		
		if(!dir.exists())	dir.mkdir();
		if(!f1.exists())	f1.createNewFile();
		if(!f2.exists())	f2.createNewFile();
		if(!f3.exists())	f3.createNewFile();
		if(!f4.exists())	f4.createNewFile();
		
		File[] fs = of.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
				
		for(File f : fs) {
			if(f.isDirectory())
				System.out.println(sdf.format(new Date(f.lastModified())) + "<DIR>"+ f.getName());
			else
				System.out.println(sdf.format(new Date(f.lastModified())) + f.length()+ f.getName());

		}
		
//		String copyfilepath1 = "C:\\Temp\\곰1.jpeg";
//		String copyfilepath2 = "C:\\Temp\\곰2.jpeg";
//		
//		InputStream is = new FileInputStream(originfilepath);
//		OutputStream os = new FileOutputStream(copyfilepath1);		
//		
//		System.out.println(	showcopytime(is, os));
//		
//		InputStream is2 = new FileInputStream(originfilepath);
//		BufferedInputStream bi = new BufferedInputStream(is2);
//		
//		OutputStream os2 = new FileOutputStream(copyfilepath2);		
//		BufferedOutputStream bo = new BufferedOutputStream(os2);
//		
//		System.out.println(	showcopytime(bi, bo));

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
