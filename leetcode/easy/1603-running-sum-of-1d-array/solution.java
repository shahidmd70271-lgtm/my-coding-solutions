class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] r=new int[n];
        r[0]=nums[0];
        //prefix sum logic
        for(int i=1;i<n;i++){
            r[i]=r[i-1]+nums[i];
        }
        return r;
    }
}