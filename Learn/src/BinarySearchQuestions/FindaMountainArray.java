package BinarySearchQuestions;

public class FindaMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 5, 2 };
		int target = 2;
		int ans = ans(a, target);
		if (ans == -1) {
			System.out.println("element not found in given array" + ans);
		} else
			System.out.println(target + " found at index : " + ans);
	}

	public static int ans(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1])
				end = mid;
			else
				start = mid + 1;
		}
		System.out.println(end);
		int asc = binarysearch(arr, target, 0, end);
		int dec = binarysearch(arr, target, end, arr.length - 1);
		if (asc != -1 && dec != -1) {
			return asc < dec ? asc : dec;
		} else if (asc != -1 && dec == -1) {
			return asc;
		} else if (asc == -1 && dec != -1) {
			return dec;
		} else {
			return -1;
		}
	}

	public static int binarysearch(int arr[], int target, int start, int end) {
		boolean isAscending = arr[start] < arr[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (isAscending) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target < arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}

		}
		return -1;
	}

}
