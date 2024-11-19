import java.util.HashSet;

class Employee{
	String ename;
	int salary;
	public Employee(String ename , int salary) {
		super();
		this.ename = ename;
		this.salary = salary;
		
	}
	public String toString() {
		return "Emplyee [ename = "+ ename + " ,salary = "+ salary + "]";
	}
	public boolean equals(Object obj) {
		Employee e1 = (Employee)obj;
		if(e1.ename == this.ename && e1.salary== this.salary) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int hashcode() {
		String strEname = ename ;
		String strSalary = String.valueOf(salary);
		int hashEname = strEname.hashCode();
		int hashSalary = strSalary.hashCode();
		int hash = 0 ; 
		hash = hash + hashEname + hashSalary;
		return hash;
	}
}
public class hashCode {
  public static void main(String[] args) {
	  HashSet gsv = new HashSet();
	  Employee e1 = new Employee("Kiran" , 45000);
	  Employee e2 = new Employee("ravi" , 5000);
	  Employee e3 = new Employee("macualam" , 4500);
	  Employee e4 = new Employee("Kabeer" , 400);
	  Employee e5 = new Employee("shiavam" , 95000);
	  
	  gsv.add(e1);
	  gsv.add(e2);
	  gsv.add(e3);
	  gsv.add(e4);
	  gsv.add(e5);
	  System.out.println(gsv);
  }
}
