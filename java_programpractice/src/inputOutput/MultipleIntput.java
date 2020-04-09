package inputOutput;

import java.util.StringTokenizer;

public class MultipleIntput {

public static void main(String args[])
{
	String x="abc,18,98.6,Rakesh";
	System.out.println(split(x));
	StringTokenizer st=new StringTokenizer(x,",");
	String str1=st.nextToken().trim();
	System.out.println(str1);
	str1=st.nextToken().trim();
	System.out.println(str1);
	str1=st.nextToken().trim();
	System.out.println(str1);
	String a[]=x.split(",");
	int y=19;
	String z=Integer.toString(y);
	for(int i=0;i<a.length;i++)
	{
	
		System.out.println(a[i]);
	}
}
static String split(String s)
{
	String ar[]=s.split(",");
	return ar[0]+":"+ar[1]+":"+ar[2];
}
}
