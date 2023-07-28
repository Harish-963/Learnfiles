package rough;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkIfPangram("dogdogdogdogdogdogdogdogdogdogdogdogdogdo"));

	}

	public static boolean checkIfPangram(String sentence) {
		int stringLen = sentence.length();
		int count = 0;
		boolean check = false;
		if (stringLen < 26) {
			return check;
		}
		for (int i = 97; i <= 122; i++) {
			for (int j = 0; j < stringLen; j++) {
				System.out.println((char) (i));
				if (((char) (i)) == (sentence.charAt(j))) {
					check = true;
					count++;
					break;
				}
			}
			if (check == false) {
				return check;
			}

		}
		System.out.println(count);
		if (count < 26) {
			check = false;
		}
		return check;
	}

}
