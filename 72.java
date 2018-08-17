import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		int count=0;
		for(int i=0;i <str.length();i++)
		{
            	if((str.charAt(i) == 'a') || (str.charAt(i) == 'e')  ||(str.charAt(i) == 'i') || (str.charAt(i) == 'o') ||(str.charAt(i) == 'u'))
            	 
            	{
            		count++;
            		
            	}
		}
		if(count==0)
		System.out.println("no");
		else
		System.out.println("yes");
	}
}
