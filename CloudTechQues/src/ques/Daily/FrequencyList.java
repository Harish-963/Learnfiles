package ques.Daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FrequencyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		getStringFrequencyBruteForce("I am a Boy BroSir");
		getStringFrequencyStreams("I am a Boy BroSir");
	}

	//brute force
	public static void getStringFrequencyBruteForce(String sentence) {
		String words_arr[] = sentence.split(" ");

		HashMap<Integer, String[]> map = new HashMap<>();
		for (String word : words_arr) {
			int length = word.length();
			if (!map.containsKey(length)) {
				map.put(length, new String[] { word });
			} else {
				String[] existing_arr = map.get(length);
				String[] new_arr = new String[existing_arr.length + 1];
				System.arraycopy(existing_arr, 0, new_arr, 0, existing_arr.length);
				new_arr[existing_arr.length] = word;
				map.put(length, new_arr);
			}
		}
		
		//streams advanced
		for (Entry<Integer, String[]> e : map.entrySet()) {
			System.out.println(e.getKey() + ", " + Arrays.toString(e.getValue()));
		}

	}
	
	public static void getStringFrequencyStreams(String sentence) {
		String words_arr[] = sentence.split(" ");
		
		List<String> words=Arrays.asList(words_arr);
		Map<Integer, List<String>> map = words.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(map.toString());
	}

}
