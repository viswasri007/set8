import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int l=s.nextInt();
		int r=s.nextInt();
		if(n>l && n<r)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
