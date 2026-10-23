import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int a=Math.abs(z-x);
            int b=Math.abs(z-y);
            if(a<b){
                System.out.println("Cat A");
            }else if(b<a){
                System.out.println("Cat B");
            }else{
                System.out.println("Mouse C");
            }
        }
    }
}
