package assignment3;

import java.util.Scanner;

class UserMainCode3 {
	
	static int removeElements(String[] arr, int size) {
		
		String[] result = new String[arr.length];
		int k=0;
		for(int i=0; i<arr.length; i++)
		{
			int len = arr[i].length();
			if(len != size) {
				result[k++] = arr[i];
			}
		}
		return k;
	}
}
public class Main3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.next();
		}
		int lengthToRemove = sc.nextInt();
		System.out.println(UserMainCode3.removeElements(arr, lengthToRemove));
	}

}
