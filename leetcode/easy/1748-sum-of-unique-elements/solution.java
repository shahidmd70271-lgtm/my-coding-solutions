class Solution {
    public int sumOfUnique(int[] a) {
        int freq[]=new int[101];
        for(int i=0;i<a.length;i++){
            freq[a[i]]++;
        }
        int sum=0;
        for(int i=0;i<101;i++){
            if(freq[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}