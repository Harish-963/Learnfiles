package Patterns;

public class Patterns {
	public static void main(String[] args) {
		pattern30(5);
	}

	private static void pattern3(int n) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= n; row++) {
			for (int col = n - row + 1; col >= 1; col--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

	private static void pattern4(int n) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.print("\n");
		}

	}

	private static void pattern5(int n) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= (2 * n) - 1; row++) {
			if (row > n) {
				int colcount = n - (row - n);
				for (int col = 1; col <= colcount; col++) {
					System.out.print("*");
				}
				System.out.print("\n");
			} else {
				for (int col = 1; col <= row; col++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}

	}

	private static void pattern28(int n) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= (2 * n) - 1; row++) {
			if (row > n) {
				int colcount = n - (row - n);
				for (int col = 1; col <= row - n; col++) {
					System.out.print(" ");
				}
				for (int col = 1; col <= colcount; col++) {
					System.out.print("* ");
				}
				System.out.print("\n");
			} else {
				for (int col = 1; col <= n - row; col++) {
					System.out.print(" ");
				}
				for (int col = 1; col <= row; col++) {
					System.out.print("* ");
				}
				System.out.print("\n");
			}
		}

	}

	private static void pattern30(int n) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print("  ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			for (int col = 2; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.print("\n");
		}

	}

	private static void pattern17(int n) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= (2 * n) - 1; row++) {
			if (row > n) {
				int countcol = n - (row - n);
				for (int col = 1; col <= row - n; col++) {
					System.out.print("  ");
				}
				for (int col = countcol; col >= 1; col--) {
					System.out.print(col + " ");
				}
				for (int col = 2; col <= countcol; col++) {
					System.out.print(col + " ");
				}
				System.out.print("\n");
			}

			else {
				for (int col = 1; col <= n - row; col++) {
					System.out.print("  ");
				}
				for (int col = row; col >= 1; col--) {
					System.out.print(col + " ");
				}
				for (int col = 2; col <= row; col++) {
					System.out.print(col + " ");
				}
				System.out.print("\n");
			}
		}
	}

}
