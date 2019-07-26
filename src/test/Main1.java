package test;
import java.util.*;

class UserMainCode1 {
	
	static int calculateElectricityBill(int previousReading, int currentReading, int costPerUnit) {
		
		return (currentReading - previousReading)*costPerUnit;
	}
}
public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String prev = input.nextLine();
		String next = input.nextLine();
		int costPerUnit = input.nextInt();
		
		int previousReading = Integer.parseInt(prev.substring(5));
		int currentReading = Integer.parseInt(next.substring(5));
		
		System.out.println(UserMainCode1.calculateElectricityBill(previousReading, currentReading, costPerUnit));
	}

}
