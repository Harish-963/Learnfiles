package BinarySearchQuestions;

public class FloorOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 7575;
		int ans = floor(a, target);
		if (!(ans == -1))
			System.out.println(ans);
		else
			System.out.println("can't find foor value ");
	}

	public static int floor(int arr[], int target) {

		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;

		if (target < arr[start])
			return -1;
		while (!(start > end)) {
			if (arr[mid] == target) {
				return arr[mid];
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}
		return arr[end];
	}
}
