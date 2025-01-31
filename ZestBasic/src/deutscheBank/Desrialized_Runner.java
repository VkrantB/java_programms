package deutscheBank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Desrialized_Runner {
//	Serialization=> Converting Java Object into ByteStream for Storage & transmission
//	De-Serialization=> Converting ByteStream into Java Object  

	public static void main(String[] args) {

		File myFile = new File("person.ser");
		FileInputStream fis;
		ObjectInputStream ois;
		Person p1 = null;
		try {
			fis = new FileInputStream(myFile);
			ois = new ObjectInputStream(fis);
			p1 = (Person) ois.readObject();

		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();

			System.out.println("Data Name" + p1);
		}
	}
}
