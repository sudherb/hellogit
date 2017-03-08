
public class Testimmutable {

	public static void main(String[] args) {
		String s= "sudheer";
		s.concat(" Bellam");
		System.out.println(s);
		
		String s1 = "Sudheer";
		s1 = s1.concat(" Bellam");
		System.out.println(s1);
		
		//if we explicitly assign it to the reference variable, it will refer to "Sudheer Bellam"
		

	}

}
