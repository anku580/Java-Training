package qn.four;

import java.util.Scanner;

class UserMainCode3 {
	
	static int getElementPosition(String array[], String find) {
		
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				
				if(array[i].compareTo(array[j]) > 0) {
					String temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
		String[] reversedArray = new String[array.length];
		int j = array.length; 
        for (int i = 0; i < array.length; i++) { 
        	reversedArray[j - 1] = array[i]; 
            j = j - 1; 
        }
		
		int index=-1;
		for(int i=0; i<reversedArray.length; i++) {
			if(reversedArray[i].compareTo(find) == 0) {
				index = i+1;
				break;
			}
		}
		return index;
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
		String[] inputs = new String[size]; 
		
//		System.out.println(size);
		for(int i=0; i<size; i++) {
			inputs[i] = sc.next();
		}
		
		String find = sc.next();
//		System.out.println(find);
		int result = UserMainCode3.getElementPosition(inputs, find);
		System.out.println(result);
	}

}
