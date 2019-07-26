package qn.three;

import java.util.Scanner;

class UserMainCode2 {
	
	static String getStringUsingNthCharacter(String input, int num) {
		
		String newString = "";
		
		if(num <= 2)
			newString += input.charAt(0);
		for(int i=num-1; i<input.length(); i = i + num) {
			newString += input.charAt(i);
		}
		
		return newString;
	}
}

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int num = sc.nextInt();
		
		System.out.println(UserMainCode2.getStringUsingNthCharacter(input, num));
	}

}
