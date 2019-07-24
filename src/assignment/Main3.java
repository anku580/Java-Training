package assignment;

import java.util.Scanner;

class UserMainCode3 {
	
	static int addSeries (int number) {
		
		int i=2;
		int position = 1;
		int sum = 0;
		
		while(number >= i) {
			
			if(i%2==1 && position%2==0) {
				sum = sum - i;
				position++;
			}
			else {
				if(i%2==1) {
					sum = sum + i;
					position++;
				}
			}
			i++;
		}
		return sum+1;
	}
}


public class Main3 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int input = sc.nextInt();
		
		int result = UserMainCode3.addSeries(input);
		System.out.println(result);
	}
}
