class Solution {
    public int peakValleyDifference(int[] a) {
        int n=a.length;
        int peak=0,valley=0;
        for(int i=0;i<n;i++){
            if(i>0&&i<n-1){
                if(a[i]>a[i-1]&&a[i]>a[i+1]){
                    peak=peak+a[i];
                }
                if(a[i]<a[i-1]&&a[i]<a[i+1]){
                    valley+=a[i];
                }
            }
        }
        return (peak-valley);
        
    }
}