package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Assignmnet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to find lengthy line in the text file
		File file = new File("./filesassignment1.txt");
		if (file.exists()) {
			int max_length = 0;
			String max_line = "";
			String line;
			try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {
				while ((line = br.readLine()) != null) {
					if (line.length() > max_length) {
						max_length = line.length();
						max_line = line;
					}
				}
				System.out.println("Max Line: " + max_line);
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
