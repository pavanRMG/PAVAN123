package pavan;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 20;
		boolean prime = true;//binary variable that can have one of two possible values,
		for (int i =2; i<n; i++)
		{
			if(n%i == 0)//compare
			{
			prime=false;
			break;//halts the execution of a loop
			
		}
	
	}
		System.out.println(prime);
	}
}