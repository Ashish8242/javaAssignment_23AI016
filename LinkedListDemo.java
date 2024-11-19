import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> car = new LinkedList<String>();
	car.add("alto");
	car.add("bmw");
	car.add("tata");
	System.out.println(car);
	car.addFirst("45");
	System.out.println(car);
	
	Vector v1 = new Vector();
	v1.add(34);
	v1.add(35);
	v1.add("book");
	System.out.println(v1);
	
	System.out.println(v1);
	
	
	Deque<Integer> deque = new ArrayDeque<Integer>();
	deque.add(23);
	deque.add(21);
	deque.add(24);
	deque.add(28);
	deque.add(25);
	deque.add(20);
	System.out.println(deque);
	deque.addFirst(34);
	deque.addLast(22);
	System.out.println(deque);;
	deque.removeFirst();
	System.out.println(deque);
	deque.pollLast();
	System.out.println(deque);
	deque.peek();
	System.out.println(deque);
}
}
