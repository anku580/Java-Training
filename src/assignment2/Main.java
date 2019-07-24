package assignment2;

import java.util.Scanner;

class UserMainCode {
	
	static class Sum {
		
		int sumOfDigits(String input) {
			
			int sumOfDigits = 0;
			for(int i=0; i<input.length(); i++) {
				int number = input.charAt(i) - '0';
				
				if(number >= 0 && number <=9) {
					sumOfDigits += number;
				}
			}
			
			return sumOfDigits;
		}
	}
}

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = sc.nextLine();
		
		UserMainCode.Sum obj = new UserMainCode.Sum();
		int result = obj.sumOfDigits(input);
		System.out.println(result);
	}

}
