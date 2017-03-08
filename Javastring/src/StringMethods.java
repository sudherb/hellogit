
public class StringMethods {

	public static void main(String[] args) {
		
		String S = "Sudheer bellam";
		
				//To upper case
		
				System.out.println(S.toUpperCase());
				
				//To lower case
				
				System.out.println(S.toLowerCase());
				
				//To trim; it eliminates white spaces before and after string
				
				String S1 =" Java Sudheer  ";
				System.out.println(S1);
				System.out.println(S1.trim());
				
				//startswith() endswith()
				
				System.out.println(S.startsWith("su"));
				System.out.println(S.endsWith("am"));
				
				// charAt() method returns a character at specified index
				
				System.out.println(S.charAt(0));
				System.out.println(S.charAt(3));
				
				//String intern() method
				
				String S2 =S.intern();
				System.out.println(S2);
				
				//replace()
				   
				String replaceString=S1.replace("Java","Kava");    
				System.out.println(replaceString); 
				
				

	}

}
