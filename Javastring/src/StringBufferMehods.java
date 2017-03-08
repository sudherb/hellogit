
public class StringBufferMehods {
	
public static void  main(String args[]){
	StringBuffer sb = new StringBuffer ("Hello");
	//append()
	sb.append(" sudheer");
	System.out.println(sb);
	//reverse
	sb.reverse();
	System.out.println(sb);
	//insert
	sb.insert(3, "yl");
	System.out.println(sb);
	//replace
	sb.replace(1, 3, "str");
	System.out.println(sb);
	//delete
	sb.delete(1, 3);
	System.out.println(sb);
	
	
}
}
