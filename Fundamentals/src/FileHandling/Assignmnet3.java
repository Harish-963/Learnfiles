package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Assignmnet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to find count of words in a text file
		File file = new File("./filesassignment1.txt");
		if (file.exists()) {
			int words_count = 0;
			try (FileInputStream fis = new FileInputStream(file); Scanner sc = new Scanner(fis);) {
				while (sc.hasNext()) {
					sc.next();
					words_count++;

				}
				System.out.println("Words Count: " + words_count);
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
