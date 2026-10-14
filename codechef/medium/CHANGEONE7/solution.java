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
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    Arrays.sort(a);
		    int ans=Integer.MAX_VALUE;
		    for(int i=1;i<n;i++){
		        ans=Math.min(ans,a[i]-a[i-1]);
		        
		    }
		    System.out.println(ans);
		    
		}

	}
}
