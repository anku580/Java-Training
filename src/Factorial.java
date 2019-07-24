import java.util.*;

public class Factorial {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int temp = num;
		int sum = 1;
		
		while(num !=0 || num != 1) {
			System.out.println(num);
			sum = sum*num;
			num--;
		}
		
		if(temp == 0 || temp == 1) {
			System.out.println(1);
		}
		else {
			System.out.println(sum);
		}
	}
}	
