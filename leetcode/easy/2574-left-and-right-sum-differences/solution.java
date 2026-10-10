class Solution {
    public int[] leftRightDifference(int[] a) {
        int n=a.length;
        int sum=0,leftsum=0;
        int[] ans=new int[n];
        //Total sum
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        // removing the current element and finding the sum
        for(int i=0;i<n;i++){
            sum-=a[i];
            ans[i]=Math.abs(sum-leftsum);
            leftsum+=a[i];
        }
        return ans;
    }
}