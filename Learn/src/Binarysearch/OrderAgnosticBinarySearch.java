package Binarysearch;

//this my own try ..
public class OrderAgnosticBinarySearch {
//this will work for both ascending array and decending array..
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 965, 852, 642, 525, 98, 25, 23, 2, 1, 0, -1, -999, -98989 };// decending array
		// int a[] = { 1, 2, 5, 9, 66, 85, 333, 745, 852, 965 }; //ascending array
		int target = 2;
		int ans = Integer.MAX_VALUE;
		if (a[0] < a[a.length - 1]) {
			System.out.println("this ascending array");
			ans = binarysearchAscendingArray(a, target);
		} else {
			System.out.println("this is decending array");
			ans = binarysearchDecendingArray(a, target);
		}
		if (ans == -1) {
			System.out.println("element not found in given array");
		} else
			System.out.println(target + " found at index : " + ans);
	}

	// this will work for ascending array
	public static int binarysearchAscendingArray(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;

		while (!(start > end)) {
			if (arr[mid] == target) {
				return mid;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}
		return -1;
	}

	// this will work for decending array
	public static int binarysearchDecendingArray(int arr[], int target) {
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
