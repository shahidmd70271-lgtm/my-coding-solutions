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
		    int x=0;
		    int sum=0;
		    for(int i=0;i<n;i++){
		      a[i]=sc.nextInt();
		      sum+=a[i];
		      if(a[i]==1)
		      x++;
		    } 
		    if(sum==0){
		        System.out.println(0);
		    }
		    else if(n%2!=0){
		        System.out.println(-1);
		    }
		    else{
		        int ans=Math.abs(sum)/2;
		        System.out.println(ans);
		    }
		    
		    
		}

	}
}
