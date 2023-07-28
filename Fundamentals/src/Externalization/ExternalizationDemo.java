package Externalization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ExternalizationDemo {

	public static void main(String[] args) {
		Student s1 = new Student(20, "Harish", 65.3, 21, 99);
		Student s2 = new Student(10, "Harsha", 69.3, 29, 89);
		// for saving object byte stream into a file
		try {
			File file = new File("./externalizationserizationOutputFile.ser");
			if (file.exists()) {
				file.delete();
			}
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try (FileOutputStream fos = new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(s1);
				oos.writeObject(s2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("DOne bro");
		}
	}

}
