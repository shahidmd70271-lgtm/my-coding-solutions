class Solution {
    public int minDeletions(int[] nums) {
        int count=0,prev=-1;
        for(int num : nums){
            if(num==prev){
                count++;
            }else{
                prev=num;
            }
        }
  return count;      
    }
}