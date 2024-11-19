class person extends Object{
	int age ;
	float weight;
	double height;
	public person(int age , float weight, double height) {
		this.age = age;
		this.weight = weight;
		this.height = height;
		
	}
	public String toString() {
		return "age"+age + "weight" + weight + "height"+height;
				
	}
	public boolean equal(Object obj) {
		person p2 = (person)obj;
		if(this.age == p2.age && this.weight == p2.weight && this.height = p2.height) {
			return true;
		} else {
			return false;
		}
		
	}
	public int hashCode() {
		String strAge = String.valueOf(this.age);
		String strWeight = String.valueOf(this.weight);
		String strHeight = String.valueOf(this.height);
		
	    int hash = 0;
	    int hashAge = strAge.hashCode();
	    int hashWeight = strWeight.hashCode();
	    int hashHeight = strHeight.hashCode();
	    hash = hashAge+hashWeight+hashHeight;
	    return hash;
	    
	    
	}
}
public class personalManager {
  public static void main(String[] args) {
	  int i = 10;
	  int j = 10;
	  System.out.println(i==j);
	  person p1 = new person(14,67.7f,5.6);
	  person p2 = new person(14,67.7f,5.6);
	  System.out.println(p1.toString());
      System.out.println(p2.toString());
      System.out.println(p1.equals(p2));
      System.out.println(p1.hashCode());
      System.out.println(p2.hashCode());

  }
}
