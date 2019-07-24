interface InterA {
	void sum();
}

interface InterB extends InterA {
	void sub();
}

abstract class ABC implements InterB {
	
	int a,b,c;
	
	ABC() {
		a = 0;
		b = 0;
		c = 0;
	}
	
	ABC(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		c = a + b;
		System.out.println("Sum : " + c);
	}
}

// concrete class
class BDE extends ABC {
	
	BDE() {
		super();
	}
	
	BDE(int a, int b) {
		super(a,b);
		this.a = a;
		this.b = b;
	}
	
	public void sub() {
		c = a-b;
		System.out.println("Subtract : " + c);
	}
}

class C implements InterB {
	
	int a,b,c;
	
	C() {
		a = 0;
		b = 0;
		c = 0;
	}
	
	C(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		c = a + b;
		System.out.println("Sum : " + c);
	}
	
	public void sub() {
		c = a-b;
		System.out.println("Subtract : " + c);
	}
}


public class InterMain {
	
	public static void main(String args[]) {
		
//		D obj1 = new D();
//		D obj2 = new D(5,4);
//		obj2.sub();
//		obj2.sum();
		
		BDE d = new BDE();
		BDE d1 = new BDE(5, 6);
		
		C e = new C();
		C e1 = new C(4, 9);
		
		InterB Ib; // here it is base interface reference variable
		
		Ib = d1;
		Ib.sum();  // Dynamic method dipatch
		Ib.sub();  // Dynamic method dipatch
		
		Ib = e1;
		Ib.sum();  // Dynamic method dipatch
		Ib.sub();  // Dynamic method dipatch
		
	}
}
