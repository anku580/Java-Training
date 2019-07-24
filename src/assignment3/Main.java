package assignment3;

import java.util.Scanner;


class UserMainCode {
	
	static double averageElements(int array[]) 
	{
		double average;
		int flag = 0;
		int k=0;
		int storeIndex[] = new int[array.length];
		for(int i=2; i<array.length; i++) {
			
				for(int j=2; j<=i/2; j++) {
					if(i%j == 0) {
						flag = 1;
						break;
					}
				}
				if(flag == 0) {
//					System.out.println("Enter: " + i);
					storeIndex[k++] = array[i];
				}
				else {
					flag = 0;
				}
		}
		
		int sum = 0;
		for(int i=0; i<k; i++) {
			System.out.println(storeIndex[i]);
			sum += storeIndex[i];
		}
//		System.out.println(sum);
//		System.out.println(storeIndex.length);
		average = sum/k;
		return average;
	}
}

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int array[] = new int[size];
		
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		
		double result = UserMainCode.averageElements(array);
		System.out.println(result);
	}

}
