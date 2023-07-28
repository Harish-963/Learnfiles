package LinearSearch;

public class EvenDigits {

	public static void main(String[] args) {
		int a[] = { 12, 345, 2, 6, -78096 ,30};
		System.out.println("Total number of even number of digits are : " + findNumbers(a));
	}

	public static int findNumbers(int nums[]) {
		int len = nums.length;
		int evenDigitcount = 0;
		for (int i = 0; i < len; i++) {
			int cnt = 0;
			int n = 0;
			// if num is negative change to postive by multiplying with -1..
			if (nums[i] < 0) {
				n = nums[i] * -1;
			} else
				n = nums[i];
			while (n != 0) {
				cnt++;
				n = n / 10;
			}
			if (cnt % 2 == 0) {
				evenDigitcount++;
			}
			cnt = 0;
		}
		return evenDigitcount;
	}
}
