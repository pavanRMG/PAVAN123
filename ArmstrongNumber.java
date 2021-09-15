package pavan;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int n =153,r,Armstrong=0;
		int orginal = n;	
		while(n>0)
		{
		r= n % 10;
			n=n/10;
			Armstrong=Armstrong+(r*r*r);//27+125+1=153				
		}
		if (Armstrong == orginal)
			System.out.print(" is Armstrong");
		else
			System.out.println("Not an Armstrong OK ");
		

	}

}
