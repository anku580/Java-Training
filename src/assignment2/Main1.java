package assignment2;

import java.util.Scanner;

class UserMainCode1 {
	
	static String concatString(String input1, String input2)
	{
		int length1 = input1.length();
		int length2 = input2.length();
		String output = "";
		
		if(length1 == length2) {
			output = input1 + input2;
		}
		else {
			if(length1 > length2)
			{
				input1 = input1.substring(length1-length2);
			}
			else
			{
				input2 = input2.substring(length1-length2);
			}
			output = input1 + input2;
		}
		
		return output;
	}
}

public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strings:");
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		
		String result = UserMainCode1.concatString(input1, input2);
		System.out.println(result);
	}

}
