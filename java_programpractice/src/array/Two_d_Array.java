package array;

import java.util.Scanner;

public class Two_d_Array {
public static void main(String args[]) throws Exception
{
	Scanner s=new Scanner(System.in);
	int arr[][]=new int[3][1];
	int a[]=new int[0];
	int b[]=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
			b[i]=a[i];
			System.out.println(b.length);
	}
	for(int i=0;i<3;i++)
	{
		
		for(int j=0;j<1;j++)
		{
			arr[i][j]=s.nextInt();
		}
	}
	for(int i=0;i<3;i++)
	{
		//arr[i][0]=s.nextInt();
		for(int j=0;j<1;j++)
		{
			System.out.print(arr[i][j]);
		}
	System.out.println();
	}
	System.out.println(arr.length);
	//transpose(arr);
}
static void transpose(int a[][])
{	
	
	
}
}
