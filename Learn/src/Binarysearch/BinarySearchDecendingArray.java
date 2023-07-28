package Binarysearch;

public class BinarySearchDecendingArray {
//thisis for decending array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 965, 852, 642, 525, 98, 25, 23, 2, 1, 0, -1, -999, -98989 };
		int target = 2;
		int ans = binarysearchdecendingarray(a, target);
		if (ans == -1) {
			System.out.println("element not found in given array");
		} else
			System.out.println(target + " found at index : " + ans);
	}

	public static int binarysearchdecendingarray(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;

		while (!(start > end)) {
			if (arr[mid] == target) {
				return mid;
			} else if (target > arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		return -1;
	}

}
