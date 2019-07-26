import java.io.Console;

public class ReadStringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = System.console();
		System.out.println("Enter yout name: ");
		String n = c.readLine();
		System.out.println("Welcome " + n);
	}

}
