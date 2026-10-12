# POLYBAGS - Rating 738

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Too many items

Chef bought $N$ items from a shop. Although it is hard to carry all these items in hand, so Chef has to buy some polybags to store these items.

$1$ polybag can contain at most $10$ items. What is the minimum number of polybags needed by Chef?

### Input Format
- The first line will contain an integer $T$ - number of test cases. Then the test cases follow.
- The first and only line of each test case contains an integer $N$ - the number of items bought by Chef.
### Output Format

For each test case, output the minimum number of polybags required.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N \leq 1000$
### Sample 1:
Input
Output

```
3
20
24
99

```

```
2
3
10

```

### Explanation:

 **Test case-1:**  Chef will require $2$ polybags. Chef can fit $10$ items in the first and second polybag each.

 **Test case-2:**  Chef will require $3$ polybags. Chef can fit $10$ items in the first and second polybag each and fit the remaining $4$ items in the third polybag.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T14:18:24.326Z  

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
		     int items=sc.nextInt();
		    int polybag=items/10;
		    if(items%10==0){
		        System.out.println(polybag);
		    }
		    else{
		        System.out.println(polybag+1);
		    }
		    
		    
	    }

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POLYBAGS)