import java.util.*;
import java.io.*;
class Question5
{
	public static int Sum(String str)
	{
		int i,sum=0;
		for(i=0;i<str.length();i++)
		{
			if(charAt[i].str>=48&&charAt[i]<=57)
			{
				sum+=(int)(charAt[i].str-48);
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int c=Sum(str);
		System.out.println(c);
	}
}