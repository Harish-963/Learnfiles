package ExeceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class TrywithResources {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		File file = new File("./simple.txt");
		
		try(
		FileReader fr = new FileReader(file);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		){
			String text = new String();
			String line = new String();
			while((line = br.readLine()) != null)
			{
				text+=line+"\n";
			}
			System.out.println(text);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
	}

}
