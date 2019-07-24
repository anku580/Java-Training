class Sample {
	int a;
	
	Sample() 
	{
		System.out.println("Base A");
	}
	
	Sample( int a) {
		this.a = a;
	}
	
	void display() {
		System.out.println("Base a: display method");
	}
}

class B extends Sample {
	int a = 7;;
	
	B()
	{
		super();
		System.out.println("Base B");
	}
	
	B(int a) {
		super(a);
	}
	
	void display() {
		System.out.println("Child: a = " + a);
		System.out.println("Base: a = " + super.a);
		super.display();
	}
}

public class SuperExample {
	
	public static void main(String args[]) {
		B b1 = new B(10);
		b1.display();
	}
}
