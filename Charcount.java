
public class Charcount {

	public static void main(String[] args) {
	
	int i;
	String s1= "We are best friends";
	s1=s1.replaceAll(" ", "");
	i=s1.length();
	System.out.println("count is: "+i);
  s1=s1.replaceAll("e","" );
  i=s1.length();
  System.out.println("Count is: "+i);
	}

}
