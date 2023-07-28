package LinearSearch;

public class SearchInRangeQues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int arr[] = { 434, 65, 34, 66, 88, 67, 98, 13, 4577, 9, 22 };
		int target = 9;
		int start = 2;
		int end = 6;
		int ans = searchinRange(arr, start, end, target);
		if (ans < arr.length) {
			System.out.println(target + " -> found at an index range of " + start + " - " + end + " is : " + ans);
		} else {
			{
				System.out.println(target + " -> not found at an index range of " + start + " - " + end);
			}
		}
	}

	public static int searchinRange(int arr[], int start, int end, int target) {
		if (arr.length == 0) {
			return Integer.MAX_VALUE;
		} else {
			for (int i = start; i <= end; i++) {
				if (target == arr[i]) {
					return i;
				}
			}
		}
		return Integer.MAX_VALUE;
	}
}
