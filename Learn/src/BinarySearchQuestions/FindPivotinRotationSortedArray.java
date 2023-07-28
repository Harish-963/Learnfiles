package BinarySearchQuestions;

public class FindPivotinRotationSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,3,4,5,6,7};
		System.out.println(pivot(arr));
	}

	// pivot means big number in array
	public static int pivot(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return -1;
	}

}
