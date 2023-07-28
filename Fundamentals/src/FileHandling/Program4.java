package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Program4 {

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

		// Using BufferedReader.. for reading character by character
		int ascii;
		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {
			// for reading character by character
			while ((ascii = br.read()) != -1)
				System.out.print((char) ascii);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("");
		
	
		// Using BufferedReader.. for reading Line by Line
		String text;
				try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {
					// for reading line by line
					while((text = br.readLine())!= null)
					{
						System.out.println(text);
						
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				

	}

}
