class Solution {
    public int[] maxProductPair(int[] a, int target) {
        int n=a.length;
        int[] ans=new int[n];
        int i1=-1,i2=-1;
        int product=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=a[i]+a[j];
                
            if(sum==target&&a[i]>a[j]){
                int p=a[i]*a[j];
                    if(p>product){
                    product=p;
                    i1=i;
                    i2=j;
                    }
                
                
            }
            }
        }
        return new int[]{i1,i2};
    }
}