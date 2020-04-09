package java_programpractice;

import java.util.Scanner;

public class Swap {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println(x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		String s1="0100101010";
		//String a[]=s1.split("010");
	
		String bad = "010";
		int ans = 0;
		while (s1.contains(bad)) {
			ans++;
			System.out.println("index :"+s1.indexOf(bad));
			int i = s1.indexOf(bad) + 2;
			System.out.println(i);
			s1 = s1.substring(0, i) + "1" + s1.substring(i + 1);
			System.out.println(s1);
		}
		System.out.println(ans);
	
	}

}
