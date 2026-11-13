class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        int n=a.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(i>0&&a[i]==a[i-1])
            continue;
            int target=-a[i];
            int l=i+1,h=n-1;
            while(l<h){
                int sum=a[l]+a[h];
                if(sum==target){
                     ans.add(new ArrayList<>(Arrays.asList(a[i],a[l],a[h])));
                    l++;
                    h--;
                    while(l<h&&a[l]==a[l-1])
                    l++;
                    while(l<h&&a[h]==a[h+1])
                    h--;
                }else if(sum>target){
                    h--;
                }else{
                    l++;
                }
            }
        }
        return ans;
        
    }
}