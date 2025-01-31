package deutscheBank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Runner {

	public static void main(String[] args) {

		Person p1 = new Person("Vikram");
		System.out.println(p1);

		File serializedData = new File("person.ser");
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream(serializedData);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
