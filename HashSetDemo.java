import java.util.HashSet;
import java.util.Iterator;
class person {
	String name ;
	int age;
	public person(String name , int age) {
		this.name = name ;
		this.age = age;
		
	}
	 public String toString() {
	        return "Person [pname=" + name + ", age=" + age + "]";
	    }
	}


public class HashSetDemo {
public static void  main(String[] args) {
	HashSet set = new HashSet();
	set.add(34);
	set.add(54);
	set.add(78);
	set.add(24);
	set.add(384);
	set.add(984);
	System.out.println(set);
	Iterator ite = set.iterator();
	while(ite.hasNext());
	{
		System.out.println(ite.next());
	}
}
}
