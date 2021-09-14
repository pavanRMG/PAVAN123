package pavan;

public class Fibonacci {//0 1 1 2 3 5 8 13

	public static void main(String[] args) 
	{
	  int n = 8;//count
	  int s = 0,p = 1,d;
	  System.out.println(s);//print
	  System.out.println(p);
	 for(int i = 3;i<=n;i++)//loop starts from 3 because 0 and 1 are already printed
	  {
		  d = s+p;//3rd term
		  System.out.println(d);//got the 3rd term
		  s = p;
		  p = d;
		  
	  }

	}

}
