import java.util.Scanner;


public class UserMainCode {

	/**
	 * @param args
	 */
	
	static int checkSum(int input) {
		
		int store = input;
		int sum = 0;
		
		while(store != 0) {
			
			int rem = store%10;
			if(rem%2 == 1)
			{
				sum = sum + rem;
			}
			store = store/10;
		}
		
		if(sum%2 == 1) 
			return 1;
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int output = UserMainCode.checkSum(number);
		
		if(output == 1)
			System.out.println("Sum of odd digits is odd.");
		else
			System.out.println("Sum of odd digits is even.");

	}

}
