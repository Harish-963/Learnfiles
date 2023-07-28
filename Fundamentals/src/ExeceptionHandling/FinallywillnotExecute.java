package ExeceptionHandling;

public class FinallywillnotExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = { 1, 2, 3 };

		try {
			System.out.println(i[2] / 0);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e2) {
			e2.printStackTrace();
			System.err.println("Common exception");
			// its is destroying the thread to stop execution the code next to this..
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}

}
