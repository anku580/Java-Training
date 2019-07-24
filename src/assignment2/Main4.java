package assignment2;

import java.util.Scanner;


class UserMainCode4 {
	
	static int validatePassword(String password) {
		
		int countSpecialCharacters = 0;
		
		if(password.length() < 8)
			return -1;
		else if(specialCharacter(password.charAt(0)) == 1)
			return -1;
		else if(isDigit(password.charAt(0)) == 1) 
			return -1;
		else if(specialCharacter(password.charAt(password.length()-1)) == 1)
			return -1;
		else {
			for(int i=0; i<password.length(); i++) {
				
				char alpha = password.charAt(i);
				if(specialCharacter(alpha) == 1){
					countSpecialCharacters++;
				}
			}
			if(countSpecialCharacters > 0) {
				return 1;
			}
		}
		return -1;
		
	}
	
	static int specialCharacter(char a)
	{
		if(a == '@' || a == '#' || a == '$')
			return 1;
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

public class Main4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = sc.nextLine();
		
		int result = UserMainCode4.validatePassword(input);
		
		if(result == 1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
