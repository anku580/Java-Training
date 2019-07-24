import java.util.Scanner;

class UserMainCode1 {

	/**
	 * @param args
	 */
	
	static int sumOfSquareOfEvenDigits(int input) {
		
		int store = input;
		int sum = 0;
		
		while(store != 0) {
			
			int rem = store%10;
			if(rem%2 == 0)
			{
				sum = sum + rem*rem;
			}
			store = store/10;
		}
		
		return sum;
	}
	
}

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int output = UserMainCode1.sumOfSquareOfEvenDigits(number);
		
		System.out.println(output);


	}

}
