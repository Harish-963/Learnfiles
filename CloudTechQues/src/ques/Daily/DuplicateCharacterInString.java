package ques.Daily;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String: ");
			String str = sc.nextLine();
			LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
			for (char c : str.replaceAll("\\s", "").toCharArray()) {
				if (!charCount.containsKey(c)) {
					charCount.put(c, 1);
				} else {
					charCount.replace(c, charCount.get(c) + 1);
				}
			}

			charCount.entrySet().stream().filter(a -> a.getValue() > 1)
					.forEach(e -> System.out.print(e.getKey()+","));
		}

	}

}
