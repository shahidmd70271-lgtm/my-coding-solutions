# Spiral Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an `m x n` `matrix`, return  *all elements of the*  `matrix`  *in spiral order*.

 

 **Example 1:** 

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

```

 **Example 2:** 

```
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 10
- -100 <= matrix[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.2 MB (beats 9.39%)  
**Submitted:** 2026-10-08T17:31:25.961Z  

```java
class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        int top=0,left=0;
        int bottom=n-1,right=m-1;
        List<Integer> ans=new ArrayList<>();
        //Min Logic
        while(top<=bottom&&left<=right){
            for(int i=left ;i<=right;i++){
                    ans.add(a[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(a[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(a[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(a[i][left]);
                }
                left++;
            }
        }
        return ans;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/spiral-matrix/)