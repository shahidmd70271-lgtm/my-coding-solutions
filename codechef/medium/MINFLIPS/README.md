# MINFLIPS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Minimum number of Flips

Chef has an array $A$ of length $N$ consisting of $1$ and $-1$ only.

In one operation, Chef can choose any index $i$ $(1\le i \le N)$ and multiply the element $A_i$ by $-1$.

Find the  **minimum**  number of operations required to make the sum of the array equal to $0$. Output `-1` if the sum of the array cannot be made $0$.

### Input Format
- First line will contain $T$, number of test cases. Then the test cases follow.
- First line of each test case consists of a single integer $N$ denoting the length of the array.
- Second line of each test case contains $N$ space-separated integers $A_1, A_2, \dots, A_N$ denoting the array $A$.
### Output Format

For each test case, output the minimum number of operations to make the sum of the array equal to $0$. Output `-1` if it is not possible to make the sum equal to $0$.

### Constraints
- $1 \leq T \leq 100$
- $2 \leq N \leq 1000$
- $A_i = 1$ or $A_i = -1$
### Sample 1:
Input
Output

```
4
4
1 1 1 1
5
1 -1 1 -1 1
6
1 -1 -1 1 1 1
2
1 -1

```

```
2
-1
1
0

```

### Explanation:

 **Test case $1$:**  The minimum number of operations required is $2$. In the first operation, change $A_3$ from $1$ to $-1$. Similarly, in the second operation, change $A_4$ from $1$ to $-1$. Thus, the sum of the final array is $1+1-1-1=0$.

 **Test case $2$:**  It can be proven that the sum of the array cannot be made equal to zero by making any number of operations.

 **Test case $3$:**  We can change $A_1$ from $1$ to $-1$ in one operation. Thus, the sum of the array becomes $-1-1-1+1+1+1=0$.

 **Test case $4$:**  The sum of the array is already zero. Thus we do not need to make any operations.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T15:02:46.437Z  

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

```

---

[View on CodeChef](https://www.codechef.com/problems/MINFLIPS)