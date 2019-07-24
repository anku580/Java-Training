import java.util.Scanner;


class UserMainCode2 {
	
	static int reverseNumber(int number)
	{
		int store = number;
		int output = 0;
		int rem = 1;
		
		while(store != 0) {
			rem = store%10;
			output = rem + output*10;
			store = store/10;
		}
		return output;
	}
}
public class Main1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int result = UserMainCode2.reverseNumber(number);
		System.out.println(result);
	}
}
