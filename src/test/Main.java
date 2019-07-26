package test;
import java.util.*;

class UserMainCode {
	
	static String removeEvenVowels(String inputString) 
	{
		String output = "";

		for(int i=0; i<inputString.length(); i++) {
			
			if((i+1)%2 ==0) {
				char vowel = inputString.charAt(i);
				if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
				{
				}
				else
					output += vowel;
			}
			else {
				output += inputString.charAt(i);
			}
		}
		return output;
	}
}

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String inputString = input.next();
		
		System.out.println(UserMainCode.removeEvenVowels(inputString));
	}

}
