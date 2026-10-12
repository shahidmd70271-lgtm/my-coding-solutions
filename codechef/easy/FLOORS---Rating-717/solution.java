import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		   int a=(int)Math.ceil((double)x/10.0);
		   int b=(int)Math.ceil((double)y/10.0);
		   System.out.println(Math.abs(a-b));
		   
		    
		}

	}
}
