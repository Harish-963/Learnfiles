package LinearSearch;

import java.util.Arrays;

public class RotationCountofanRotatedsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 14, 15, 18, 2, 3, 6, 12 };
		System.out.println("Original array : " + Arrays.toString(arr));
		System.out.println("Clock wise rotated array count : " + rotationClockwiseArray(arr));
	}

	public static int rotationClockwiseArray(int arr[]) {
		int count = 0;
		while (arr[arr.length - 1] < arr[count]) {
			count++;
		}

		return count;
	}

}
