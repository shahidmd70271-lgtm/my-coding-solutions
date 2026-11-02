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
		    for(int i=0;i<n;i++) a[i]=sc.nextInt();
		    Arrays.sort(a);
		    int ans=0;
		    for(int i=0;i<n;i++){
		        int count=0;
		       for(int j=0;j<n;j++){
		           if(a[j]<=a[i]){
		               count++;
		           }
		       }
		       if(count>n-count){
		           ans++;
		       }
		    }
		    System.out.println(ans);
		    
		    
		}

	}
}
