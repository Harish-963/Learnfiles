package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Assignmnet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to find number of lines in a text file 
		File file =  new File("./filesassignment1.txt");
		if(file.exists())
		{
			try(FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {
				System.out.println(br.lines().count());
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
