package LinearSearch;

public class MinElementinArrayQues3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 878, 5, 41, 99, 63, 2, 5, -8, 31, 46, -20, -1 };
//		int arr[] = {};
		int ans = min(arr);
		if (ans == Integer.MAX_VALUE) {
			System.out.println("array is null");
		} else
			System.out.println("minimum element of given array is " + ans);
	}

	public static int min(int arr[]) {
		if (arr.length == 0) {
			return Integer.MAX_VALUE;
		}
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

}
