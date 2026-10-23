# Divisible Sum Pairs

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers and a positive integer $k$, determine the number of $(i, j)$ pairs where $i \lt j$ and $ar[i]$ + $ar[j]$ is divisible by $k$.  

**Example**  

$ar = [1, 2, 3, 4, 5, 6]$   
$k = 5$   

Three pairs meet the criteria:  $[1, 4], [2, 3],$ and $[4, 6]$.  

**Function Description**

Complete the *divisibleSumPairs* function in the editor below.   

divisibleSumPairs has the following parameter(s):  

- *int n:* the length of array $ar$  
- *int ar[n]:* an array of integers  
- *int k:* the integer divisor   

**Returns**  
-	*int:* the number of pairs  

**Input Format**

The first line contains $2$ space-separated integers, $n$ and $k$.	
The second line contains $n$ space-separated integers, each a value of $arr[i]$.  



**Constraints**

* $2 \leq n \leq 100$
* $1 \leq k \leq 100$
* $1 \leq ar[i] \leq 100$

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T06:27:58.795Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((a[i]+a[j])%k==0 ){
                    count++;
                }
            }
        }
            System.out.println(count);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/divisible-sum-pairs/problem)