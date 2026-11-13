# 3Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

 

Original
Java
 **Example 1:** 

```
Input:int[] nums = new int[]{-1, 0, 1, 2, -1, -4};Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

```

 **Example 2:** 

```
Input:int[] nums = new int[]{0, 1, 1};Output: []
Explanation: The only possible triplet does not sum up to 0.

```

 **Example 3:** 

```
Input:int[] nums = new int[]{0, 0, 0};Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

```

 

 **Constraints:** 

- 3 <= nums.length <= 3000
- -105 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 37 ms (beats 25.25%)  
**Memory:** 58.6 MB (beats 80.92%)  
**Submitted:** 2026-11-13T14:45:19.311Z  

```java
class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        int n=a.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(i>0&&a[i]==a[i-1])
            continue;
            int target=-a[i];
            int l=i+1,h=n-1;
            while(l<h){
                int sum=a[l]+a[h];
                if(sum==target){
                     ans.add(new ArrayList<>(Arrays.asList(a[i],a[l],a[h])));
                    l++;
                    h--;
                    while(l<h&&a[l]==a[l-1])
                    l++;
                    while(l<h&&a[h]==a[h+1])
                    h--;
                }else if(sum>target){
                    h--;
                }else{
                    l++;
                }
            }
        }
        return ans;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/3sum/)