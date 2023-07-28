package BinarySearchQuestions;

public class FindSmallestLetterGreaterThantarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[] = { 'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n' };
		char target = 'e';
		char ans = findSmallestLetterGreaterThantarget(a, target);
		// if(!(ans==-1))
		System.out.println(ans);
//		else
//			System.out.println("can't find ceiling value because the target is greater than the last element of the lettersay");
	}

	public static char findSmallestLetterGreaterThantarget(char letters[], char target) {

		int start = 0;
		int end = letters.length - 1;
		int mid = start + (end - start) / 2;
		if (target >= letters[end])
			return letters[0];
		while ((start <= end)) {
			if (target >= letters[mid])
				start = mid + 1;
			else
				end = mid - 1;
			mid = start + (end - start) / 2;
		}
		return letters[start];
	}
}
