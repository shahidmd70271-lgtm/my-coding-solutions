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
		     int items=sc.nextInt();
		    int polybag=items/10;
		    if(items%10==0){
		        System.out.println(polybag);
		    }
		    else{
		        System.out.println(polybag+1);
		    }
		    
		    
	    }

	}
}
