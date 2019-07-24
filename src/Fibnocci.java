import java.util.*;

public class Fibnocci {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int number = sc.nextInt();
		
		int b=0, a=1;
		
		System.out.println(b);
		System.out.println(a);
		while(number != 0) {
			
			int sum = a + b;
			a = b;
			b = sum;
			System.out.println(a);
			number--;
		}
	}
}
