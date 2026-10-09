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