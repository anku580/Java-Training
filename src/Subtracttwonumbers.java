import java.util.Scanner;



public class Subtracttwonumbers {
	
	int subtractTwoNumber(int a,int b) {
		if(a > b) 
			return a-b;
		return b-a;
	}
	
	public static void main(String args[]) {
	
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int a = myObj.nextInt();
		int b = myObj.nextInt();
		Subtracttwonumbers obj1 = new Subtracttwonumbers();
		int result = obj1.subtractTwoNumber(a, b);
		System.out.println("After Subtraction: "+ result);
	}

}
