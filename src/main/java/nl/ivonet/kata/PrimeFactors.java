package nl.ivonet.kata;

import java.util.ArrayList;
import java.util.List;

/**
 * Code Rulez extracted from TDD:
 * - 0 and 1 have no prime factors because they can not be created by multiplication of primes
 * - if devide < 2 then empty list
 * - 8, 6, 4, and 2 have the same multiplication factor and can therefore be reduced.
 * - the devide factor can never be greater then input
 * - so start devinding by 2 and add 1 when not possible anymore... lets try it out.
 */
public class PrimeFactors {
    public List<Integer> process(final int input) {
        int primefactor = input;
        final List<Integer> factors = new ArrayList<Integer>();

        for (int i = 2; i < input; i++) {
            while ((primefactor % i) == 0) {
                factors.add(i);
                primefactor /= i;
            }
        }
        if (primefactor > 1) {
            factors.add(primefactor);
        }
        return factors;
    }
}
