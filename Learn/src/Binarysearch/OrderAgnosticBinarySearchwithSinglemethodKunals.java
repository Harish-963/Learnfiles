package Binarysearch;

//this kunal's idea of this..
public class OrderAgnosticBinarySearchwithSinglemethodKunals {
//this will work for both ascending array and decending array..
	public static void main(String[] args) {
		int a[] = { 965, 852, 642, 525, 98, 25, 23, 2, 1, 0, -1, -999, -98989 };// decending array
		// int a[] = { 1, 2, 5, 9, 66, 85, 333, 745, 852, 965 }; //ascending array
		int target = 2;
		int ans = orderAgnosticBinarySearch(a, target);
		if (ans == -1) {
			System.out.println("element not found in given array");
		} else
			System.out.println(target + " found at index : " + ans);
	}

	// this method will work for both ascending array and decending array..
	public static int orderAgnosticBinarySearch(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;
		boolean isAscending = arr[start] < arr[end];
		while (!(start > end)) {
			if (arr[mid] == target) {
				return mid;
			}
			if (isAscending) {
				if (target > arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

			mid = (start + end) / 2;

		}
		return -1;
	}
}
