import java.io.*;

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            System.out.println(sum % 10 == 0 ? "Valid" : "Invalid");
        }
    }
}