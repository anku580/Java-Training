public class StringHelper {

	/**
	 * @param args
	 */
	
	private String inputString;
	
	public StringHelper(String string) 
	{
		inputString = string;
	}
	
	
	public int hashCode() {
		return inputString.length();
	}
	

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
		{
			return false;
		}
		final StringHelper other = (StringHelper)obj;
		if(inputString == null && other.inputString != null) {
			return false;
		}
		else if(!inputString.equals(other.inputString))
			return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringHelper helperObj = new StringHelper("string");
		StringHelper helperObj1 = new StringHelper("string");
		
		if(helperObj.hashCode() == helperObj1.hashCode()){
			System.out.println("HashCode are equal");
		}
		if(helperObj.equals(helperObj1)){
			System.out.println("Objects are equal");
		}
		else {
			System.out.println("Objects are not equal");
		}
	}
	
	public String getInputString() {
		return inputString;
	}

}
