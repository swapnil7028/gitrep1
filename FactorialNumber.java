
public class FactorialNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
		int i, fact=1;
		
		int number=6;// it is the number to calculate factorial
		
		for( i=1; i<=number;i++)
		{
			fact=fact*i;
		}
		
		System.out.print("factorail of " + "number + : "+fact );
		
	}

}
