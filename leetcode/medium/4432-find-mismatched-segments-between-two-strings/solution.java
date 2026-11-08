class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans=new ArrayList<>();
        String a="",b="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                a+=s1.charAt(i);
                b+=s2.charAt(i);
            }else{
                if(!a.isEmpty()){
                    ans.add(Arrays.asList(a,b));
                        a="";
                    b="";
                }
            }
        }
        if(!a.isEmpty()){
            ans.add(Arrays.asList(a,b));
        }
        return ans;
    }
}