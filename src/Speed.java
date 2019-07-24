import java.util.*;

public class Speed {
	
	public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Distance in kms: ");
		int distance = obj.nextInt();
		System.out.println("Enter the time in hrs: ");
		int time = obj.nextInt();
		float speed = distance/time;
		System.out.println("Spped : " + speed);
	}
}
