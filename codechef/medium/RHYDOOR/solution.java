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
		    int counta=0,countb=0;
		    for(int i=0;i<n;i++){
		        char c=s.charAt(i);
		        if(c=='A'){
		            counta++;
		        }else{
		            countb++;
		        }
		    }
		    int count=0;
		    if(counta%3==0){
		        count+=counta/3;
		    }
		    if(countb%3==0){
		        count+=countb/3;
		    }
		    System.out.println(count);
		    
		}

	}
}
