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