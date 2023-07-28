package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Assignmnet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to find occurrence of giving word in the text file
		File file = new File("./filesassignment1.txt");
		if (file.exists()) {
			int words_count_occurance = 0;
			String search_word = "am";
			try (FileInputStream fis = new FileInputStream(file); Scanner sc = new Scanner(fis);) {
				while (sc.hasNext()) {
					if ((sc.next()).equals(search_word))
						words_count_occurance++;

				}
				System.out.println("Word \'" + search_word + "\' Occurance Count: " + words_count_occurance);
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
