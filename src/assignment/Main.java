package assignment;

import java.util.*;

class UserMainCode {
	
	static int getSumOfPower(int array[]) {
		
		int sum = 0;
		
		for(int i=0; i < array.length; i++) {
			sum = sum + (int)Math.pow(array[i], i);
		}
		
		return sum;
	}
}

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int j=0; j<size; j++) {
			arr[j] = sc.nextInt();
		}
		
		int result = UserMainCode.getSumOfPower(arr);
		System.out.println(result);
	}
}
