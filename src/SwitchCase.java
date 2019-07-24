import java.util.*;

public class SwitchCase {
	String output = "";
	SwitchCase() {
		
	}
	
	String check(int input) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Press 0 for Exit");
		System.out.println("Press 1 for Armstrong");
		System.out.println("Press 2 for Palindrome");
		
		
		System.out.println("Enter your choice:");
		int choice = s.nextInt();
		
		
		switch(choice)
		{
			case 0:
				System.exit(0);
				
			case 1:
				int i = input;
				int sum = 0;
				
				while( i!= 0) {
					
					int rem = i%10;
					sum = sum + (int)Math.pow(rem, 3);
					i = i/10;
					
				}	
				if(sum == input) {
					output = "Yes! It is a Armstromg";
				}
				else {
					output = "No! It is not a Armstromg";
				}
				break;
				
			case 2:
				int j = input;
				int sum1 = 0;
				
				while( j != 0 ){
					int rem = j%10;
					sum1 = sum1*10 + rem;
					j = j/10;
				}
				
				if(sum1 == input) {
					output = "Yes! It's a Palindrome!";
				}
				else {
					output = "No! It is not a palindrome";
				}
				break;
		}
		
		return output;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int input = sc.nextInt();
		
		SwitchCase obj1 = new SwitchCase();
		String output = obj1.check(input);
		
		System.out.println(output);
	}
}
