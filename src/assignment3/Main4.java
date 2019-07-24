package assignment3;

import java.util.Scanner;

class UserMainCode4 {
	
	static int ipValidator(String input)
	{
		int flag = 0;
		String[] words = input.split("[.]");
		for(int i=0; i<words.length; i++) {
			
			int number = Integer.parseInt(words[i]);
//			System.out.println(number);
			if(number <0 || number > 255)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1)
			return -1;
		return 1;
	}
}
public class Main4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int result = UserMainCode4.ipValidator(input);
		if(result == 1)
			System.out.println("Valid");
		else 
			System.out.println("Invalid");
	}

}
