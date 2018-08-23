import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int p=n*m;
		int f1=0;
		if(n==0 || m==0)
		{
			System.out.println("yes");
		}
		else if(n==m)
		{
			System.out.println("yes");
		}
		else
		{
			for(int i=1;i<p/2;i++)
			{
				if((i*i)==p)
				{
					f1=1;
					break;
				}
			}
			if(f1==1)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}
