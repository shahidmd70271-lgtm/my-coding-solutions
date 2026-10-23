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
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int apples[]=new int[m];
        int oranges[]=new int[n];
        int a1=0,b1=0;
        for(int i=0;i<m;i++){
            apples[i]=sc.nextInt();
            apples[i]=a+apples[i];
            if(apples[i]>=s&&apples[i]<=t){
                a1++;
            }
        }
        for(int i=0;i<n;i++){
        oranges[i]=sc.nextInt();
        oranges[i]=b+oranges[i];
        if(oranges[i]>=s&&oranges[i]<=t){
            b1++;
        }
        }
        System.out.println(a1);
        System.out.println(b1);
        
        


    }
}
