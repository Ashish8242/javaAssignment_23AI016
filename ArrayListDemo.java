package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListDemo
{
public static void  main(String[] args) {
	
/*
	ArrayList list1 = new ArrayList();

	list1.add(11);
	list1.add(21);
	list1.add(31);
	list1.add(41);
	list1.add(14);
	list1.add(19);
	System.out.println(list1);
	int len = list1.size();
	
	ArrayList list2 = new ArrayList();
	list2.add(null);
	list2.add("gsv");
	list2.add(true);
	list2.add(46);
	list2.add(89);
	list2.add('c');
	list2.set(3, 87);
	System.out.println(list2);
	ListIterator listiter = list2.listIterator();
	for(int i = 0 ; i < list2.size() ; i++) {
		Object obj1 = list2.get(i);
		if(obj1 instanceof Integer) {
			System.out.println(obj1);
		    Integer i1 = (Integer)obj1;
		    System.out.println("Integer "+ i1);
		    
		}
		if(obj1 instanceof String) {
			System.out.println(obj1);
		    String i1 = (String)obj1;
		    System.out.println("STRING "+ i1);
		    
		}
	}
	while(listiter.hasPrevious()) {
		Object obj2 = listiter.previous();
		System.out.println(obj2);
	}

	*/
	ArrayList<Integer> i1 = new ArrayList<Integer>();
	i1.add(34);
	i1.add(37);
	i1.add(54);
	i1.add(77);
	i1.add(89);
	i1.add(68);
	i1.add(36);
	i1.add(90);
	i1.add(372);
	ArrayList<Integer> i2 = new ArrayList<Integer>();
	i2.add(24);
	i2.add(37);
	i2.add(19);
	i2.add(36);
	System.out.println("I1:"+i1);
	System.out.println("I2:"+i2);
//	i1.removeAll(i2);
//	System.out.println(i1);
//	System.out.println(i1.contains(i2));
	i1.addAll(i2);
	System.out.println(i1);
	Collections.sort(i1);
	System.out.println(i1);
	System.out.println(Collections.binarySearch(i1, 34));

}
}
