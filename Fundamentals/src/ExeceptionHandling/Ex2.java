package ExeceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//io exeception..
		int i = 10;
		try {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int j = Integer.parseInt(sc.readLine());
		
		int k = i/j;
		System.out.println(k);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
