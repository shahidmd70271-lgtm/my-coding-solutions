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
		    int n=sc.nextInt();
		    int x=n;
		    int sum=0;
		    while(x>0){
		        int rem=x%10;
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
