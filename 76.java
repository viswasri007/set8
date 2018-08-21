import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();int cnt=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			cnt++;
		}
		if(cnt>2)
		System.out.print("yes");
		else
		System.out.print("no");
		
	}
}
