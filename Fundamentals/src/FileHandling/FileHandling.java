package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileHandling {

	public static void main(String[] args) {
		File f = new File("./filehanding1.txt");
		// create a file
		try {
			System.out.println("create: " + f.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}

		// delete file
		System.out.println("Delete: " + f.delete());

		// check if files exists or not and create a file
		if (!f.exists()) {
			try {
				System.out.println("not Exists so created: " + f.createNewFile());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// set access and get access
		System.out.println("readonly is setted: " + f.setReadOnly());
		// get access
		System.out.println("readonly is setted or not: " + f.canRead());
		System.out.println("writeonly is setted or not: " + f.canWrite());

		// Check hidden
		System.out.println("Check Hidden:" + f.isHidden());

		// get file path
		System.out.println("file path: " + f.getAbsoluteFile());

		// modified..
		System.out.println("date modified: " + new Date(f.lastModified()));

		// print list of files in directory..
		File f1 = new File("E:\\");
		// name
		System.out.println(Arrays.toString(f1.list()));
		// complete path
		System.out.println(Arrays.toString(f1.listFiles()));
	}
}
