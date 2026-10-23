# Cats and a Mouse

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Two cats and a mouse are at various positions on a line.  You will be given their starting positions.  Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel at equal speed.  If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.

You are given $q$ queries in the form of $x$, $y$, and $z$ representing the respective positions for cats $A$ and $B$, and for mouse $C$. Complete the function $catAndMouse$ to return the appropriate answer to each query, which will be printed on a new line.

* If cat $A$ catches the mouse first, print ``Cat A``.
* If cat $B$ catches the mouse first, print ``Cat B``.
* If both cats reach the mouse at the same time, print ``Mouse C`` as the two cats fight and mouse escapes.  

**Example**  

$x = 2$  
$y = 5$  
$z = 4$  

The cats are at positions $2$ (Cat A) and $5$ (Cat B), and the mouse is at position $4$.  Cat B, at position $5$ will arrive first since it is only $1$ unit away while the other is $2$ units away.  Return 'Cat B'.  

**Function Description**  

Complete the *catAndMouse* function in the editor below.  

catAndMouse has the following parameter(s):  

- *int x*: Cat $A$'s position  
- *int y*: Cat $B$'s position  
- *int z*: Mouse $C$'s position  

**Returns**  

- *string:*  Either 'Cat A', 'Cat B', or 'Mouse C'

**Input Format**

The first line contains a single integer, $q$, denoting the number of queries. 		
Each of the $q$ subsequent lines contains three space-separated integers describing the respective values of $x$ (cat $A$'s location), $y$ (cat $B$'s location), and $z$ (mouse $C$'s location).

**Constraints**

* $1 \le q \le 100$  
* $1 \le x, y, z \le 100$  

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T15:21:41.964Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int a=Math.abs(z-x);
            int b=Math.abs(z-y);
            if(a<b){
                System.out.println("Cat A");
            }else if(b<a){
                System.out.println("Cat B");
            }else{
                System.out.println("Mouse C");
            }
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/cats-and-a-mouse/problem)