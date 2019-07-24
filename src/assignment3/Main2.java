package assignment3;

import java.util.Scanner;

class UserMainCode2 {
	
	static String convertDecimalToBinary(int number) {
		
		int result = 0;
		int duplicate = number;
		String res = "";
		
		while(duplicate != 0) {
			int rem = duplicate%2;
			res = res + rem;
			result = rem + result*10;
			duplicate /= 2;
		}
		
		return res;
	}
}

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(UserMainCode2.convertDecimalToBinary(input));
	}

}
