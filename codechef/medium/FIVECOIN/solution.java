import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int coin=0;
		if(n>=5){
		    coin++;
		    n=n-5;
		}
		
		while(n-- >0){
		    coin++;
		}
		System.out.println(coin);
		

	}
}
