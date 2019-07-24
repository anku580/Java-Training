import java.util.*;

public class Compountinterst {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Principal amount:");
		int principle = sc.nextInt();
		
		System.out.println("Enter the rate of interest:");
		int rate = sc.nextInt();
		
		System.out.println("Enter the n:");
		int n = sc.nextInt();
		
		System.out.println("Enter the time in years:");
		int time = sc.nextInt();
		
		float calculation = (float)(Math.pow(1 + (rate/n), n*time));
		float amount = principle*calculation;
		
		System.out.println("Compound Interest: " + (amount-principle));
		
		
	}
}
