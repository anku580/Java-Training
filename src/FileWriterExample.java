import java.io.FileWriter;

public class FileWriterExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\anku.garg\\workspace\\Java Project\\src\\demo.java");
			fw.write("Demo");
			fw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Success.....");

	}

}
