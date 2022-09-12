
public class fact1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
		int i, fact=1;
		int n=5;// it is the number to calculate factorial
		
		for(i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+n+" is : " +fact);
	}

}
