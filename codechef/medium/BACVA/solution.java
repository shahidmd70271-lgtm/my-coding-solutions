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
		    long n=sc.nextLong();
		    long x=n;
		    long sum=0;
		    while(x>0){
		        long rem=x%10;
		        sum+=rem;
		        x=x/10;
		    }
		    if(sum%10==0){
		        System.out.println("Valid");
		    }else{
		        System.out.println("Invalid");
		    }
		    
		    
		}

	}
}
