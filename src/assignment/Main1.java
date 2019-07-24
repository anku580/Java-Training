package assignment;

import java.util.Scanner;

class UserMainCode1 {
	
	static int getBigDiff(int array[]) {
		
		int max = -1;
		int min = 1000;
		
		if(array.length == 1) {
			return array[0];
		}
		else if(array.length > 1) {
						
			for(int i=0; i<array.length; i++) {
				
				if(array[i] > max) {
					max = array[i];
				}
				else if(array[i] < min) {
					min = array[i];
				}
			}
		}
		return max-min;
	}
}

public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int j=0; j<size; j++) {
			arr[j] = sc.nextInt();
		}
		
		int result = UserMainCode1.getBigDiff(arr);
		System.out.println(result);
	}

}
