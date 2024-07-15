package ch18.hw1.WriteObjectFileApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteObjectFileApp {

	public static void main(String[] args) throws ClassNotFoundException {

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			System.out.println("===== Start =====");

			fis = new FileInputStream("C:/Temp/person.dat");
			ois = new ObjectInputStream(fis);

			Person person = null;
			person = (Person)ois.readObject();

			System.out.println(person);
			System.out.println(person.printInfo());
			
			ois.close();
			fis.close();

			System.out.println("===== End =====");

		} catch (IOException e) {
			System.out.println("\n===== catch() : IOException =====");
			e.printStackTrace();
		} 

	}

}