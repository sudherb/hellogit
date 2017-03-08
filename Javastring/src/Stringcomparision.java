
public class Stringcomparision {

	public static void main(String[] args) {
	String s1 ="sudheer";
	String s2 = "sudheer";
	String s3 = "sudher";
	
	//By using equals() Method
	
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s3));
	
	//By using compareTo() Method
	
	System.out.println(s1.compareTo(s2));
	System.out.println(s2.compareTo(s3));
	
	//By using = = operator
	
	System.out.println(s1 == s2 );
	System.out.println(s2 == s3);
	
	
	

	}

}
