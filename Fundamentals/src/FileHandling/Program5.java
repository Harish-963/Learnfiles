package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("./program1.txt");
		if (file.exists()) {
			file.delete();
			file.createNewFile();
		}
		// write file..
		// different ways of file write
		// 1. FileOutputStream
		// 2. FileWriter
		// 3. BufferedWriter

		// FileOutStream
		//which will write character by character..
		try (FileOutputStream fos = new FileOutputStream(file)) {
			fos.write(75);
			fos.write(76);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
