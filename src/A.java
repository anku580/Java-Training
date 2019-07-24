public class A {
	
	void m1(int a,int b) {
		System.out.println("m1 method called");
	}
	
	void m1(int a,double b) {
		System.out.println("m2 method called");
	}
	
	public static void main(String args[]) {
		A a = new A();
		a.m1(1,2);
		a.m1(6, 11.5);
	}
}
