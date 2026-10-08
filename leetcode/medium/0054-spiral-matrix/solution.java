class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        //Intializing Variables
        int n=a.length;
        int m=a[0].length;
        int top=0,left=0;
        int bottom=n-1,right=m-1;
        List<Integer> ans=new ArrayList<>();
        //Min Logic
        while(top<=bottom&&left<=right){
            //To travers Left to Right
            for(int i=left ;i<=right;i++){
                    ans.add(a[top][i]);
            }
            top++;
            //To go from Top to Bottom
            for(int i=top;i<=bottom;i++){
                ans.add(a[i][right]);
            }
            right--;
            //To go from Right to Left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(a[bottom][i]);
                }
                bottom--;
            }
            //To go from Bottom to Top
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