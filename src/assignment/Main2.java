package assignment;

import java.util.Scanner;

class UserMainCode2 {
		
	static int getElementPosition(String inputs[], String find) {
		
		for(int i=0; i<inputs.length; i++) {
			
			for(int j=i+1; j<inputs.length-1; j++) {
				String temp;
				if(inputs[i].compareTo(inputs[j]) > 0) {
					temp = inputs[j];
					inputs[j] = inputs[i];
					inputs[i] = temp;
				}
			}
		}
		
		String[] reversedArray = new String[inputs.length];
		int j = inputs.length; 
        for (int i = 0; i < inputs.length; i++) { 
        	reversedArray[j - 1] = inputs[i]; 
            j = j - 1; 
        }
        
        int index = 0;
        
        for(int i = 0; i<inputs.length; i++) {
        	if(reversedArray[i].compareTo(find) == 0) {
        		index = i+1;
        		break;
        	}
        }
        
        return index;
	}
}

public class Main2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		
		int size = sc.nextInt();
		String[] inputs = new String[size]; 
		
		System.out.println(size);
		for(int i=0; i<size; i++) {
			inputs[i] = sc.nextLine();
		}
		
//		System.out.println("Enter the string:");
		String find = sc.nextLine();
		System.out.println(find);
		int result = UserMainCode2.getElementPosition(inputs, find);
		System.out.println(result);
	}
}
