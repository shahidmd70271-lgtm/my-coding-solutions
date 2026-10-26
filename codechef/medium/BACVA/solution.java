import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();
            int sum = 0;

            for (int i = 0; i < n.length(); i++) {
                sum += n.charAt(i) - '0';
            }

            System.out.println(sum % 10 == 0 ? "Valid" : "Invalid");
        }
        sc.close();
    }
}