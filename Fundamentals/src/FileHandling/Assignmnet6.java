package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class Assignmnet6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Radio program to update the existing text file to uppercase in the text file
		File file = new File("./filesassignment1.txt");
		if (file.exists()) {
			String line;
			StringBuilder Uppercase = new StringBuilder("");
			try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {
				while ((line = br.readLine()) != null) {
					System.out.println(line);
					Uppercase.append(line.toUpperCase() + "\n");
					System.out.println(line.toUpperCase());
				}
				try (FileWriter fw = new FileWriter(file, false);) {
					System.out.println("Type: "+Uppercase.getClass().getSimpleName());
					fw.write(String.valueOf(Uppercase));
				} catch (IOException e) {
					e.printStackTrace();
				}

			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				System.out.println("DOne");
			}
		}
	}

}
