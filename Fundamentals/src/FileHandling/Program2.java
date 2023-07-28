package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("./program1.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// read file..
		// different ways of file reading
		// 1. FileInputStream
		// 2. Scanner
		// 3. FileReader
		// 4. BufferedReader

		// Using Scanner.. with passing file instance
		try (Scanner sc = new Scanner(file);) {
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\n--\n");
		// Using Scanner.. with passing fileinputstream instance
		try (FileInputStream fis = new FileInputStream(file); Scanner sc = new Scanner(fis);) {
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
