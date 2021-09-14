package pavan;
//6=>1+2+3=6
//28=
public class PerfectNumber {//1 2 3 4 5 6

	public static void main(String[] args)
	{
		int n=6;
	int sum = 0;
		for(int i=1;i<n;i++)//initialization
		{
			if(n%i == 0)
			sum = sum + i;
		}
		if(sum == n)
		
		System.out.println("PerfectNumber");
		
	else
	
		System.out.println("NotPerfectNumber");
	
	
		}
	}


