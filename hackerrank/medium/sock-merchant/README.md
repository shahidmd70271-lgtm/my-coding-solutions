# Sales by Match

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

**Example**   
$n = 7$   
$ar = [1, 2, 1, 2, 1, 3, 2]$   

There is one pair of color $1$ and one of color $2$.  There are three odd socks left, one of each color.  The number of pairs is $2$.  

**Function Description**  

Complete the *sockMerchant* function in the editor below.     

sockMerchant has the following parameter(s):  

- *int n:* the number of socks in the pile   
- *int ar[n]:* the colors of each sock   

**Returns**   

- *int:* the number of pairs   

**Input Format**

The first line contains an integer $n$, the number of socks represented in $ar$. 		
The second line contains $n$ space-separated integers, $ar[i]$, the colors of the socks in the pile.

**Constraints**

* $1 \le n \le 100$
* $1 \le ar[i] \le 100$ where $0 \le i < n$


**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T15:15:17.181Z  

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
       int a[]=new int[n];
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++) {
        a[i]=sc.nextInt();
        map.put(a[i],map.getOrDefault(a[i], 0)+1);
       }
       int count=0;
      // for(int i=0;i<n;i++){
        //if(map.get(a[i])%2!=0 ){
          //  count++;
        //}
        
       //}
       for(int i:map.values()){
            count+=(i/2);
        
       }
       System.out.println(count);
       
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/sock-merchant/problem)