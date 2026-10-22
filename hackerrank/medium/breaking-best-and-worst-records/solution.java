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
       for(int i=00;i<n;i++){
        a[i]=sc.nextInt();
       }
       int min=a[0];
       int max=a[0];
       int maxcount=0,mincount=0;
       for(int i=1;i<n;i++){
        if(a[i]>max){
            maxcount++;
            max=a[i];
        }
        if(a[i]<min){
            mincount++;
            min=a[i];
        }
       }
       System.out.println(maxcount+" "+mincount);
       
           }
}
