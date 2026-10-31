import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++) {
        a[i]=sc.nextInt();
        map.put(a[i],map.getOrDefault(a[i], 0)+1);
       }
       int count=0;
      // for(int i=0;i<n;i++){
        //if(map.get(a[i])%2!=0 ){
          //  count++;
        //}
        
       //}
       for(int i:map.values()){
            count+=(i/2);
        
       }
       System.out.println(count);
       
    }
}
