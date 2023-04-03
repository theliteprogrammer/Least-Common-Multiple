import java.util.Scanner;

public class Main {
    private static long lcm_naive(int a, int b) {
        for (long l = 1; l <= (long) a * b; ++l)
            if (l % a == 0 && l % b == 0)
                return l;

        return (long) a * b;
    }

    /**
     *
     * @param a - first number / numerator
     * @param b - second number / denominator
     * @return
     */
    private static long lcm_fast(int a, int b){
        //lcm(a,b)=|ab|gcd(a,b)
        return Math.abs((long) a * b) / gcd_fast(a, b);
    }

    /**
     *
     * @param a - numerator
     * @param b - denominator
     * @return
     */
    private static long gcd_fast(int a, int b){
        // base case
        if(b == 0){
            return a;
        }
        // calculate the remainder
        int a_prime = a % b;
        return gcd_fast(b, a_prime);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(lcm_fast(a, b));
    }
}