package ch18.hw1.WriteObjectFileApp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ReadObjectFileApp {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			System.out.println("===== Start =====");

			fos = new FileOutputStream("C:/Temp/person.dat");
			oos = new ObjectOutputStream(fos);

			Person person = new Person("Paige", 20);
			oos.writeObject(person);
	

			oos.close();
			fos.close();

			System.out.println("===== End =====");

		} catch (IOException e) {
			System.out.println("\n===== catch() : IOException =====");
			e.printStackTrace();
		} 

	}

}