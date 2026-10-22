# MOZZ - Rating 745

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T10:24:39.791Z  

```java
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
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int count=2;
		    if((x==a||x==b)&(y==a||y==b)){
		        count=0;
		    }
		    else if(x==a||x==b){
		        count--;
		    }else if(y==a||y==b){
		        count--;
		    }else{
		        
		    }
		    System.out.println(count);
		    
		    
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MOZZ)