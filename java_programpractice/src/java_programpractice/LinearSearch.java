package java_programpractice;

import java.util.Scanner;

public class LinearSearch {
	static int search(int x,int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[]=new int[100];
		int t,n;
		Scanner s=new Scanner(System.in);
		//input test case
		t=s.nextInt();
		while(t>0)
		{
			//input array size 
			n=s.nextInt();
			for(int i=0;i<n;i++)
				arr[i]=s.nextInt();
			int x=s.nextInt();
			System.out.println(search(x,arr));
					
		}
		
		
	}

}
