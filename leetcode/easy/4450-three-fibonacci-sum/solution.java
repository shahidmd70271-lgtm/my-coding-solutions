class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0,b=1,c=1;
        while(c<=n){
            int sum=a+b+c;
            if(sum==n){
                return true;
            }else if(sum>n){
                return false;
            }else{
                a=b;
                b=c;
                c=a+b;
            }
        }
        return false;
    }
}