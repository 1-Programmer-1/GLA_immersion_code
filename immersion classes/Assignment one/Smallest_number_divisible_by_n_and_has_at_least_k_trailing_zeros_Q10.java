public class Smallest_number_divisible_by_n_and_has_at_least_k_trailing_zeros_Q10 {
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long solve(long n, long k) {
        long r = (long) Math.pow(10, k);
        long res = gcd(r, n);
        return (r * n) / res;
    }

    public static void main(String[] args) {

        System.out.println(solve(30, 3));

    }

}
