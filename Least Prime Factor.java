class Solution
{
    public int[] leastPrimeFactor(int n)
    {
        int[] primes = new int[n + 1];
        primes[1] = 1;  // Special case for 1

        // Mark all numbers greater than 1 as potential primes
        for (int i = 2; i <= n; i++) {
            if (primes[i] == 0) {  // Found a potential prime
                primes[i] = i;  // The least prime factor of i is i itself

                // Mark multiples of i as non-prime
                for (int j = i * i; j <= n; j += i) {
                    if (primes[j] == 0) {  // Only update if not previously marked
                        primes[j] = i;
                    }
                }
            }
        }
        return primes;
    }
}

//Time Complexity : O(NlogN)
//Space Complexity : O(N)
