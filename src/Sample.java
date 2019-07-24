final class A {
	final int a = 7;
	
	final void display(){
		a = 8; // final variable cannot be re-initialized
		System.out.println("a = " + a);
	}
}

class B extends A {  // final class cannot be extended
	void display()
	{
		System.out.println("a = " + a);  // cannot inherit
	}
}

public class Sample {
	public static void main(String args[]) 
	{
		B b1 = new B();
		b1.display();
	}
}
