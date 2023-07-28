package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Program7 {

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

		// BufferedWriter
		//which will write character by character or by String, arracy of characters..
		try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw);) {
			//string
			bw.write("Hello"); 
			//char array
			bw.write("Hello".toCharArray());
			//
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
