import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyMapsQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,2,2,2,9,9,9,5,5,5,3,3,3,3,7,7,7,7,7,7,7,7,7};
		Map<Integer, Integer> count_frequency = new TreeMap<>();
		int count =1;
		for(int j=0;j<arr.length;j++)
		{
			for(int l=j+1;l<arr.length;l++)
			{
				if(arr[j]==arr[l])
				{
					count++;
				}
			}
			if(count>1)
			{
				if(!count_frequency.keySet().contains(Integer.valueOf(arr[j])))
				{
					count_frequency.put(Integer.valueOf(arr[j]), Integer.valueOf(count));
				}
			}
			count = 1;
		}
		
		count_frequency.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	   
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	}

}
