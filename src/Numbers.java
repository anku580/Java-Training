import java.util.*;

public class Numbers {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 values:");
		
		int array[] = new int[10];
		int postiveNumber = 0;
		int negativeNumber = 0;
		int totalpNumber = 0;
		int totalnNumber = 0;
		
		
		for(int i=0; i<10; i++) {
			
			array[i] = sc.nextInt();
			if(array[i] < 0){
				negativeNumber++;
				totalnNumber += array[i];
			}
			else {
				postiveNumber++;
				totalpNumber += array[i];
			}
			
		}
		
		System.out.println("Postive: " + postiveNumber);
		System.out.println("total Postive: " + totalpNumber);
		System.out.println("Negative: " + negativeNumber);
		System.out.println("total Negative: " + totalnNumber);
	}
}
