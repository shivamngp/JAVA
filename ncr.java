public class ncr {

    static int MOD = 1000000007;

    // Function to calculate the modular inverse using extended Euclidean algorithm
    static long modInverse(long a, long m) {
        long m0 = m;
        long y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1) {
            long q = a / m;
            long t = m;

            m = a % m;
            a = t;
            t = y;

            y = x - q * y;
            x = t;
        }

        if (x < 0)
            x += m0;

        return x;
    }

    // Function to calculate factorial modulo MOD using dynamic programming
    static long factorialModulo(int n) {
        long[] fact = new long[n + 1];
        fact[0] = 1;

        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        return fact[n];
    }

    // Function to calculate nCr modulo MOD
    static long nCrModulo(int n, int r) {
        if (r == 0 || r == n)
            return 1;

        long numerator = factorialModulo(n);
        long denominator = (factorialModulo(r) * factorialModulo(n - r)) % MOD;

        long inverseDenominator = modInverse(denominator, MOD);

        return (numerator * inverseDenominator) % MOD;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        long result = nCrModulo(n, r);
        System.out.println("nCr modulo MOD: " + result); // Output: nCr modulo MOD: 10
    }
}
