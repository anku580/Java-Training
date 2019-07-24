class SI {
	
	double principle, rate, time, si;
	
	SI()
	{
		principle = 0.0;
		rate = 0.0;
		time = 0.0;
		si = 0.0;
	}
	
	SI(double principle, double rate, double time)
	{
		this();
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}
	
	double calculation()
	{
		return (principle*rate*time)/100;
	}
}

public class SimpleInterest {
	public static void main(String args[]) {
	
//		SI I1 = new SI();
		SI I2 = new SI(1000, 10, 1);
		
		System.out.println("Simple Interest: " + I2.calculation());
	}
}
