import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int b=sc.nextInt();
     int n=sc.nextInt();
     int m=sc.nextInt();
     int key[]=new int[n];
     int usb[]=new int[m];
     for(int i=0;i<n;i++) key[i]=sc.nextInt();
     for(int i=0;i<m;i++) usb[i]=sc.nextInt();
     int count=0,max=0;
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            int total=key[i]+usb[j];
            if(total>=max&&total<=b){
                max=total;
                count++;
            }
        }
     }
     if(count==0){
        System.out.println(-1);
     }else{
        System.out.println(max);
     }
    }
}
