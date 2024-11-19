package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

class student implements Comparable {
	String sname;
	int age;
	double marks;
	public student(String sname , int age , double marks) {
		super();
		this.sname = sname;
		this.age = age;
		this.marks = marks;
	}
	public String toString() {
		return sname+"  "+ age+" "+marks;
	}
	@Override
	public int compareTo(Object o) {
		student s = (student)o;
		if(this.age > s.age) {
			return 1;
		}
		else if(this.age<s.age) {
			return-1;
		} else {
			return 0;
		}
	}
}

public class ArrayListStudent {
 public static void main(String[] args) {
	 ArrayList<student> dsai = new ArrayList<student>();
	 dsai.add(new student("ankit" , 23 , 89.3));
	 dsai.add(new student("anu" , 28 , 79.3));
	 dsai.add(new student("amit" , 21 , 44.6));
	 dsai.add(new student("ragu" , 90 , 82.3));
	 dsai.add(new student("shivam" , 103 , 19.3));
	 Collections.sort(dsai);
	 System.out.println(dsai);
 }
}
