import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   
   System.out.println("enter your string: ");
   String str= sc.next();
   String org_str=str;
   String rev="";
   
   int length=str.length();
   
   for(int i=length-1;i>=0;i--)
   {
	   rev=rev+str.charAt(i);
   }
   System.out.println(rev);
	}

}
