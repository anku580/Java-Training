package assignment3;

import java.util.Scanner;

class UserMainCode1 {
	
	static int findDistance(int x1, int x2, int y1, int y2)
	{
		int calc1 = (x1-x2)*(x1-x2);
		int calc2 = (y1-y2)*(y1-y2);
		
		return (int)Math.sqrt(calc1 + calc2);
	}
}
public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int result = UserMainCode1.findDistance(x1, x2, y1, y2);
		System.out.println(result);
	}

}
