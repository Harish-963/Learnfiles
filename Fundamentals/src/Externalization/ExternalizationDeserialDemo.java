package Externalization;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExternalizationDeserialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("./externalizationserizationOutputFile.ser");

			try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
				// for printing first object
//				Student deserialized_s1 = (Student) ois.readObject();
//				System.out.println(deserialized_s1.toString());

				System.out.println("-----------> Multiple objects printing");
				// for printing multiple objects
				while (true) {
					Student deserialized_multiple = (Student) ois.readObject();
					System.out.println(deserialized_multiple.toString());
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("done");
		}

	}

}
