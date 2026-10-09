# Spiral Matrix II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a positive integer `n`, generate an `n x n` `matrix` filled with elements from `1` to `n2` in spiral order.

 

 **Example 1:** 

```
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]

```

 **Example 2:** 

```
Input: n = 1
Output: [[1]]

```

 

 **Constraints:** 

- 1 <= n <= 20

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.6 MB (beats 89.32%)  
**Submitted:** 2026-10-09T13:37:23.371Z  

```java
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a=new int[n][n];
        int top=0,left=0;
        int bottom=n-1,right=n-1;
        int val=1;
        while(top<=bottom&&left<=right){
        // To traverse from left to right
        for(int i=left;i<=right;i++){
            a[top][i]=val++;
        }
        top++;
        for(int i=top;i<=bottom;i++){
            a[i][right]=val++;
        }
        right--;
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                a[bottom][i]=val++;
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                a[i][left]=val++;

            }
            left++;
        }
        
        }
        return a;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/spiral-matrix-ii/)