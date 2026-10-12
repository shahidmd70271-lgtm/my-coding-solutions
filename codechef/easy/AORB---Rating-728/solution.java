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
		    int a=(500-(x*2))+(1000-(x+y)*4);
		    int b=((1000-(y*4))+(500-(x+y)*2));
		    System.out.println(Math.max(a,b));
		    
		}

	}
}
