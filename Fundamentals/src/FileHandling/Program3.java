package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {

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

		// Using FileReader..
		int ascii;
		try (FileReader fr = new FileReader(file);) {
			while ((ascii = fr.read()) != -1)
				System.out.print((char) ascii);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
