package assignment;

import java.util.Scanner;


class UserMainCode5 {
	
	static int validatePassword(String password) {
		
		int countDigits = 0;
		int countSpecialCharacters = 0;
		
		if(password.length() < 7 && password.length() > 19)
			return -1;
		else {
			for(int i=0; i<password.length(); i++) {
				
				int number = password.charAt(i) - '0';
				if(number >= 0 && number <=9) {
					countDigits++;
				}
				char alpha = password.charAt(i);
				if(alpha == '@' || alpha == '#' || alpha == '$'){
					countSpecialCharacters++;
				}
			}
		}
		
		if(countDigits > 0 && countSpecialCharacters > 0) {
			return 1;
		}
		return -1;
		
	}
}

public class Main5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = sc.nextLine();
		
		int result = UserMainCode5.validatePassword(input);
		
		if(result == 1)
			System.out.println("Valid Password!");
		else
			System.out.println("Invalid Password!");

	}

}
