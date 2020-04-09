package inputOutput;

import java.util.Scanner;
public class Fibonacci {
	public static int checkFib(int n)
	{
		int a=0,b=1,s=0;
		for(int i=0;i<n;i++)
		{
			s=a+b;
			a=b;
			b=s;
			if(s==n&&checkPrime(n))
			{
				return 1;
			}
		}
		return 0;
	}
	public static boolean checkPrime(int n)
	{
		int i=2;
		if(n==1)
			return false;
		while(i<n)
		{
			if(n%i==0)
			{
				return false;
			}
		i++;
		}
		return true;
	}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t>0){
		int n=s.nextInt();
		System.out.println(checkFib(n));
		t--;
	
	}
}
}
