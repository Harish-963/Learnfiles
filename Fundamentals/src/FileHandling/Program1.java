package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("./program1.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		// read file..
		// different ways of file reading
		// 1. FileInputStream
		// 2. Scanner
		// 3. FileReader
		// 4. BufferedReader

		// Using FileInputStream..
		int ascii;
		try (FileInputStream fis = new FileInputStream(file);) {
			while ((ascii = fis.read()) != -1)
				System.out.print((char) ascii);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
