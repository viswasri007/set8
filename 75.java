import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		int len=str.length();
		if(len%2==0)
		{
			ch[len/2]='*';
			ch[len/2-1]='*';
		}
		else
		{
			ch[len/2]='*';
		}
		for(int i=0;i<len;i++)
		System.out.print(ch[i]);
		
	}
}
