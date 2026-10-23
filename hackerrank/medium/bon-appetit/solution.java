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
            int ate=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            int charged=sc.nextInt();
            int total=0;
            for(int i=0;i<n;i++){
                if(i!=ate) total+=a[i];
            }
            int actual=charged-(total/2);
            if(actual==0){
                System.out.println("Bon Appetit");
            }else
            System.out.println(actual);
    }
}
