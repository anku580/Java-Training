import java.io.*;

class SerializbleExample implements Serializable {

	/**
	 * @param args
	 */
	private static final long serialVersionUID = 1L;
	public int a;
	public String b;
	
	//paramerterized constructor
	public SerializbleExample(int a, String b)
	{
		this.a = a;
		this.b = b;
	}

}

public class SerializbleExample1 {
	
	public static void main(String args[]) 
	{
		SerializbleExample object = new SerializbleExample(1, "Object Serialization and Deserialization");
		String filename = "C:\\Users\\anku.garg\\workspace\\Java Project\\src\\demo.java";
		
		//Serialization
		try
		{
			//saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			//Method for serialization of object
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialized");
		}catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		
		SerializbleExample object1 = null;
		
		//Deserialization
		
		try 
		{
			//Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			//Method for deserialization of object
			object1 = (SerializbleExample)in.readObject();
			
			in.close();
			file.close();
			
			System.out.println("Object has been deserialized");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		}
		catch(IOException ex) 
		{
			System.out.println("IOException is caught");
		}
		
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}
	}
}
