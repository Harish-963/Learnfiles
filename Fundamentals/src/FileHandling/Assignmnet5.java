package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignmnet5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Write a program to merge 2 file data into a single new file
		String textf1 = "";
		String textf2 = "";
		// Below code is used to get the text of the first file and store it in the
		// textf1 variable
		File file = new File("./filesassignment1.txt");
		if (file.exists()) {
			String line;
			StringBuffer complete = new StringBuffer("");
			try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {
				while ((line = br.readLine()) != null) {
					complete.append(line + "\n");
				}
				textf1 = complete.toString();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		// Below code is used to get the text of the second file and store it in the
		// textf2 variable
		File file1 = new File("./filesassignment2.txt");
		if (file1.exists()) {
			String line;
			StringBuffer complete = new StringBuffer("");
			try (FileReader fr = new FileReader(file1); BufferedReader br = new BufferedReader(fr);) {
				while ((line = br.readLine()) != null) {
					complete.append(line + "\n");
				}
				textf2 = complete.toString();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		// Below code below code is used to create a new file called assignment merge
		// and add the text of previous 2 files From the above code
		File fileWrite = new File("./assignmentmerge.txt");
		if (fileWrite.exists()) {
			fileWrite.delete();
		}
		fileWrite.createNewFile();

		try (FileWriter fw = new FileWriter(fileWrite); BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write(textf1);
			bw.write(textf2);
		} catch (IOException e) {

		} finally {
			System.out.println("Done");
		}
	}

}
