package BinarySearchQuestions;

import java.util.Arrays;

public class FirstandLastOccuranceofTargetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 10, };
		int target = 7;
		System.out.println(Arrays.toString(firstandLastOccuranceofTargetElement(a, target)));
	}

	public static int[] firstandLastOccuranceofTargetElement(int arr[], int target) {
		int a[] = { -1, -1 };
		if (arr.length == 0) {
			return a;
		}
		int first = searchtarget(arr, target, true);
		int last = searchtarget(arr, target, false);
		a[0] = first;
		a[1] = last;

		return a;

	}

	public static int searchtarget(int arr[], int target, boolean checkfirstOccurence) {
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid])
				end = mid - 1;
			else if (target > arr[mid])
				start = mid + 1;
			else {
				// potential value..
				ans = mid;
				if (checkfirstOccurence) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}
		return ans;
	}

}
