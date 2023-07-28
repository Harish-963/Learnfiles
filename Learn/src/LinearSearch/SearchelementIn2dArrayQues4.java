package LinearSearch;

public class SearchelementIn2dArrayQues4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 9, 8, 51, 35 }, { 456, 98, 566 }, { 23, 78, -1, 55, 63 } };

		int target = 9998;
		int ans[] = search(a, target);

		if ((ans[0] == -1) || (ans[1] == -1)) {
			System.out.println("element not found in the array");
		} else {
			System.out.println(target + " -> found at " + ans[0] + " ," + ans[1]);
		}
	}

	public static int[] search(int arr[][], int target) {

		int a[] = new int[2];
		a[0] = -1;
		a[1] = -1;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					a[0] = row;
					a[1] = col;
					return a;
				}
			}
		}
		return a;
	}
}
