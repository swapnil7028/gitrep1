
public class ArmsrongA1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         int a= 232;
         int temp=a;
         int r, result=0;
         while(a>0)
         {
        	 r=a%10;
        	 result=result+(r*r*r);
        	 a=a/10;
        	 
         }
         if(result==temp)
        	 System.out.println(temp + " :is an armstrong number.");
         else
        	 System.out.println(temp + " : is not armstrong number");
	}

}
