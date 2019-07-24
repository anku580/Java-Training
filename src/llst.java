import java.util.*;

public class llst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(" current date and time = " + d);
		
		LinkedList ll = new LinkedList();
		
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		System.out.println("original ll:" + ll);
		ll.remove("F");
		ll.remove(2);
		System.out.println("After deletion: " + ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("after deletion of first and last element: " + ll);
		
		Object val = ll.get(2);
		ll.set(2,(String)val + "changed");
		System.out.println(" ll after change: " + ll);
	}

}
