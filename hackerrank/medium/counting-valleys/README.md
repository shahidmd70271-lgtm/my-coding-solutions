# Counting Valleys

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly $steps$ steps, for every step it was noted if it was an *uphill*, $U$, or a *downhill*, $D$ step. Hikes always start and end at sea level, and each step up or down represents a $1$ unit change in altitude. We define the following terms:

- A *mountain* is a sequence of consecutive steps *above* sea level, starting with a step *up* from sea level and ending with a step *down* to sea level.  
- A *valley* is a sequence of consecutive steps *below* sea level, starting with a step *down* from sea level and ending with a step *up* to sea level.

Given the sequence of *up* and *down* steps during a hike, find and print the number of *valleys* walked through. 

**Example**  

$steps = 8$
$path=[DDUUUUDD]$  

The hiker first enters a valley $2$ units deep.  Then they climb out and up onto a mountain $2$ units high.  Finally, the hiker returns to sea level and ends the hike.  

**Function Description**  

Complete the *countingValleys* function in the editor below.  

countingValleys has the following parameter(s):  

- *int steps*: the number of steps on the hike  
- *string path*: a string describing the path  

**Returns**  

- *int:*  the number of valleys traversed 

**Input Format**

The first line contains an integer $steps$, the number of steps in the hike. 	
The second line contains a single string $path$, of $steps$ characters that describe the path.

**Constraints**

- $2 \leq steps \leq 10^6$  
- $path[i] \in \{UD\}$

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T15:40:08.604Z  

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
        String s=sc.next();
        int up=0,level=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='U'){
                up++;
                if(up==0){
                    level++;
                }
            }else{
                up--;
            }
        }
        System.out.println(level);




    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/counting-valleys/problem)