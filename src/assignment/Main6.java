package assignment;

import java.util.Scanner;

class UserMainCode6 {
	
	static String removeEvenVowels(String input) {
		
		String output="";
		for(int i=0; i<input.length(); i++) {
			
			char a = input.charAt(i);
			if((i+1)%2 == 0) {
				if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {	
				}
				else {
					output += a;
				}
			}
			else {
				output += a;
			}
		}
		return output;
	}
}

public class Main6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = sc.nextLine();
		
		String result = UserMainCode6.removeEvenVowels(input);
		System.out.println(result);
	}

}
