# DECINC - Rating 718

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T13:42:54.095Z  

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
		while(t-- >0){
		double a=sc.nextInt();
	    double x=sc.nextInt();
		double b=sc.nextInt();
		double y=sc.nextInt();
		if((a/x)>(b/y)){
        System.out.println("Alice");
		}else if((a/x)==(b/y)){
		    System.out.println("Equal");
		}else{
		    System.out.println("BOb");
		}
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DECINC)