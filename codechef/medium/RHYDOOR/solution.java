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
		    String s=sc.next();
		    int current=0,count=0;
		    char last=' ';
		    for(int i=0;i<n;i++){
		        char c=s.charAt(i);
		        if(c==last){
		            current++;
		        }else{
		            last=c;
		           current=1;
		        }
		        if(current==3){
		            count++;
		            current=0;
		            last=' ';
		        }
		    }
		   
		    System.out.println(count);
		    
		}

	}
}
