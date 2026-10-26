import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i + 1 < s.length() && s.charAt(i + 1) == '#') {
                res += (char) ('z' - (ch - 'o'));
                i++;
            } else {
                res += (char) ('n' - (ch - 'a'));
            }
        }

        System.out.println(res);
    }
}