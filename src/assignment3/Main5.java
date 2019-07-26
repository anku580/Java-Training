package assignment3;

import java.util.Scanner;

class UserInterface5 {
	
	static String fileIdentifier(String input) {
		
		String[] words = input.split("[.]");
		
		return words[1];
	}
}
public class Main5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println(UserInterface5.fileIdentifier(input));

	}

}
