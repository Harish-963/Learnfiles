package ExeceptionHandling;

public class CustomException {

	public static void main(String[] args) throws LoginException  {
		// TODO Auto-generated method stub
		int i[] = { 1, 2, 3 };

		try {
			System.out.println(i[2] / 0);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e2) {
			// custom exception..
			throw new LoginException("Login is failed please check the credentials");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class LoginException extends Exception {

	public LoginException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
