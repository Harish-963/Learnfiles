package Binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 5, 2 };
		int target = 2;
		int ans = binarysearch(a, target);
		if (ans == -1) {
			System.out.println("element not found in given array");
		} else
			System.out.println(target + " found at index : " + ans);
	}

	public static int binarysearch(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;

		while (!(start > end)) {
			int mid = (start + end) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}

		}
		return -1;
	}

}
