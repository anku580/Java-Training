package assignment2;
import java.util.*;

class UserMainCode3 {
	
	static int validatestrings(String input)
	{
		if(input.charAt(0) == 'A' && input.charAt(1) == 'B' && input.charAt(2) == 'C' && input.charAt(3) == '-') {
			for(int i=4; i<input.length(); i++) {
				int output = isDigit(input.charAt(i));
				if(output == -1)
				{
					return -1;
				}
			}
			return 1;
		}
		return -1;
	}
	
	static int isDigit(char alphabet)
	{
		int number = alphabet - '0';
		
		if(number >= 0 && number <= 9) {
			return 1;
		}
		return -1;
	}
}

public class Main3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = sc.nextLine();
		
		int result = UserMainCode3.validatestrings(input);
		
		if(result == 1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
