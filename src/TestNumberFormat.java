import java.text.NumberFormat;
//import static java.text.NumberFormat.*;

public class TestNumberFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d = 5678.5678;
		System.out.println("double is:" + d);
		NumberFormat nfm = null;
		
		nfm = NumberFormat.getInstance();
		System.out.println("Formatted as number:" + nfm.format(d));
		
		nfm.setMaximumIntegerDigits(2);
		nfm.setMaximumFractionDigits(2);
		System.out.println("Formatted as number with max 2 digits for int/frac: " + nfm.format(d));
		nfm = NumberFormat.getCurrencyInstance();
		System.out.println("Formatted as currency:" + nfm.format(d));
	}

}
