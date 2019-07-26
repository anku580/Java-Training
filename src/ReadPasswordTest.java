import java.io.Console;

public class ReadPasswordTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = System.console();	
		
		System.out.println("Enter password: ");
		char[] ch = c.readPassword();
		
		String pass = String.valueOf(ch); //converting char array into string
		System.out.println("Password is: " + pass);
	}

}
