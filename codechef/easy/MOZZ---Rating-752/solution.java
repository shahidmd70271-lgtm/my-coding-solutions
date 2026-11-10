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
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int R=sc.nextInt();
		    int N=R/30;
		    int C=X+N;
		    int D=C/Y;
		    if(C%Y==0)System.out.println(D);
		    else System.out.println(D+1);
		
		    
		}

	}
}
