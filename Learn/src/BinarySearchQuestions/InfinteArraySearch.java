package BinarySearchQuestions;

public class InfinteArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 5, 9, 66, 85, 333, 745, 852, 965, 999, 1052, 1098, 2015, 2096 };
		int target = 1098;
		int ans = ans(a, target);
		if (ans == -1) {
			System.out.println("element not found in given array");
		} else
			System.out.println(target + " found at index : " + ans);
	}

	private static int ans(int[] a, int target) {
		// this method task is to find the start and end index of infinite array when
		// target is in b/w start and end..
		// then after finding start and end perform binary search on the given array
		// with target ..
		int start = 0;
		int end = 1;

		while (target > a[end]) {
			int tempStart = end + 1;
			end = (end - start + 1) * 2 + end;
			start = tempStart;
		}

		return binarysearch(a, target, start, end);
	}

	public static int binarysearch(int arr[], int target, int start, int end) {

		while (!(start > end)) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return -1;
	}

}
