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
        int a[]=new int[26];
        for(int i=0;i<26;i++){
            a[i]=sc.nextInt();
        }
        String s=sc.next();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            max=Math.max(max,a[ch-'a']);
        }
        int ans=max*s.length();
        System.out.println(ans);



    }
}
