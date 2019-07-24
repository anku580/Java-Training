import java.util.*;

public class Armstrong {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int number = sc.nextInt();
		
		int i = number;
		int sum = 0;
		
		while( i!= 0) {
			
			int rem = i%10;
			sum = sum + (int)Math.pow(rem, 3);
			i = i/10;
			
		}
		
		if(sum == number) {
			System.out.println("Yes!");
		}
		else {
			System.out.println("No");
		}
		
	}
}
