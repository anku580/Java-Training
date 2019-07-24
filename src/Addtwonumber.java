import java.util.*;


public class Addtwonumber {
	
	int addTwoNumber(int a,int b) {
		return a+b;
	}
	
	public static void main(String args[]) {
	
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int a = myObj.nextInt();
		int b = myObj.nextInt();
		Addtwonumber obj1 = new Addtwonumber();
		int result = obj1.addTwoNumber(a, b);
		System.out.println(result);
	}

}
