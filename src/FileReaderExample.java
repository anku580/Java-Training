import java.io.FileReader;

public class FileReaderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("C:\\Users\\anku.garg\\workspace\\Java Project\\src\\demo1.java");
		int i;
		while((i=fr.read()) != -1)
			System.out.print((char)i);
		fr.close();

	}

}
