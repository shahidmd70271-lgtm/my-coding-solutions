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
		    int x=sc.nextInt();
		    int p=sc.nextInt();
		    int correct=x*3;
		    int incorrect=(n-x)*(1);
		    int total=correct-incorrect;
		    if(total>=p){
		        System.out.println("PASS");
		    }else{
		        System.out.println("FAIL");
		    }
		    
		    
		}

	}
}
