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
        String s=sc.next();
        int up=0,level=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='U'){
                up++;
                if(up==0){
                    level++;
                }
            }else{
                up--;
            }
        }
        System.out.println(level);




    }
}
