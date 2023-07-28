package rough;

import java.util.Arrays;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 98, 23, 45, 65, 67, 94, 27, 10, 3, 82 };
		int target = 27;
		
		int ans = Bsfind(a, target);
		if(ans!=-1)
		System.out.println("found at index : "+ ans);
		else
		System.out.println("element not present in the array");

	}

	private static int Bsfind(int[] a, int target) {
		Arrays.sort(a);

		int start = 0;
		int end = a.length - 1;
		int mid = (start +end) / 2;

		while (start <=end) {
			if (target == a[mid]) {
				return mid;
			} else if (target > a[mid]) {
				start = mid + 1;
			} else if (target < a[mid]) {
				end = mid - 1;
			}
			mid = (start +end) / 2;
		}
		return -1;

	}

}
