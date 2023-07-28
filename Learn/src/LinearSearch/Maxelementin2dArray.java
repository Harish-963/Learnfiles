package LinearSearch;

public class Maxelementin2dArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 9, 8, 51, 35 }, { 456, 98, 566 }, { 23, 78, -1, 55, 6398989 } };

		int ans = max2d(a);

		System.out.println("max number in given array: " + ans);

	}

	// using for each loop
	public static int max2d(int arr[][]) {

		int max = Integer.MIN_VALUE;
		for (int[] num : arr) {
			for (int inum : num) {
				if (inum > max) {
					max = inum;
				}
			}
		}
		return max;
	}
}
