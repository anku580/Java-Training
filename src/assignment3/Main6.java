package assignment3;

import java.util.Scanner;

class UserInterface6 {
	
	static int commonChars(String input1, String input2)
	{
		int count[] = new int[26];
		int count1[] = new int[26];
		
		for(int i=0; i<input1.length(); i++)
		{	
//			System.out.println(input1.charAt(i) - 'a');
			if( input1.charAt(i) - 'a' != -65 )
				count[input1.charAt(i) - 'a']++;
		}
		for(int i=0; i<input2.length(); i++) 
		{
			if( input1.charAt(i) - 'a' != -65 )
				count1[input2.charAt(i) - 'a']++;
		}
		
		int countUnique = 0;
		for(int i=0; i<26; i++)
		{	
			System.out.println(count[i]);
			System.out.println("Second:");
			System.out.println(count1[i]);
			if(count[i] == 1 && count1[i] == 1) {
				countUnique++;
			}
		}
		return countUnique;
	}
}

public class Main6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.next();
		
		System.out.println(UserInterface6.commonChars(input1, input2));
	}

}
