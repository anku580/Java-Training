package assignment2;

import java.util.Scanner;

class UserMainCode2 {
	
	static int validateColorCode(String input) {
		
		int flag = 0;
		if(input.charAt(0) != '#') {
			return -1;
		}
		else {
			int size = input.length() - 1;
			if(size > 5) {
				for(int i=1; i<input.length(); i++) {
					char a = input.charAt(i);
					int ab = a - 'A';
					if((ab >= 0 && ab <= 5) || (ab <= -8 && ab >= -17) ){
						flag = 1;
					}
					else
						return -1;
				}
			}
			else
				return -1;
		}
		if(flag == 1)
			return 1;
		return -1;
	}
}

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = sc.nextLine();
		
		int result = UserMainCode2.validateColorCode(input);
		
		if(result == 1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
