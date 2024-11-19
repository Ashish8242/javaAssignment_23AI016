package string;

public class pracctice {
	public static void main(String[] args) {
		/*
      String s1 = "sdj infosoft";
      String s2 = s1.substring(5);
      String s3 = s1.substring(5,9);
      String s4 = s2.intern();
      String s5 = s1.intern();
      System.out.println(s3);
      System.out.println(s4);
      System.out.println(s1.equals(s5));
     
      
      StringBuffer sb1 = new StringBuffer("abc");
      sb1.append("xyz");
      sb1.append("\n");
      sb1.append("hello\t");
      sb1.append("test");
      System.out.println(sb1);
      
	  StringBuilder sb = new StringBuilder();
	  sb.append("abc");
	  sb.append("hello");
	  System.out.println(sb);
	  System.out.println(sb.delete(0, 3));
	  System.out.println(sb.deleteCharAt(4));
	  
		
      System.out.printf("hello %d" , 67);
      
    
		
		
	  String s1 = "indian";
	  System.out.printf("hi %s" , s1);
	    
	  
	  StringBuffer sb1 = new StringBuffer();
	  sb1.append("abc");
	  sb1.append("xyz");
	  StringBuffer sb2 = new StringBuffer();
	  sb2.append("abc");
	  sb2.append("xyz");
	  System.out.println(sb1.equals(sb2));
	  System.out.println(sb1.hashCode());
	  System.out.println(sb2.hashCode());
	  System.out.println("done");
	 
		
	  String s1 = " abc xyz ";
	  s1.trim();
	  System.out.println(s1.length());
	  s1 = s1.trim();
	  System.out.println(s1.length());
	 
		
		
	  try {
		  System.out.println(1);
		  String s = null;
		  System.out.println(s);
		  System.out.println(s.length());
		  System.out.println(2);
		  
	  } 
	  catch(NullPointerException ex ) {
		  System.out.println(4);
		  System.out.println(5);
	  }
	  System.out.println(6);
	  
	   
		
		try {
			System.out.println(1);
			int i = 10/0;
			
		} catch(NullPointerException ex){
			System.out.println(4);
			
		
		try {
			int j = 23/0;
		}
		catch(ArithmeticException ex1) {
			System.out.println(5);
		}
		finally {
			System.out.println(6);
		}
		System.out.println(7);
	}
	}
}

		try {
		System.out.println(1);
		String s = null;
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(2);
		}
		catch(NullPointerException ex) {
			System.out.println(4);
			System.out.println(5);
		}
		System.out.println(6);
		
		 */
		String s1 = "too long";
		System.out.println(s1.trim().trim().concat("too short").trim().replace("too","2").trim().length());
	}
}
		
		

