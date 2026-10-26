import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String res="";
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch>='a'&&ch<='n'){
		        res=(String)('n'-(ch-'a') );
		    }
		    if(ch>='o'&&ch<='z'){
		        i++;
		        res=(String)('z'-(ch-'o'));
		    }
		}
		System.out.println(res);
		

	}
}
