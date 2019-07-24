package assignment;

import java.util.Scanner;

class UserMainCode4 {
	
	static String encrypt(String input) {
		
		char alphabet, newAlphabet;
		String result="";
		for(int i=0; i<input.length(); i++) {
			alphabet = input.charAt(i);
			newAlphabet = alphabet;
			
			if(alphabet == 'z') {
				newAlphabet = 'a';
			}
			else {
				if(i%2==0) {
					int pos = alphabet;
					pos++;
					newAlphabet = (char) pos;
				}
			}	
			result += newAlphabet;
		}
		return result;
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
		
		String result = UserMainCode4.encrypt(input);
		System.out.println(result);

	}

}
