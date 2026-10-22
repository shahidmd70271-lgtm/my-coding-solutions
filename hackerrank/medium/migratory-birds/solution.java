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
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int freq[]=new int[6];
        for (int i = 0; i < n; i++) {
         freq[a[i]]++;
        }   

        int max = 0, bird = 0;

        for (int i = 1; i <= 5; i++) {
            if (freq[i] > max) {
                max = freq[i];
                    bird = i;
                }
            }   

            System.out.println(bird);
        }
        
        
        








    }
