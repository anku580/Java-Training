public class CompountInterest2 {
	
	public static void main(String args[]) {
		
		double principle = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		double time = Double.parseDouble(args[3]);;
		
		double calculation = (Math.pow(1 + (rate/n), n*time));
		double amount = principle*calculation;
		
		System.out.println("Compound Interest: " + (amount-principle));
		
		
	}
}
